package ContaBanco;

public class conta {
	public int numConta;
	protected String tipo;
	private String dono;
	private float saldo;
	private boolean status;

	
	public void estadoAtual() {
		System.out.println("-----------------------------");
		System.out.println("Conta: " + this.getNumConta());
		System.out.println("Tipo: " + this.getTipo());
		System.out.println("Dono: " + this.getDono());
		System.out.println("Saldo: " + this.getSaldo());
		System.out.println("Status: " + this.GetStatus());
	}
	
	
	public void abrirConta(String t) {
		this.setTipo(t);
		this.setStatus(true);
		if (t == "CC") {
			this.setSaldo(50);
			System.out.println("Conta aberta com sucesso!");
		} else if (t == "CP") {
			this.setSaldo(150);
			System.out.println("Conta aberta com sucesso!");
		}
		
	}

	public void fecharConta() {
		if (this.getSaldo() > 0) {
			System.out.println("Conta não pode ser fechada porque ainda tem dinheiro");
		} else if (this.getSaldo() < 0) {
			System.out.println("Conta não pode ser fechada no negativo");
		} else {
			this.setStatus(false);
			System.out.println("Sua conta foi fechada com sucesso");
		}
	}

	public void depositar(float v) {
		if (this.GetStatus()) {
			this.setSaldo(this.getSaldo() + v);
			System.out.println("Depósito realizado na conta de " + this.getDono());
		} else {
			System.out.println("Impossivel depositar em uma conta fechada");
		}
	}

	public void sacar(float v) {
		if (this.GetStatus()) {
			if (this.getSaldo() >= v) {
				this.setSaldo(this.getSaldo() - v);
				System.out.println("Saque realizado na conta de " + this.getDono());
			} else {
				System.out.println("Saldo insuficiente para realizar saque");

			}
		} else {
			System.out.println("Impossivel depositar em uma conta fechada");
		}

	}

	public void pagarMensal() {
		int v = 0;
		if (this.getTipo() == "CC") {
		v = 12;
		} else if (this.getTipo() == "CP"){
			v = 20;
		}
		if (this.GetStatus()) {
			this.setSaldo(this.getSaldo() - v);
			System.out.println("Mensalidade paga com sucesso!");
		} else {
			System.out.println("Saldo insuficiente para realizar saque");
	}
	}
	

	

	public conta() {
		this.saldo=0;
		this.status=false;
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

	public boolean GetStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

}
