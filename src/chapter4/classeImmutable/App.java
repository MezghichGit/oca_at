package chapter4.classeImmutable;

import java.util.ArrayList;

public class App {

	public static void main(String[] args) {
		
		ArrayList<String> favorites = new ArrayList<>();
		favorites.add("pizza");
		favorites.add("hamburger");
		Etudiant e1 = new Etudiant(22,favorites);
		System.out.println(e1.getFoods());
		favorites.clear();
		System.out.println(e1.getFoods());
		//ArrayList<String> fd = e1.getFoods();
		/*
		System.out.println(e1.getFoods());
		fd.clear();
		System.out.println(e1.getFoods());*/
		

	}

}
