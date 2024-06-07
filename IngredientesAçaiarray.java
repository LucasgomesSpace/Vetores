package vetores;

import java.util.ArrayList;
import java.util.Scanner;

public class IngredientesAçaiarray {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);
		ArrayList<String> Ingredientes = new ArrayList<String>();

		Ingredientes.add("Açai");
		Ingredientes.add("Leite Condençado");
		Ingredientes.add("Paçoca");
		Ingredientes.add("Banana");
		Ingredientes.add("Granola");

		int r = -1;
		System.out.println("ingredientes que vão no açai: " + "\n");
		for ( String i : Ingredientes) {

			r++;
			System.out.println("|"+i+ " "+ r+ "|");
		}
		r = -1 ;

		System.out.println("Deseja retirar algum ingrediente [sim/não] ?");
		String resposta = ler.nextLine();

		String sim = ("sim");
		String não = ("não");

		if (sim.equals(resposta)) {
			System.out.println("Qual deseja remover? " + "\n" + "OBS: Escolha o numero da lista para remover.");

			for ( String i : Ingredientes) {
				r++;
				System.out.println("|"+i+ " "+ r+ "|");
			}
			System.out.println("Qual deseja remover ?");
			int exclude = ler.nextInt();
			System.out.println("Item "+ Ingredientes.get(exclude) +" removido");
			Ingredientes.remove(exclude);
			for ( String i : Ingredientes) {
				System.out.println("|"+i+  " |");
			}
			System.out.println("Deseja adicionar um item? [sim/não]");
			String resposta3 = ler.next();		
			if (sim.equals(resposta3)) {
				System.out.println("Digite seu igrediente adicional");
				String adiciona = ler.next();
				System.out.println("Item "+ adiciona +" adicionado ao seu açai");
				Ingredientes.add(adiciona);		
				System.out.println("Sua lista de ingedientes para o açai ficou: ");
				for ( String i : Ingredientes) {
					System.out.println("|"+i+  " |");
				}
			if (não.equals(resposta3)) {
					System.out.println("Sua lista de ingedientes para o açai ficou: ");
					for (String i : Ingredientes) {
						System.out.println("|"+i+"|");
						System.exit(0); }
				}
			}
		}
		if (não.equals(resposta)) {
			System.out.println("Deseja adicionar um item? [sim/não]");
			String resposta2 = ler.next();
			if (sim.equals(resposta2)) {
				System.out.println("Digite seu igrediente adicional");
				String adicional = ler.next();
				System.out.println("Item "+ adicional +" adicionado ao seu açai");
				Ingredientes.add(adicional);				
				for ( String i : Ingredientes) {
					System.out.println("|"+i+  " |");
				}
					System.out.println("Sua lista de ingedientes para o açai ficou: ");
					for (String i : Ingredientes) {
						System.out.println("|"+i+"|");
				}
					System.exit(0);
			}
				if (não.equals(resposta2)) {
					System.out.println("Sua lista de ingedientes para o açai ficou: ");
					for (String i : Ingredientes) {
						System.out.println("|"+i+"|");
						
					}
				}
			}

		
		ler.close();
	}
}
