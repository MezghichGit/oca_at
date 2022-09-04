package chapter5;

import java.io.IOException;

public class Animal {

	String nom = "Animal";

	 Animal info() throws Exception{  // visibilit� : package-private
		System.out.println("Nom : "+ this.nom);
		return new Animal();
	}
	
	public Animal() {
		System.out.println("Constructeur par defaut Animal");
	}
	
	public Animal(String nom) {
		this.nom = nom;
		System.out.println("Constructeur Animal avec 1 param�tre");
	}
}
