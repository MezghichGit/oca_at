package chapter6;

public class Main {

	public static void info() throws NullPointerException // declare unchecked exception
	{
		// System.out.println("Un simple message");
		throw new NullPointerException(); // declenche l'excetpion
	}

	public static void affichage() throws Exception // declare checked Exception
	{
		// System.out.println("Un simple message");
		throw new NullPointerException(); // declenche l'excetpion
	}

	public static void main(String[] args) {
		// info();
		try {
			affichage();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Suite du programme");
	}

}
