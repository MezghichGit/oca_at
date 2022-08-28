package chapter4.LambdaExpression;

@FunctionalInterface
public interface Prediction {
	
	public abstract boolean test(String s); // une m�thode abstraite(sans impl�mentation)
	
	
	//public abstract boolean affichage(String s);
	
	// a partir de la version 8, on peut d�clarer des m�thodes concr�tes dans une interface.
	public default void info1()
	{
		System.out.println("Interface fonctionnnelle");
	}
	
	public static void info2()
	{
		System.out.println("Interface fonctionnnelle");
	}

}
