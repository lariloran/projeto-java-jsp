package classes;

import java.io.Serializable;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: Funcionario
 *
 */
@Entity
@Inheritance(strategy=InheritanceType.JOINED)
public class Funcionario implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="idFuncionario")
	private Long idFuncionario;
	private String Nome;
	private String endereco;
	private String email;
	private double salario;
	private String cpf;

	private static final long serialVersionUID = 1L;

	public Funcionario() {
		super();
	}   

	public Long getIdFuncionario() {
		return idFuncionario;
	}

	public void setIdFuncionario(Long idFuncionario) {
		this.idFuncionario = idFuncionario;
	}

	public String getNome() {
		return Nome;
	}

	public void setNome(String nome) {
		Nome = nome;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public String toString() {
		return "Funcionario [idFuncionario=" + idFuncionario + ", Nome=" + Nome + ", endereco=" + endereco + ", email="
				+ email + ", salario=" + salario + ", cpf=" + cpf + "]";
	}
   
}
