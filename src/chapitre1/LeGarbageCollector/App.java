package chapitre1.LeGarbageCollector;

public class App {

	public static void main(String[] args) {
		Animal a1 = new Animal();
		Animal a2 = new Animal();
		Animal a3 = new Animal();
		
		a1 = a2;  //premier objet perdu
		a3 = null; // deuxième objet perdu
	
		System.gc(); // appel explicite du grabage collector
		
		for(int i=0;i<1000;i++)
		{
			System.out.println("i = "+i);
		}
		
		System.out.println("Fin du programme...");

	}

}
