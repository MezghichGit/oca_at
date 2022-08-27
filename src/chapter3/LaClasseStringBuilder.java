package chapter3;

public class LaClasseStringBuilder {

	public static void main(String[] args) {
		/*String alpha = "";
		for (char current = 'a'; current <= 'z'; current++)
			alpha += current;
		System.out.println(alpha);*/
		
		/*StringBuilder sb = new StringBuilder();// constructeur par défaut
		System.out.println(sb.capacity());
		System.out.println(sb.length());
		sb.append("abcabcabcabcabcabcabcabcabcabcabcabc");
		System.out.println(sb.capacity());
		System.out.println(sb.length());*/
		/*
		StringBuilder sb = new StringBuilder("oca");
		System.out.println(sb.capacity());
		System.out.println(sb.length());*/
		/*StringBuilder sb = new StringBuilder(8);
		System.out.println(sb.capacity());
		System.out.println(sb.length());*/
		
		String temp="oca-ocp";
		StringBuilder sb = new StringBuilder(temp);
		/// manipulations
		sb.append("Spring");
		sb.append("Fullstack");
		temp = sb.toString();
		System.out.println(temp);
	}
}
