package chapitre2.statement;

enum Jour {LUNDI,MARDI,DIMANCHE}
public class App_Switch {

	public static void main(String[] args) {
		Jour temp = Jour.DIMANCHE;
		switch(temp)
		{
		case LUNDI: System.out.println("C'est Lundi"); break;
		case MARDI: System.out.println("C'est Mardi"); break;
		case DIMANCHE: System.out.println("C'est Dimanche"); break;
		default:System.out.println("Autre jour..."); 
		}
		/*
		int mois = 12;
		
		switch(mois)
		{
		
		case 1 : System.out.println("Janvier"); break;
		case 2 : System.out.println("Février"); break;
		case 10 : System.out.println("Octobre"); break;
		default : System.out.println("Je sais pas");
		}
*/
		/*
		String saison="Ete";
		final String v1 = "Hiver";
		switch(saison)
		{
		case "Automne" : System.out.println("Cest la rentré"); break;
		case "Ete" : System.out.println("Cest les vaccances"); break;
		case v1 : System.out.println("il fait froid"); break;
		}*/
	}

}
