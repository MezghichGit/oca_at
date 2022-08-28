package chapter4.classeImmutable;

import java.util.ArrayList;

public class Etudiant {
	
	private final int age;
	private final ArrayList<String> foods;

	public Etudiant(int age, ArrayList<String>repas) {
		this.age = age;
		this.foods = new ArrayList(repas);
	}

	public ArrayList<String> getFoods() {
		return new ArrayList(foods);
	}

	public int getAge() {
		return age;
	}

}
