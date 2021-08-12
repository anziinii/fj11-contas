package modelo;
public class ContaPoupanca extends Conta {

	public ContaPoupanca() {
		super();
	}

	public ContaPoupanca(double valor) {
		super();
		super.depositar(valor);
	}
	
	public String getTipo() {
		return "Conta Poupança";
	}

	@Override
	public void sacar(double valor) {
		// TODO Auto-generated method stub
		
	}

}
