package chapter3;

public class Animal {
	
	int id;

	public Animal(int id) {
		super();
		this.id = id;
	}
	
	//Redefinition de la méthode equals
	@Override
	public boolean equals(Object o)
	{
		Animal temp = (Animal)o;
		return this.id == temp.id;
	}
/*
	@Override
	public String toString() {
		return "Animal [id=" + id + "]";
	}*/

}
