package revision;

public class App {

	public static void main(String[] args) {
		C2 obj1 = new C1();
		I obj2 = new C1();
		//C2 s = obj2;
		//I t = obj1;
		String x = "XXXX-XXXX-XXXX-";
		String ch = "abcd-efgh-ijkl-mnop";
		StringBuilder sb = new StringBuilder(ch);
		sb.substring(15, 19);
		System.out.println(sb);
		System.out.println(x+sb);
	}

}
