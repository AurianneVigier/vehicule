import java.io.Console;

import com.iia.shop.entity.Vehicule;

public class Store {

	public static void main(String[] args) {
		// tableau de vehicules

		Vehicule voiture = new Vehicule();
		int i = 0;
		String Voiture[] = new String[i];

		int sortir = 1;
		do {
			int choix;
			System.out.println("");
			System.out.println("Que souhaitez-vous faire ?");
			System.out.println(" ");
			System.out.println("1- Voir tous les vehicules");
			System.out.println(" ");

			Console console = System.console();
			choix = Integer.parseInt(console.readLine("Entrez votre choix : "));

			switch (choix) {

			case 1:
					System.out.println("");
					Vehicule.readAll(i, Vehicule.getBrand(), Vehicule.getYear(), Vehicule.getSpeed(), Vehicule.getModel(), Vehicule.getColor(), Vehicule.getPrice());
					System.out.println("");
					System.out.println("1- Voir un vehicule en particulier");
					System.out.println("2- Creer un vehicule");
					System.out.println("3- Modifier un vehicule");
					System.out.println("4- Supprimer un vehicule");
					System.out.println("");
					int action = Integer.parseInt(console.readLine("Saisissez le numero que vous voulez realiser :  "));
					System.out.println("");
					switch (action) {
					case 1:
						int j = 0;
						Vehicule.readAll(j, Vehicule.getBrand(), Vehicule.getYear(), Vehicule.getSpeed(), Vehicule.getModel(), Vehicule.getColor(), Vehicule.getPrice());
						break;
					case 2:
						int add = 0;
						Vehicule.create(add);
						break;
					case 3:
						Vehicule.update();
						break;
					case 4:
						Vehicule.delete();
						break;
					default:
						System.out.println("Vous allez sortir de l'application");
						break;
					}

					} //while (sortir != 0);
			
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
