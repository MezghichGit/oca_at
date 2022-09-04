package chapter5.Hidding;

public class Oiseau extends Animal{
	
	/*@Override
	public boolean info()
	{
		return false;
	}*/
	
	public static boolean info()
	{
		return false;
	}
	
	public void infoOiseau()
	{
		System.out.println("Info Oiseau "+ info());
	}
}
