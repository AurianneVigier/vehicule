import java.io.Console;

public class Store {

	public static void main(String[] args) {
		// tableau de voitures

		int Vehicule[];
		Vehicule = new int[10];
		
		int sortir = 1;
		do{
			int choix;
			System.out.println("Que souhaitez-vous faire ?");
			System.out.println(" ");
			System.out.println("1- Voir tous les vehicules vehicule");
			System.out.println("2- Voir un vehicule en particulier");
			System.out.println("3- Creer un vehicule");
			System.out.println("4- Modifier un vehicule");
			System.out.println("5- Supprimer un vehicule");
			System.out.println(" ");
			
			Console console = System.console();
			choix = Integer.parseInt(console.readLine("Entrez votre choix : "));
						
			System.out.println(" ");
			System.out.println("Voulez-vous recommencer une opération ?");
			sortir = Integer.parseInt(console.readLine("0- Non | 1- Oui "));
			System.out.println(" ");
			System.out.println(" ");
		}while (sortir != 0);
	}

}
