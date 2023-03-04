package cofrinho;

public class Real extends Moeda{

	public Real(double valor) {
		super(valor);
		this.valor = valor;
	}
	
	@Override
	public void info() {
		System.out.println("Real: " + valor);
		
	}

	@Override
	public double converter() {		
		return this.valor;   // retorna o proprio valor, pois não é necessário converter.
	}

	@Override
	public int hashCode() {
		return super.hashCode();
	}

	

	
	
	

}
