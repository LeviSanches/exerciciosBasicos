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
	
	public ContaBanco() {
		
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
		this.setTipo(t);
		this.setStatus(true);
		if (t == "CC") {
			this.setSaldo(50);			
		}
		else if (t == "CP") {
			this.setSaldo(150);			
		}		
	}
	
	public void fecharConta() 
	{
		if (this.saldoConta < 0 || this.saldoConta > 0) {
			System.out.println("Não é possível fechar a conta, verifique o seu saldo e tente novamente.");
		}
		else {
			this.setStatus(false);			
		}		
	}
	
	public float depositar(float d) 
	{
		if (this.statusConta == false) {
			System.out.println("Verifique o status da conta antes de depositar.");
		}
		this.setSaldo(this.getSaldo() + d);
		return d;		
	}
	
	public float sacar(float s) 
	{
		if (this.saldoConta < s && this.statusConta == false) {
			System.out.println("Verifique o saldo ou o status da conta antes de sacar um valor.");
		}	
		this.setSaldo(this.getSaldo() - s);
		return s;			
	}
	
	public float pagarMensal() 
	{		
		float m = 0;		
		if (this.tipoConta == "cc") {
			m = 12;
			this.setSaldo(this.getSaldo() + m);			
		}
		else if (this.tipoConta == "cp") {
			m = 20;
			this.setSaldo(this.getSaldo() - m);
		}
		return m;		
	}
	
}
	
	
	
	
	



