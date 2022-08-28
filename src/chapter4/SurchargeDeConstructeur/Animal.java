package chapter4.SurchargeDeConstructeur;

public class Animal {
	
	int age;
	String espece;
	
	//d�claration du constructeur par d�faut
	
	public Animal()
	{
		System.out.println("Constructeur par d�faut!");
	}
	
	public Animal(int age)
	{
		this(); //appel au constructeur par d�faut
		this.age = age;
		System.out.println("Constructeur avec 1 param�tre age : " + this.age);
	}
	
	public Animal(String espece)
	{
		this(espece, 2); //appel au constructeur avec 2 param�tres
		System.out.println("Constructeur avec 1 param�tre espece!");
		
	}
	
	public Animal(String espece, int age)
	{
		System.out.println("Constructeur avec 2 param�tres espece et age!");
	}

}
