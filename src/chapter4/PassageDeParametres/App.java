package chapter4.PassageDeParametres;

public class App {
    
	public static void permut(int a, int b) {  // a, b : param�tres formeles
		System.out.println("Avant permutation");
		System.out.println("a = "+a);
		System.out.println("b = "+b);
		int aux;
		aux = a;
		a = b;
		b = aux;
		System.out.println("Apr�s permutation");
		System.out.println("a = "+a);
		System.out.println("b = "+b);
	}
	
	public static void modifStringBuilder(StringBuilder sb)  // sb : param�tre formel
	{
		sb.append("-ocp");
	}
	
	public static void modifString(String s)  // s : param�tre formel
	{
		//s.concat("-ocp");
		s = s.concat("-ocp");
	}

	public static void main(String[] args) {
		//1-Cas des types primitifs
		/*
		int x = 10, y = 20;  // x ,y : param�tres effectifs
		permut(x,y);
		System.out.println("x = "+x);
		System.out.println("y = "+y);*/
		
		//2-Cas d'un type r�f�rence mutable : exemple StringBuilder
		/*
		StringBuilder formation = new StringBuilder("oca"); // formation : param�tre effectif
		modifStringBuilder(formation);// passage de param�tre par valeur
		System.out.println(formation);*/
		
		//3-Cas d'un type r�f�rence immutable : exemple String
		
		String ch = "oca";
		modifString(ch);
		System.out.println(ch);

	}

}
