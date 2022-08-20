package chapitre1;

public class Etudiant {  //extends Personne
	
	//Les attributs d'instance
	
	String nom="Etudiant";
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
		//super(10);
		System.out.println("Le constructeur par défaut");
	}
	
	public Etudiant(int age) // Constructeur paramétré.
	{
		this(); // appel au constructeur par défaut
		this.age = age;
		System.out.println("Un constructeur avec 1 paramètre age");
	}
	public Etudiant(String nom) // Constructeur paramétré.
	{
		this(10); //appel au constructeur avec paramètre int
		this.nom = nom;
		System.out.println("Un constructeur avec 1 paramètre nom");
	}

	public void info()
	{
		//System.out.println(this.nom+" "+super.nom);
	}
	
	//Un bloc d'initialisation d'instance
	{
		System.out.println("Un bloc d'initialisation d'instance no 1");
	}
	
	{
		System.out.println("Un bloc d'initialisation d'instance no 2");
	}
	
	//Un bloc d'initialisation de classe
	static {
		System.out.println("Un bloc d'initialisation de classe");
	}
	
}
