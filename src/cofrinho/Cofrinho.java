package cofrinho;

import java.util.ArrayList;

public class Cofrinho{	
	
	
	
	ArrayList<Moeda> listaMoedas = new ArrayList<Moeda>();		//Lista que recebe a classe abstrata Moeda
	
	//metodos básicos de adiconar e remover itens em uma lista.
	public void adicionar(Moeda m) {
		listaMoedas.add(m);
	}
	
	
	public void remover(Moeda m) {
		listaMoedas.remove(m);
		
	}
	
	public void listagemMoedas() {
		for ( Moeda m : listaMoedas) {			
			m.info();
		}
	}

	
	public double totalConvertido() {
		if (this.listaMoedas.isEmpty()) { // Caso não tenha moedas, o total convertido deve retornar 0
			return 0;
		}
		double total = 0;
		for (Moeda m : listaMoedas) {    // um for each para passar por todas as moedas e ir somando com a variável "total" e retornar a mesma.
			total += m.converter();
		
	}
		return total;
		
	}
	
		
}
