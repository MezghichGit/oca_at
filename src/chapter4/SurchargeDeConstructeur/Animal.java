package chapter4.SurchargeDeConstructeur;

public class Animal {
	
	int age;
	String espece;
	
	//déclaration du constructeur par défaut
	
	public Animal()
	{
		System.out.println("Constructeur par défaut!");
	}
	
	public Animal(int age)
	{
		this(); //appel au constructeur par défaut
		this.age = age;
		System.out.println("Constructeur avec 1 paramètre age : " + this.age);
	}
	
	public Animal(String espece)
	{
		this(espece, 2); //appel au constructeur avec 2 paramètres
		System.out.println("Constructeur avec 1 paramètre espece!");
		
	}
	
	public Animal(String espece, int age)
	{
		System.out.println("Constructeur avec 2 paramètres espece et age!");
	}

}
