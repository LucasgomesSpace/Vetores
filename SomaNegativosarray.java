package vetores;

import java.util.ArrayList;
import java.util.Random;

public class SomaNegativosarray {

	public static void main(String[] args) {

		ArrayList<Integer> numeros = new ArrayList<Integer>();
		Random side = new Random();
		int sm = 0 ;

		for(int i = 0; i < 10 ; i++ ) {
			int negativo = side.nextInt();
			numeros.add(negativo);

			if ( negativo < 0 ) {
				
				sm += 1 ;
				
			}
			else {}
		}

		for (int i : numeros) {
			System.out.println(i);
		}
		System.out.println("A Quantidade de numeros negativos é de:  "+ sm + " numeros.");
	}


}