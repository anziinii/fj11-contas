package testes;
import modelo.Conta;
import modelo.ContaCorrente;
import modelo.ContaPoupanca;

public class TestaConta {
	
	public static void main(String[] args) {
		
		Conta c1 = new ContaCorrente();
		//Conta c1 = new ContaPoupanca();
		
		c1.setTitular("Felipe");
		c1.setAgencia("003");
		c1.setNumero(12345);
		c1.sacar(30);
		c1.depositar(500);
		
		//System.out.println(c1.getSaldo());
		
		
		ContaCorrente cc = new ContaCorrente(1000);
		cc.setTitular("Clientola");
		//cc.sacar(30);
		//System.out.println(cc.getSaldo());
		
		
		ContaPoupanca cp = new ContaPoupanca(1000);
		
		
		
		cp.transfere(300, cc);
		
		System.out.println(cc.getSaldo());
		System.out.println(cp.getSaldo());
		
	}
}
