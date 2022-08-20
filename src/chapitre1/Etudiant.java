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
	
	public Etudiant() // declaration explicite du constructeur par d�faut
	{
		System.out.println("Un constructeur");
	}
	
	public Etudiant(int age) // Constructeur param�tr�.
	{
		this.age = age;
		System.out.println("Un constructeur avec 1 param�tre age");
	}
	public Etudiant(String nom) // Constructeur param�tr�.
	{
		this.nom = nom;
		System.out.println("Un constructeur avec 1 param�tre nom");
	}

	
}
