package vetores;

import java.util.Scanner;

public class AmrmazenaValor {

	public static void main(String[] args) {
		String a[] = new String [5];

		Scanner ler = new Scanner(System.in);

		for (int i=0; i<5; i++) { 

			System.out.print("Informe um nome " + i +":" );
			a[i] = ler.nextLine();
		}

		for (int i = 0; i<5; i++){
			System.out.println(a[i]);
		}

		ler.close();
	}

}