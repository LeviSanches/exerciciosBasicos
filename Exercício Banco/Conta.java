package exercícios;

public class Conta {
	int numeroConta;
	String titularConta;
	float saldoConta;
	float limiteConta;
	
	
	
	public Conta(int numeroConta, String titularConta, float saldoConta, float limiteConta) {
		this.numeroConta = numeroConta;
		this.titularConta = titularConta;
		this.saldoConta = saldoConta;
		this.limiteConta = limiteConta;
	}

	 boolean sacar(float valorSaque) {
		 if (valorSaque > limiteConta || valorSaque > saldoConta) {
			 System.out.println("Valor excede o limite do saque!");
			 return false;			 
		 }
		 saldoConta -= valorSaque;
		 	return true;				 
	}
	 
	 boolean depositar(float valorDeposito) {
		 if (valorDeposito < 0) {
			 return false;
		 }
		 saldoConta += valorDeposito;
		 	return true;
	 }
	 
	 void consultarSaldo() {
		 System.out.println("Saldo atual: " + saldoConta);		 
	 }
			
	void info() {
		System.out.println("Titular: " + titularConta);
		System.out.println("Conta: " + numeroConta);		
	}
}

