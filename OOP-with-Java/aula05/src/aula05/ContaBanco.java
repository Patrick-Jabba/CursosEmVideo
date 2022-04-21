//	+numConta
//	#tipo
//	-dono
//	-saldo
//	-status

package aula05;
public class ContaBanco {
//		Atributo
		public int numConta;
		protected String tipo;
		private String dono;
		private float saldo;
		private boolean status;
		
//		Métodos Personalizados:
	
		public void abrirConta(String t) {
			this.setTipo(t);
			this.setStatus(true);
			if (t.equals("CC")) {
				this.setSaldo(50);
			}else if (t.equals("CP")) {
				this.setSaldo(150);
			}
			System.out.println("Conta aberta com sucesso!");
		}
		public void fecharConta() {
			if (this.getSaldo() > 0) {
				System.out.println("Conta nao pode ser fechada porque ainda tem valores");
			}else if (this.getSaldo() < 0) {
				System.out.println("Conta nao pode ser fechada pois há débito.");
			}else {
				this.setStatus(false);
				System.out.println("Conta fechada com sucesso!");
			}
		}
		public void depositar(float v) {
			if (this.getStatus()) {
				//this.saldo = this.saldo + v; assim mexeria direto no atributo
				this.setSaldo(this.getSaldo()+ v);
				System.out.println("Deposito realizado na conta de " + this.getDono());
			}else {
				System.out.println("Impossivel depositar em uma conta fechada!");
			}
		}
		public void sacar(float v) {
			if (this.getStatus()) {
				if (this.getSaldo() > v) {
					this.setSaldo(this.getSaldo() - v);
					System.out.println("Saque realizado de " + this.getDono());
				}else {
					System.out.println("Saldo insuficiente para saque.");
				}
			}else {
				System.out.println("Impossivel sacar de uma conta fechada!");
			}
	
		}
		public void pagarMensal() {
			int v = 0;
			if (this.getTipo().equals("CC")) {
				v = 12;
			}else if (this.getTipo().equals("CP")) {
				v = 20;
			}
			if (this.getStatus()) {
				this.setSaldo(this.getSaldo() - v);
				System.out.println("Mensalidade paga com sucesso por " + this.getDono());
			} else {
				System.out.println("Conta encerrada nao ha mensalidade a ser paga.");
			}
		}
		
// 		Métodos Especiais:	
	  /*Método Construtor*/
		public ContaBanco() {
		}

		public int getNumConta() {
			return numConta;
		}

		public void setNumConta(int numConta) {
			this.numConta = numConta;
		}

		public String getTipo() {
			return tipo;
		}

		public void setTipo(String tipo) {
			this.tipo = tipo;
		}

		public String getDono() {
			return dono;
		}

		public void setDono(String dono) {
			this.dono = dono;
		}

		public float getSaldo() {
			return saldo;
		}

		public void setSaldo(float saldo) {
			this.saldo = saldo;
		}

		public boolean getStatus() {
			return status;
		}

		public void setStatus(boolean status) {
			this.status = status;
		}
		
		public void statusDaConta() {
			System.out.println("CONTA BANCO");
			System.out.println("-------------------------");
			System.out.println("Numero da conta: " + this.getNumConta());
			System.out.println("Tipo de conta: " + this.getTipo());
			System.out.println("Dono da conta: " + this.getDono());
			System.out.println("Saldo da conta: " + this.getSaldo());
			System.out.println("Status da conta: " + this.getStatus());
		}
		
		

}
