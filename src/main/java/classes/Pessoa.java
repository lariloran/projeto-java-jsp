package classes;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import dao.PessoaDAO;

@Entity
public class Pessoa implements Serializable{
	private static final long serialVersionUID = 1L;
    @Id 
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idPessoa;
	private String nome;
	private String endereco;
	
	public Pessoa(){}
	public Pessoa(String nome, String endereco){ 
		this.nome = nome; 
		this.endereco = endereco;
	}
	public Pessoa(Long idPessoa, String nome, String endereco) {
		super();
		this.idPessoa = idPessoa;
		this.nome = nome;
		this.endereco = endereco;
	}
	
	public void setNome(String nome){ this.nome = nome; }
	public String getNome(){return nome;}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public Long getIdPessoa() {
		return idPessoa;
	}
	public void setIdPessoa(Long idPessoa) {
		this.idPessoa = idPessoa;
	}

	@Override
	public String toString() {
		return "Pessoa [nome=" + nome + ", endereco=" + endereco + "]" + idPessoa;
	}
	public boolean salvar() {
		//manda salvar o objeto atual
		return new PessoaDAO().salvar(this);
	}
	public List<Pessoa> buscarTodos(){
		return new PessoaDAO().buscarTodos();
	}
	public boolean atualizar(){
		//manda editar/atualizar o objeto atual
		return new PessoaDAO().atualizar(this);
	}
	public boolean remover(){
		return new PessoaDAO().remover(this.getIdPessoa());
	}
	public Pessoa buscarID(){
		return new PessoaDAO().buscarID(this.getIdPessoa());
	}
}
