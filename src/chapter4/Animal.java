package chapter4;

public class Animal {
	
	private String nom;
	int age;  //package private
	protected String espece;
	public double poids;
	
	
	public void info()
	{
		System.out.println(this.nom);
		System.out.println(this.age);
		System.out.println(this.espece);
		System.out.println(this.poids);
	}

}
