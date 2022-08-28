package chapter4.PassageDeParametres;

public class App {
    
	public static void permut(int a, int b) {  // a, b : paramètres formeles
		System.out.println("Avant permutation");
		System.out.println("a = "+a);
		System.out.println("b = "+b);
		int aux;
		aux = a;
		a = b;
		b = aux;
		System.out.println("Après permutation");
		System.out.println("a = "+a);
		System.out.println("b = "+b);
	}
	
	public static void modifStringBuilder(StringBuilder sb)  // sb : paramètre formel
	{
		sb.append("-ocp");
	}
	
	public static void modifString(String s)  // s : paramètre formel
	{
		//s.concat("-ocp");
		s = s.concat("-ocp");
	}

	public static void main(String[] args) {
		//1-Cas des types primitifs
		/*
		int x = 10, y = 20;  // x ,y : paramètres effectifs
		permut(x,y);
		System.out.println("x = "+x);
		System.out.println("y = "+y);*/
		
		//2-Cas d'un type référence mutable : exemple StringBuilder
		/*
		StringBuilder formation = new StringBuilder("oca"); // formation : paramètre effectif
		modifStringBuilder(formation);// passage de paramètre par valeur
		System.out.println(formation);*/
		
		//3-Cas d'un type référence immutable : exemple String
		
		String ch = "oca";
		modifString(ch);
		System.out.println(ch);

	}

}
