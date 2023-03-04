package cofrinho;

public class Euro extends Moeda{

	public Euro(double valor) {
		super(valor);
		this.valor = valor;
	}
	
	@Override
	public void info() {
		System.out.println("Euro: " + valor);
		
	}

	@Override
	public double converter() {		
		return this.valor * 5.50;    // cálculo para converter para dolar
	}

	@Override
	public int hashCode() {
		return super.hashCode();
	}

	

	

	
	
	
}

	
