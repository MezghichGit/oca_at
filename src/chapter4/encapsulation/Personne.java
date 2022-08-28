package chapter4.encapsulation;

public class Personne {
	
	private int age;
	private boolean work;

	public boolean isWork() {
		return work;
	}

	public void setWork(boolean work) {
		this.work = work;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		if(age < 0) System.out.println("L'age ne peut pas être négatif");
		else
		{
		 this.age = age;
		}
	}

}
