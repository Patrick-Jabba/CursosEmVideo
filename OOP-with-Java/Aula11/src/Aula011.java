
public class Aula011 {

	public static void main(String[] args) {
		//Pessoa p1 = new Pessoa();
		
		Visitante v1 = new Visitante();
		v1.setNome("Juvenal");
		v1.setIdade(22);
		v1.setSexo("M");
		
		System.out.println(v1.toString());
		
		Aluno a1 = new Aluno();
		a1.setNome("Claudio");
		a1.setMatricula(123123);
		a1.setIdade(22);
		a1.setCurso("Informatica");
		a1.setSexo("M");
		System.out.println(a1.toString());
		a1.pagarMensalidade();
		
		Bolsista b1 = new Bolsista();
		b1.setMatricula(111);
		b1.setNome("Ana Luiza");
		b1.setBolsa(12.5f);
		b1.setSexo("F");
		System.out.println(b1.toString());
		b1.pagarMensalidade();
	}

}
