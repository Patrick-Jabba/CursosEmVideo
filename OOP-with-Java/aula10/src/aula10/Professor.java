package aula10;

public class Professor extends Pessoa {
	private String areaEnsino;
	private double salario;
	
	public void receberAumento(double aum) {
		this.salario += aum;
	}

	public String getAreaEnsino() {
		return areaEnsino;
	}

	public void setAreaEnsino(String areaEnsino) {
		this.areaEnsino = areaEnsino;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}
		
}
