package aula05;

public class ContaAplicada {

	public static void main(String[] args) {
		ContaBanco c1 = new ContaBanco();
		
		c1.setNumConta(1111);
		c1.setDono("Jubileu");
		c1.abrirConta("CC");
		c1.depositar(100);
		
		
		ContaBanco c2 = new ContaBanco();
		c2.setNumConta(1112);
		c2.setDono("Creuza");
		c2.abrirConta("CP");
		c2.depositar(500);
		c2.sacar(100);
		c1.sacar(150);
		c1.fecharConta();
		
		
		c1.statusDaConta();
		c2.statusDaConta();
	}

}
