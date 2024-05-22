package vetores;

import java.util.Scanner;

public class Atividade02 {

	public static void main(String[] args) {
		int a[] = new int [6]; 
		int sm = 0; 

		Scanner ler = new Scanner(System.in);

		for (int i = 1; i <6; i++) {
			System.out.print("Informe o " + i + "º" + " valor : ");
			a[i] = ler.nextInt();
			sm += a[i] ;
		}
		if (sm >=30 ) {
			System.out.println("O valor é maior que 30 " + "Valor igaul a: " + sm );
		}
		else {
			System.out.println("Valor inferior a 30" + " Valor igual a: " + sm );
		}

		ler.close();
	}

}