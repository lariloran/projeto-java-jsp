package classes;

import java.io.Serializable;
import javax.persistence.*;

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
   
}
