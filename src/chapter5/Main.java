package chapter5;

public class Main {

	public static void main(String[] args) {
		
		Personne p = new Personne();
		//p.info();
		
		Etudiant e = new Etudiant();
		//e.info();
		
		//Personne pe = new Etudiant(); //polymorphisme d'héritage
		//pe.info(); // overriding
		
		//polymorphisme d'héritage
		
		//p = e;
		Etudiant e2 = new Etudiant();
		p = e2;  //Upcating
		e = (Etudiant)p;   //DownCasting + Cast Explicite + Up Cast Avant
		// we reclaim Etudiant from p
		System.out.println("Suite de programme...");
		

	}

}
