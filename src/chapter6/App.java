package chapter6;

public class App {
	
	public static void info() throws NullPointerException
	{
		System.out.println("Un simple message");
	}

	public static void main(String[] args) {
		
		info();
		
		/*
		 * int x = 10; int y = 0;
		 * 
		 * System.out.println("La division = "+ (x/y));
		 */
		/*
		 * int tab[] = {10,20,30}; System.out.println(tab[3]);
		 */

		// String ch="oca";
		String ch = null;
		int l = -1;
		try {
			
			System.out.println("La division = "+ (10/0));
			int tab[] = { 10, 20, 30 };
			System.out.println(tab[3]);
			l = ch.length();
			System.out.println("Longueur = " + l);
		}
		
		
		catch (NullPointerException ex) {
			// System.out.println("Un problème : pointeur sur null");
			System.out.println("Null pointer" + ex.getMessage());
			//ex.printStackTrace();
			return; // sortie immédiate de la fonction main
		} 
		catch(ArrayIndexOutOfBoundsException ex)
		{
			System.out.println("Indice de tableau invalide "+ex.getMessage());
		}
		
		catch(Exception ex)
		{
			System.out.println("Oupss "+ex.getMessage());
		}
		finally { // forcé l'exécution de ce bloc en présence du return
			// deconnexion de la base de données
			System.out.println("Suite du programme...");
		}

	}

}
