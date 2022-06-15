package desafios;

import desafios.funcionarios.Consultor;
import desafios.funcionarios.Vendedor;

public class Main {
	public static void main(String[] args) {
	 //NumeroReverso.numeroReverso();
	
		/*Macaco macaco1 = new Macaco();
		Macaco macaco2 = new Macaco();
		
		macaco1.comer("banana");
		macaco1.comer("banana");
		macaco1.comer("banana");
		
	
		macaco2.comer("pera");
		macaco2.comer("uva");
		macaco2.comer("maça");
		

		macaco1.digerir();
		macaco2.digerir();*/
		
		Vendedor vendedor = new Vendedor("Leandro Vendedor", 1234567878, 10d, 5);
		System.out.println(vendedor.calcularSalario());
		
		Consultor consultor = new Consultor("Consultor", 12457, 100.5d, 10);
		System.out.println(consultor.calcularSalario());
}
}