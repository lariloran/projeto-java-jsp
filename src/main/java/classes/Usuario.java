package classes;

import java.io.Serializable;
import java.util.List;

import javax.persistence.*;

import dao.UsuarioDAO;

/**
 * Entity implementation class for Entity: Usuário
 *
 */
@Entity

public class Usuario implements Serializable {

	
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idUsuario;
	private String email;
	private String senha;
	
	public Usuario() {
		super();
	}


	public Long getIdUsuario() {
		return idUsuario;
	}


	public void setIdUsuario(Long idUsuario) {
		this.idUsuario = idUsuario;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getSenha() {
		return senha;
	}


	public void setSenha(String senha) {
		this.senha = senha;
	}


	public static long getSerialversionuid() {
		return serialVersionUID;
	}


	@Override
	public String toString() {
		return "Usuario [email=" + email + ", senha=" + senha + "]";
	}
	public boolean salvar() {
		//manda salvar o objeto atual
		return new UsuarioDAO().salvar(this);
	}
	public List<Usuario> buscarTodos(){
		return new UsuarioDAO().buscarTodos();
	}
	public boolean atualizar(){
		//manda editar/atualizar o objeto atual
		return new UsuarioDAO().atualizar(this);
	}
	public boolean remover(){
		return new UsuarioDAO().remover(this.getIdUsuario());
	}
	public Usuario buscarID(){
		return new UsuarioDAO().buscarID(this.getIdUsuario());
	}
	public Usuario buscarPorEmailESenha(){
		return new UsuarioDAO().buscarPorEmailESenha(this.getEmail(), this.getSenha());
	}
	
}
