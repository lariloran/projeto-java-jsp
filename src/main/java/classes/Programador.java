package classes;

import classes.Funcionario;
import dao.ProgramadorDAO;

import java.io.Serializable;
import java.util.List;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: Programador
 *
 */
@Entity
@PrimaryKeyJoinColumn(name = "idProgramador", referencedColumnName =
"idFuncionario")
public class Programador extends Funcionario implements Serializable {

	 
	private static final long serialVersionUID = 1L;
	private String linguagemProg;
	private String projetos;

	public Programador() {
		super();
	}

	public Programador(String linguagemProg, String projetos) {
		super();
		this.linguagemProg = linguagemProg;
		this.projetos = projetos;
	}



	public String getLinguagemProg() {
		return linguagemProg;
	}

	public void setLinguagemProg(String linguagemProg) {
		this.linguagemProg = linguagemProg;
	}

	public String getProjetos() {
		return projetos;
	}

	public void setProjetos(String projetos) {
		this.projetos = projetos;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public String toString() {
		return "Programador [linguagemProg=" + linguagemProg + ", projetos=" + projetos + "]";
	}
	public boolean salvar() {
		//manda salvar o objeto atual
		return new ProgramadorDAO().salvar(this);
	}
	public List<Programador> buscarTodos(){
		return new ProgramadorDAO().buscarTodos();
	}
	public boolean atualizar(){
		//manda editar/atualizar o objeto atual
		return new ProgramadorDAO().atualizar(this);
	}
	public boolean remover(){
		return new ProgramadorDAO().remover(this.getIdFuncionario());
	}
	public Programador buscarID(){
		return new ProgramadorDAO().buscarID(this.getIdFuncionario());
	}
   
}
