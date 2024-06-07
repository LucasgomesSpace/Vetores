package vetores;

import java.util.ArrayList;
import java.util.Random;

public class NumeroPararray {

	public static void main(String[] args) {
	
		ArrayList<Integer> numeros = new ArrayList<Integer>();
		Random tip = new Random();
		int sm = 0 ;

		for(int i = 0; i < 5 ; i++ ) {
			int numeroAleatorio = tip.nextInt(100);
			numeros.add(numeroAleatorio );

			if ( numeroAleatorio % 2 == 0 ) {
				sm += numeroAleatorio;
			}
			else {}
		}

		for (int i : numeros) {
			System.out.println(i);
		}
		System.out.println("A soma dos numeros pares = "+ sm);
	}

}