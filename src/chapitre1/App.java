package chapitre1;

public class App {
/*
	public static int somme(int a, int b)
	{
		return a+b;
	}
	public static int somme(int a, int b, int c)
	{
		return a+b+c;
	}*/
	
	public static int somme(int ...a)
	{
		int res = 0;
		for(int i=0; i<a.length; i++)
		{
			res = res + a[i];
		}
		return res;
	}
	public static final void main(String ... t ) {
		
		final int x1 =10;
		//x1++;
		System.out.println(x1);
		System.out.println(somme(10,20));
		System.out.println(somme());
		System.out.println(somme(10,20,30,40));
		//float moy = 12.5F; // F : permet de réserver un espace de float 32 bits au lieu de double 64 bits
		
		System.out.println(Integer.MAX_VALUE);  // 32 bits : 2147483647
		System.out.println(Long.MAX_VALUE);     // 64 bits : 9223372036854775807
		long x = 922_3_372_036_854L; // L: indique qu'il faut réserver un espace de 64 bits
		
		/*
		int x = 0X12F3E;  //0x ou 0X : nombre dans la base hexadécimale
		System.out.println("x = "+x);
		
		int k = 071;   // nombre dans la base octale
		System.out.println("k = "+k);
		
		int v = 0b111;  // nombre dans la base binaire : 0b ou 0B
		System.out.println("v = "+v);*/
		// Commentaire sur une seule ligne
		/*
		System.out.println(Byte.MAX_VALUE);
		System.out.println(Byte.MIN_VALUE);
		
		System.out.println(Integer.MAX_VALUE); //2 147 483 647
		System.out.println(Integer.MIN_VALUE);
		
		int x = 1_002_000;
		double moy = 1_6.5;
		System.out.println("x = "+x);
		System.out.println("moy = "+moy);*/
		/*
		String Public="Hello"; 
		System.out.println("Hello OCA");
		byte x1 = 10;
		System.out.println("x = "+x1);  //message mixte
		*/

	}

}
