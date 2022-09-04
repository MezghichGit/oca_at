package chapter5;

import java.io.IOException;

public class Oiseau extends Animal {
	String name = "Oiseau";

	@Override
	protected Oiseau info() throws IOException {
		System.out.println("Nom du oiseau: " + this.name);
		System.out.println("Nom du animal: " + this.nom);
		System.out.println("Nom du animal: " + super.nom);
		return new Oiseau();
	}
	
	public Oiseau() {
		super("Toto");  // choix du constructeur parent avec 1 paramètre
		System.out.println("Constructeur par defaut Oiseau");
	}
}
