
public class TestaConta {
	
	public static void main(String[] args) {
		
		Conta c1 = new Conta(1200);
		
		c1.setTitular("Felipe");
		c1.setAgencia("003");
		c1.setNumero(12345);
		c1.sacar(30);
		//c1.depositar(500);
		
		System.out.println(c1.getSaldo());
		
		
		ContaCorrente cc = new ContaCorrente(1200);
		cc.setTitular("Clientola");
		cc.sacar(30);
		System.out.println(cc.getSaldo());
		
		
		//ContaPoupanca cp = new ContaPoupanca();
		
		
		
		
	}
}
