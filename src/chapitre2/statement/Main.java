package chapitre2.statement;

public class Main {

	public static void main(String[] args) {
		
		int tab[] = {10,14,18,25};
		// Loop classique
		System.out.println("Loop classique");
		for(int i=0; i<tab.length; i++)
		{
			System.out.println(tab[i]);
		}
		
		/*for(int i=0; i<10; i++)
		{
			System.out.println("i = "+i);
		}*/
		System.out.println("Enhaced Loop");
		for(int e : tab)
		{
			System.out.println(e);
		}
		
		String names [] = {"Amine","Ahmed Omrane","Maryem","Elyes"};
		for(String name:names)
			System.out.println(name);
	}

}
