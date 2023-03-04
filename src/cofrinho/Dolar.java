package cofrinho;

public class Dolar extends Moeda {
		
	public Dolar(double valor) {
		super(valor);
		this.valor = valor;
	}

	@Override
	public void info() {
		System.out.println("Dolar: " + valor);
		
	}

	@Override
	public double converter() {		
		return this.valor * 5.30;  // cálculo para converter para dolar
	}

	@Override
	public int hashCode() {
		return super.hashCode();
	}

	

		
	

}
