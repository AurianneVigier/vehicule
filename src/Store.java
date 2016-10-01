import java.io.Console;

import com.iia.shop.entity.Vehicule;

public class Store {

	public static void main(String[] args) {
		// tableau de vehicules

		String Voiture[];
		Voiture = new String[10];

		int sortir = 1;
		do {
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

			switch (choix) {
			case 1:
				Vehicule.readAll();
				break;
			case 2:
				Vehicule.readSingle();
				break;
			case 3:
				Vehicule.create(Voiture);
				break;
			case 4:
				Vehicule.update();
				break;
			case 5:
				Vehicule.delete();
				break;
			default:
				System.out.println("Vous etes sorti de l'application");
				break;
			}

			System.out.println(" ");
			System.out.println("Voulez-vous faire autre chose ?");
			sortir = Integer.parseInt(console.readLine("0- Non | 1- Oui "));
			System.out.println(" ");
			System.out.println(" ");
		} while (sortir != 0);
	}

}
