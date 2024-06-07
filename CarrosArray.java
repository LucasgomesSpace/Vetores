package vetores;

import java.util.ArrayList;
import java.util.Scanner;

public class CarrosArray {

	public static void main(String[] args) {

		ArrayList<String> carro = new ArrayList<String>();

		int  i ;
		Scanner read = new Scanner(System.in);

		carro.add("Audi r8 ");
		carro.add("Mc laren Senna");
		carro.add("Lamborguhini veneno");
		carro.add("BMW x6");
		carro.add("Opalão 16 cilindros");
		carro.add("Ferrari vanon");
		carro.add("Fiat mobi");
		carro.add("UP");
		carro.add("kiwid");
		carro.add("Toyota Corola");
		
		System.out.println(carro);
		System.out.println("\n"+"Qual carro gostaria de consultar em uma lista de 0 a 9?");
		i = read.nextInt();

		System.out.print("Carro consultado é ");
		System.out.println(carro.get(i));

		read.close();
	}
}
