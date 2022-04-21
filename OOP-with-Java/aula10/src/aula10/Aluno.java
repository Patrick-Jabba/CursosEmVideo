package aula10;

public class Aluno extends Pessoa {
	private Integer matr;
	private String curso;
	
	public void cancelarMatr() {
		System.out.println("Matricula sera cancelada");
	}

	public Integer getMatr() {
		return matr;
	}

	public void setMatr(Integer matr) {
		this.matr = matr;
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}
	
	
	
}
