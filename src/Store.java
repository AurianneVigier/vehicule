import java.io.Console;
import java.util.ArrayList;
import java.awt.List;

import com.iia.shop.entity.Vehicule;

public class Store {
	
	public static int getVehicule(ArrayList<Vehicule> vehicules){
		System.out.println("Selectionner un vehicule : ");
		System.out.println(vehicules.size() + " vehicules disponibles : ");
		
		Console console = System.console();
		int choix = Integer.parseInt(console.readLine("Entrez votre choix : "));
		
		if(choix >= 0 && choix < vehicules.size())
		{
			return choix;
		}
		System.out.println("Ce vehicule n'est pas disponible !");
		return -1;
	}
	
	public static void readAll(ArrayList<Vehicule> vehicules)
	{
		if (vehicules == null){
			System.out.println("Aucun vehicule n'a ete cree");
		}
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
			int choix;
			int index;
			System.out.println("");
			System.out.println("Que souhaitez-vous faire ?");
			System.out.println(" ");
			//System.out.println("1- Voir tous les vehicules");
			//System.out.println(" ");

			Console console = System.console();
			//choix = Integer.parseInt(console.readLine("Entrez votre choix : "));

			//switch (choix) {

			//case 1:
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
						index = Store.getVehicule(vehicules);
						if(index != -1)
						{
							vehicules.get(index).read();
						}
						break;
					case 2:
						vehicules.add(Vehicule.create());
						break;
					case 3:
						index = Store.getVehicule(vehicules);
						if(index != -1)
						{
							//vehicules.get(index).update(); // Utiliser Read
						}
						break;
					case 4:
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

					//} //while (sortir != 0);
			
			/*switch (choix) {
			case 1:
				int i = 0;
				Vehicule.readAll(i, Vehicule.getBrand(), Vehicule.getYear(), Vehicule.getSpeed(), Vehicule.getModel(), Vehicule.getColor(), Vehicule.getPrice());
				break;
			case 2:
				Vehicule.readSingle();
				break;
			case 3:
				int add = 0;
				Vehicule.create(add);
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
			}*/

			System.out.println(" ");
			System.out.println("Voulez-vous faire autre chose ?");
			sortir = Integer.parseInt(console.readLine("0- Non | 1- Oui "));
			System.out.println(" ");
			System.out.println(" ");
		} while (sortir != 0);
	}

}
