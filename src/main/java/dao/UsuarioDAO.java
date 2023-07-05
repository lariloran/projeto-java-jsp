package dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.TypedQuery;

import classes.Usuario;

public class UsuarioDAO {
	private EntityManager em;

	public UsuarioDAO() {
	}

	public boolean salvar(Usuario user) {
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

	public boolean atualizar(Usuario p) {
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
			Usuario entity = em.find(Usuario.class, id);
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

	public Usuario buscarID(Long id) {
		try {
			em = JPAUtil.getEntityManager();
			Usuario usuario = em.find(Usuario.class, id);
			return usuario;
		} catch (RuntimeException e) {
			if (em.getTransaction().isActive()) {
				em.getTransaction().rollback();
			}
			return null;
		} 
	}

	public List<Usuario> buscarTodos() {
		try {
			em = JPAUtil.getEntityManager();
			TypedQuery<Usuario> query = em.createQuery("SELECT obj FROM Usuario obj", Usuario.class);
			List<Usuario> Usuarios = query.getResultList();
			return Usuarios;
		} catch (RuntimeException e) {
			//e.printStackTrace();
			return null;
		} 
	}
	
	public Usuario buscarPorEmailESenha(String email, String senha) {
	    try {
	        em = JPAUtil.getEntityManager();
	        TypedQuery<Usuario> query = em.createQuery("SELECT obj FROM Usuario obj WHERE obj.email = :email AND obj.senha = :senha", Usuario.class);
	        query.setParameter("email", email);
	        query.setParameter("senha", senha);
	        return query.getSingleResult();
	    } catch (NoResultException e) {
	        return null;
	    } catch (RuntimeException e) {
	        //e.printStackTrace();
	        return null;
	    }
	}

	
}
