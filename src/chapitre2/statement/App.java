package chapitre2.statement;

public class App {

	public static void main(String[] args) {
		/*
		for(int i =0; i<10; i++)
		{
			//if(i==5) break;
			if(i==5) continue;
			System.out.println("i = "+i);
		}*/
		// La notion de label
		outer:for(int i =0; i<10;i++)  // i=0
		{
			for(int j=0;j<10;j++)
			{
				if(j==5) break outer;
				//if(j==5) continue outer;
				System.out.println("(i,j)=("+i+","+j+")");
			}
		}
		
		System.out.println("Suite du programme...");

	}

}
