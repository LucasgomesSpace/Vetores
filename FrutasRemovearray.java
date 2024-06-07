package vetores;

import java.util.ArrayList;

public class FrutasRemovearray {

	public static void main(String[] args) {

		ArrayList<String> frutas = new ArrayList<String>();
		frutas.add("Abacaxi");
		frutas.add("Laranja");
		frutas.add("Uva");
		frutas.add("Morango");
		frutas.add("Lixia");
		frutas.add("kiwi");
		frutas.add("Tomate");
		frutas.add("Banana");
		frutas.add("Abacate");
		frutas.add("Pera");

		System.out.println("Sua lista de frutas atual é: " + "\n" + "---------------------------");
		for (String i : frutas ) {
			System.out.println(i);
		}

		for(int i = 0; i < 5; i++) {
			frutas.remove(i);
		}

		System.out.println("Sua lista de frutas atual é: " + "\n" + "---------------------------");

		for (String i : frutas ) {
			System.out.println(i);
		}


	}

}
