package chapitre2.Operateurs;

public class App {

	public static void main(String[] args) {
		//Les opérateurs unaires
		/*
		int x = 10;
		//int y = ++x; //pre-increment
		
		int y = x--;
		
		System.out.println("x = "+x);
		System.out.println("y = "+y);
		
		boolean res = false;
		
		res = !res;
		System.out.print(res);*/
		
		//int res = 2*(6+4)/(2+9)*3;
		//  2 * 10 / 11 * 3 = 20/11*3
		         //(2*6)+(4/2)+(9*3)
		//System.out.print(res);
		/*
		int x = 2;
		int y = 4;
		int res = 2* ++x - 2*x + 4* --y +--y;
		//        2* 3 - 2*3 +4 * 3 + 2 = 6 - 6 + 12 + 2= 14
		System.out.println("res="+res);
		System.out.println("x="+x);
		System.out.println("y="+y);*/
		int x = 2;
		int y = 4;
		//boolean res = (x>y)&&(++x>y); //shift-circuit
		//boolean res = (x>y)&(++x>y); 
		boolean res = (x<y)&&(++x>y);// doit continuer dans les deux cas
		//boolean res = (x<y)||(++x>y);//shift-circuit
		//boolean res = (x<y)|(++x>y); 
		//boolean res = (x>y)||(++x>y); // doit continuer dans les deux cas 
		System.out.println("x="+x);
		System.out.println("res="+res);

	}

}
