//Levi Sanches ---- RU: 4103661

package cofrinho;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		Cofrinho cofre = new Cofrinho();
		int opcao;		 
		
		System.out.println(" /--------------MENU---------------\\");
		System.out.println("||   1 - Adicionar moeda           ||");
		System.out.println("||   2 - Remover moeda             ||");
		System.out.println("||   3 - Listar moedas             ||");
		System.out.println("||   4 - Converter total para real ||");
		System.out.println("||   0 - Sair                      ||");	
		System.out.println(" \\---------------------------------/");
		opcao = teclado.nextInt();
		
		int tipoMoeda;
		Moeda moeda;
		
		while ( opcao != 0) 
		{
			
			switch(opcao) 
			
			{			
			
			case 1:		
				
				tipoMoeda = 0;
				while( tipoMoeda > 3 || tipoMoeda == 0) 
				{
					System.out.println("//--Selecione o tipo de moeda--\\");
					System.out.println("||         1 - Real            ||");
					System.out.println("||         2 - Dolar           ||");
					System.out.println("||         3 - Euro            ||");
					System.out.println("\\-----------------------------//");
					tipoMoeda = teclado.nextInt();					
				}
				
				System.out.println("Qual o valor?");					
				moeda = null;
				
				if(tipoMoeda == 1) 
				{
					double valor = teclado.nextDouble();
					moeda = new Real(valor);
				}
				
				else if(tipoMoeda == 2) 
				{
					double valor = teclado.nextDouble();
					moeda = new Dolar(valor);
				}
				
				else if(tipoMoeda == 3) 
				{
					double valor = teclado.nextDouble();
					moeda = new Euro(valor);
				}	
				
				cofre.adicionar(moeda);
				
				break;
				
			case 2:
				
				tipoMoeda = 0;
				while( tipoMoeda > 3 || tipoMoeda == 0) 
				{
					System.out.println("//--Selecione o tipo de moeda--\\");
					System.out.println("||         1 - Real            ||");
					System.out.println("||         2 - Dolar           ||");
					System.out.println("||         3 - Euro            ||");
					System.out.println("\\-----------------------------//");
					tipoMoeda = teclado.nextInt();
				}
				
				System.out.println("Qual o valor?");					
				moeda = null;
				
				if(tipoMoeda == 1) 
				{
					double valor = teclado.nextDouble();
					moeda = new Real(valor);
				}
				
				else if(tipoMoeda == 2) 
				{
					double valor = teclado.nextDouble();
					moeda = new Dolar(valor);
				}
				
				else if(tipoMoeda == 3) 
				{
					double valor = teclado.nextDouble();
					moeda = new Euro(valor);
				}	
				
				cofre.remover(moeda);
				
				break;
				
			case 3:
				
				System.out.println("Moedas dentro do cofre: ");
				cofre.listagemMoedas();
				break;
				
			case 4:	
				
				System.out.println("Valor total convertido para Real --> " + cofre.totalConvertido());								
				break;
				
			default:
				
				System.out.println("Opcao invalida!");				
					
			}
			
			System.out.println(" /--------------MENU---------------\\");
			System.out.println("||   1 - Adicionar moeda           ||");
			System.out.println("||   2 - Remover moeda             ||");
			System.out.println("||   3 - Listar moedas             ||");
			System.out.println("||   4 - Converter total para real ||");
			System.out.println("||   0 - Sair                      ||");	
			System.out.println(" \\---------------------------------/");
			opcao = teclado.nextInt();
			
		}
	}
	
}	

