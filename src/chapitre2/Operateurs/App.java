package chapitre2.Operateurs;

public class App {

	public static void main(String[] args) {
		//Les opérateurs unaires
		
		int x = 10;
		//int y = ++x; //pre-increment
		
		int y = x--;
		
		System.out.println("x = "+x);
		System.out.println("y = "+y);
		
		boolean res = false;
		
		res = !res;
		System.out.print(res);

	}

}
