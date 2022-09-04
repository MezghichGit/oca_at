package chapter5.polymorphismeGenerique;

public class App {

	public static void infoPersonne(Personne p) // méthode polymorphe
	{
		p.info();
	}
	public static void main(String[] args) {
		infoPersonne(new Employer());
		infoPersonne(new Retraite());
		infoPersonne(new Etudiant());
		 Personne tab []= {new Employer(), new Etudiant(), new Retraite()};
		 
		 // tab : structure polymorphe
		 
		 for(Personne p : tab)
		 {
			 p.info();
		 }

	}

}
