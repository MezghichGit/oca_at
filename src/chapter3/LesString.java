package chapter3;

public class LesString {

	public static void main(String[] args) {
		
		//1-La concaténation
		/*
		String formation="oca";
		String ch1 = formation+3+4;
		System.out.println(formation+3+4);
		String ch2 = 3+4+formation;
		System.out.println(3+4+formation);
		String ch3 = 3+4+formation+3+4;
		System.out.println(3+4+formation+3+4);*/
		
		//2-La classe String est immutable : Inchangeable
		
		/*String ch = "oca";
		System.out.println(ch.concat("-ocp"));
		ch = ch.concat("-ocp");
		System.out.println(ch);
		
		StringBuilder sb = new StringBuilder("oca");
		sb.append("-ocp");
		System.out.println(sb);*/
		
		//3-Occupation mémoire(stack,heap, pool)
		/*
		String nom = "mohamed";
		
		//String ch2 = new String("oca");
		String prenom = "mohamed";
		//String ch4 = new String("oca");
		/*System.out.println(ch1 == ch2);
		System.out.println(ch1 == ch3);
		System.out.println(ch1 == ch4);
		System.out.println(ch2 == ch4);*/
		////System.out.println(nom == prenom); // == : opérateur d'égalité d'adresse
		////System.out.println(nom.equals(prenom));
		//System.out.println(ch1.equals(ch4));
		//System.out.println(ch1.equals(ch3));
		//int x = 10;
		//double moy = 16.5;
		//Animal a = new Animal();*/
		/*
		Animal a1 = new Animal(10);
		Animal a2 = new Animal(10);
		System.out.println(a1);
		System.out.println(a2.toString());
	    System.out.println("(a1 == a2) :"+(a1 == a2));  //false
	    System.out.println("(a1 equals a2) : "+(a1.equals(a2))); //false
	    //par défaut equals fonctionne de la même manière que ==
	    /*String ch1 = new String("oca"); //heap
	    String ch2 = "oca"; //pool
	    System.out.println("ch1 = "+ch1);
	    System.out.println("(ch1 == ch2) :"+(ch1 == ch2));
	    System.out.println("(ch1 equals ch2) : "+(ch1.equals(ch2)));*/
	    
	    //4-Les méthodes à connaitre
	    //String string = "animals";
	    //System.out.println(string.substring(3, 7));
		
		/*String ch = "abcabc";
		System.out.println(ch.replace("a", "A"));
		System.out.println(ch);*/
		
		String s="\t oca ocp  \n";
		System.out.println(s);
		System.out.println("******");
		
		String s1="\t oca ocp  \n".trim();
		System.out.println(s1);
		System.out.println("******");
		
		

	}

}
