package chapter5.LesInterafces;

public abstract interface Photocopieuse {
	
	//int maxAge = 100;  // 
	public static final int maxAge = 100;
	public abstract void photocopier();
	
	
	// A partir de la version 8
	public default void info() {
		//...
	}
	
	public static void affichage() {
		//...
	}

}
