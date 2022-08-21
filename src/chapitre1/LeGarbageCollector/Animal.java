package chapitre1.LeGarbageCollector;

public class Animal {
	int age;

	public static void getInfo() {
		Animal a = new Animal();
		System.out.println(a.age);
	}

	public void info1() {}
	public void info2() {info1();}
	
	public void finalize() {
		System.out.println("Destruction d'unb objet Animal");
	}
}
