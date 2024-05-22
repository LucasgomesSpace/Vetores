package vetores;
import java.util.Scanner;

public class Atividade03 {

	public static void main(String[] args) {

		int a[] = new int [10]; 
		int b[] = new int [10]; 
		int c[] = new int [10]; 
		Scanner ler = new Scanner(System.in);
		
		for (int i =0; i <5; i++) {
			System.out.print("digite um numero para o indice"+ i+ " {a}");
			a[i] = ler.nextInt();
			c[i] += a[i];
		}
			for (int i = 5 ; i<10;i++) {

				System.out.print("digite um numero para o indice "+ i +" {b}" );
				b[i] = ler.nextInt();
				c[i] += b[i];
			}
			
		for (int i = 1; i<10; i++) {
			System.out.println("indice: " + "C " + c[i] + " "+ i +"º");

		}

		ler.close();
	}
}