package dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import classes.Programador;

public class ProgramadorDAO {
	private EntityManager em;

	public ProgramadorDAO() {
	}

	public boolean salvar(Programador user) {
		try {
			em = JPAUtil.getEntityManager();
			em.getTransaction().begin();
			em.persist(user);
			em.getTransaction().commit();
			return true;
		} catch (RuntimeException e) {
			if (em.getTransaction().isActive()) {
				em.getTransaction().rollback();
			}
			return false;
		}
	}

	public boolean atualizar(Programador p) {
		try {
			em = JPAUtil.getEntityManager();
			em.getTransaction().begin();
			em.merge(p);
			em.getTransaction().commit();
			return true;
		} catch (RuntimeException e) {
			if (em.getTransaction().isActive()) {
				em.getTransaction().rollback();
			}
			return false;
		} 
	}

	public boolean remover(Long id) {
		try {
			em = JPAUtil.getEntityManager();
			em.getTransaction().begin();
			Programador entity = em.find(Programador.class, id);
			em.remove(entity);
			em.getTransaction().commit();
			return true;
		} catch (RuntimeException e) {
			if (em.getTransaction().isActive()) {
				em.getTransaction().rollback();
			}
			return false;
		} 
	}

	public Programador buscarID(Long id) {
		try {
			em = JPAUtil.getEntityManager();
			Programador Programador = em.find(Programador.class, id);
			return Programador;
		} catch (RuntimeException e) {
			if (em.getTransaction().isActive()) {
				em.getTransaction().rollback();
			}
			return null;
		} 
	}

	public List<Programador> buscarTodos() {
		try {
			em = JPAUtil.getEntityManager();
			TypedQuery<Programador> query = em.createQuery("SELECT obj FROM Programador obj", Programador.class);
			List<Programador> Programadors = query.getResultList();
			return Programadors;
		} catch (RuntimeException e) {
			//e.printStackTrace();
			return null;
		} 
	}
}
