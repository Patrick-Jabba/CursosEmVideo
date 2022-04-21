package aula04;

public class Aula04 {

	public static void main(String[] args) {
		Caneta c1 = new Caneta ("NIC", 0.5f, "Roxa", true);
		//c1.setModelo("BIC");
		//c1.modelo = "BIC";
		//c1.setPonta(0.5f);
// como ponta é PRIVADO não podemos acessar diretamente 
// mas através do metodo setPont c1.ponta = 0.5f;
		c1.status();
		
		
		Caneta c2 = new Caneta ("KKK", 1.0f, "Amarela", false);
		c2.status();
	}

}
