package chapter5.LesClassesAbstraites;

public abstract class Animal {
	String espece;
	int age;
	
	public void manger()
	{
		System.out.println("J'ai faim");
	}
	
	public void dormir()
	{
		System.out.println("Je dors");
	}
	
	public abstract void seDeplacer();
	
}
