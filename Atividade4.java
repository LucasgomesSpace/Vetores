package vetores;

import java.util.ArrayList;

public class Atividade4 {

	public static void main(String[] args) {
		int soma = 0;
		
		ArrayList<Integer> numeros = new ArrayList<Integer>();
		numeros.add(1);
		numeros.add(2);
		numeros.add(3);
		numeros.add(4);
		numeros.add(5);
		
		System.out.println("A soma dos numeros:" );
		
		for(int i : numeros) {
		System.out.println( "{"+i+"}");
		soma += i; 
		}
		System.out.println("É igual a: " + soma);
	 
	}

}