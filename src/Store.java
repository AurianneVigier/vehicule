import java.io.Console;
import java.util.ArrayList;
import java.awt.List;

import com.iia.shop.entity.Vehicule;

public class Store {
	// creation de la liste des vehicules
	public static int getVehicule(ArrayList<Vehicule> vehicules){
		System.out.println("Sachant que le permier est le 0, le deuxieme est le 1, ...");
		System.out.println("Selectionner un vehicule : ");
		System.out.println(" ");
		// position du vehicule dans le tableau
		System.out.println(vehicules.size() + " vehicules disponibles");
		System.out.println(" ");
		
		Console console = System.console();
		int choix = Integer.parseInt(console.readLine("Entrez votre choix : "));
		System.out.println(" ");
		// affiche le vehicule choisi s'il est dans la liste
		if(choix >= 0 && choix < vehicules.size())
		{
			return choix;
		}
		// sinon il ne retourne aucun vehicule
		System.out.println("Ce vehicule n'est pas disponible !");
		return -1;
	}
	
	// voir toutes les voitures
	public static void readAll(ArrayList<Vehicule> vehicules)
	{
		if (vehicules == null){
			System.out.println("Aucun vehicule n'a ete cree");
		}
		// lit les vehicules qui sont crees
		for(Vehicule vehicule: vehicules)
		{
			vehicule.read();
		}
	}
	
	public static void main(String[] args) {
		// tableau de vehicules
		ArrayList<Vehicule> vehicules = new ArrayList<Vehicule>();

		int sortir = 1;
		do {
			int index;
			System.out.println("");
			System.out.println("Que souhaitez-vous faire ?");
			System.out.println(" ");

			Console console = System.console();

			// menu principal
			System.out.println("0- Voir tous les vehicules");
			System.out.println("1- Voir un vehicule en particulier");
			System.out.println("2- Creer un vehicule");
			System.out.println("3- Modifier un vehicule");
			System.out.println("4- Supprimer un vehicule");
			System.out.println("");
			int action = Integer.parseInt(console.readLine("Saisissez le numero que vous voulez realiser :  "));
			System.out.println("");
			switch (action) {
			case 0:
				Store.readAll(vehicules);
				break;
			case 1:
				// si le vehicule existe alors il est affiche
				index = Store.getVehicule(vehicules);
				if(index != -1)
				{
					vehicules.get(index).read();
					
					System.out.println("");
					System.out.println("Que souhaitez-vous faire ?");
					System.out.println(" ");
					System.out.println("0- Demarrer la voiture");
					System.out.println("1- Arreter la voiture");
					System.out.println("2- Augmenter la vitesse de la voiture");
					System.out.println("3- Diminuer la vitesse de la voiture");
					System.out.println(" ");
					int vitesse = Integer.parseInt(console.readLine("Saisissez le numero que vous voulez realiser :  "));
							
					// menu permettant de gerer la vitesse de la voiture
					switch (vitesse) {
					case 0:
						vehicules.get(index).start();
						break;
					case 1:
						vehicules.get(index).stop();
						break;
					case 2:
						vehicules.get(index).speedUp();
						break;
					case 3:
						vehicules.get(index).speedDown();
						break;
					default:
						System.out.println("Vous allez sortir de ce menu");
						break;
					}
				}
				break;
			case 2:
				// creer un vehicule
				vehicules.add(Vehicule.create());
				break;
			case 3:
				index = Store.getVehicule(vehicules);
				if(index != -1)
				{
					//vehicules.get(index).read();
					vehicules.get(index).update(); // Utiliser Read
				}
				break;
			case 4:
				// supprimer un vehicule par rapport a son index
				index = Store.getVehicule(vehicules);
				if(index != -1)
				{
					vehicules.remove(index);
				}
				break;
			default:
				System.out.println("Vous allez sortir de l'application");
				break;
			}

			// continuer sur l'application ou quitter
			System.out.println(" ");
			System.out.println("Voulez-vous faire autre chose ?");
			sortir = Integer.parseInt(console.readLine("0- Non | 1- Oui "));
			System.out.println(" ");
			System.out.println(" ");
		} while (sortir != 0);
	}
}
