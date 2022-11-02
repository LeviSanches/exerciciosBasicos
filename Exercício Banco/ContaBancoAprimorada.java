package conta_banco;

public class ContaBanco {

	public int numConta;
	protected String tipoConta;
	private String titularConta;
	private float saldoConta;
	private boolean statusConta;
	
	public ContaBanco(int numConta, String tipoConta, String titularConta, float saldoConta, boolean statusConta) {
		this.numConta = numConta;
		this.tipoConta = tipoConta;
		this.titularConta = titularConta;
		this.saldoConta = 0;
		this.statusConta = false;		
	}
	
	public int getNumConta() {
		return numConta;
	}

	public void setNumConta(int numConta) {
		this.numConta = numConta;
	}

	public String getTipo() {
		return tipoConta;
	}

	public void setTipo(String tipo) {
		this.tipoConta = tipo;
	}

	public String getDono() {
		return titularConta;
	}

	public void setDono(String dono) {
		this.titularConta = dono;
	}

	public float getSaldo() {
		return saldoConta;
	}

	public void setSaldo(float saldo) {
		this.saldoConta = saldo;
	}

	public boolean isStatus() {
		return statusConta;
	}

	public void setStatus(boolean status) {
		this.statusConta = status;
	}

	public void abrirConta(String t) 
	{
		setTipo(t);
		setStatus(true);
		if (t == "cc") {
			setSaldo(50);
			System.out.println("Conta corrente aberta com sucesso!");
		}
		else if (t == "cp") {
			setSaldo(150);
			System.out.println("Conta poupança aberta com sucesso!");
		}
		else {
			System.out.println("Selecione um tipo de conta válido: cc ou cp");
		}		
	}
	
	public void fecharConta() 
	{
		if (saldoConta < 0 || saldoConta > 0) {
			System.out.println("Não é possível fechar a conta, verifique o seu saldo e tente novamente.");
		}
		else {
			setStatus(false);
			System.out.println("Conta fechada com sucesso!");
		}		
	}
	
	public float depositar(float d) 
	{
		if (statusConta == false) {
			System.out.println("Verifique o status da conta antes de depositar.");
		}
		System.out.println("Deposito realizado com sucesso!");
		saldoConta += d;
		return d;		
	}
	
	public float sacar(float s) 
	{
		if (saldoConta < s && statusConta == false) {
			System.out.println("Verifique o saldo ou o status da conta antes de sacar um valor.");
		}	
		System.out.println("Saque realizado com sucesso!");
		saldoConta -= s;
		return s;			
	}
	
	public void info() 
	{		
		System.out.println("Tipo da conta: " + tipoConta);
		System.out.println("Saldo: " + saldoConta);				
	}	
			
}
	
	
	
	
	



