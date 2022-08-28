package chapter4.LambdaExpression;

import java.util.ArrayList;
import java.util.function.Predicate;

public class Main {

	public static void main(String[] args) {
		
		Prediction p1 = (String ch)->{return ch.length()>6;}; // expression Lambda verbose
		Prediction p2 = ch->ch.startsWith("oc");  // expression lambda réduite
		
		System.out.println(p1.test("ocaocpspring"));
		System.out.println(p2.test("spring"));
		
		Prediction.info2();
		/*
		ML ml = new ML();
		ml.info1();*/
		/*
		Operation OpSom = (double a, double b)->{return a+b;};  // expression Lambda verbose
		Operation OpSom1 = (a,b)->{return a+b;}; 
		
		Operation OpSom2 = (a,b)-> a+b; // expression Lambda réduite
		
		Operation OpMult = (double a, double b)->{return a*b;}; // expression Lambda
		System.out.println(OpSom.calcul(10, 20)); 
		System.out.println(OpMult.calcul(10, 20));
		
		Predicate<String>pred = (String s)->{return s.contains("oc");};
		
		System.out.println(pred.test("ocaocp"));*/
		
		ArrayList<String> names = new ArrayList<>();
		names.add("amine");
		names.add("moez");
		names.add("ali");
		names.add("ahmed");
		names.add("salah");
		
		System.out.println(names);
		//Predicate<String>filter1 = (String ch)->{return !ch.startsWith("a");};
		//names.removeIf(filter1);
		Predicate<String>filter2 = ch->{return ch.contains("m");};
		names.removeIf(filter2);
		System.out.println(names);
		
		
		

	}

}
