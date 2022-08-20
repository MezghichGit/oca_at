package chapitre1;

public class Etudiant {
	
	//Les attributs d'instance
	
	String nom;
	int age;
	boolean travail;
	char niveau;
	
	@Override
	public String toString() {
		int a=1; // variable locale
		return "Etudiant [nom=" + nom + ", age=" + age + ", travail=" + travail + ", niveau=" + niveau + "]";
	}

	//Les attributs de classe
	static int nbre;
	
	public Etudiant() // declaration explicite du constructeur par défaut
	{
		System.out.println("Un constructeur");
	}
	
	public Etudiant(int age) // Constructeur paramétré.
	{
		this.age = age;
		System.out.println("Un constructeur avec 1 paramètre age");
	}
	public Etudiant(String nom) // Constructeur paramétré.
	{
		this.nom = nom;
		System.out.println("Un constructeur avec 1 paramètre nom");
	}

	
}
