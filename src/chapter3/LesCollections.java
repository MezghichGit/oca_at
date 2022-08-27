package chapter3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class LesCollections {

	public static void main(String[] args) {
		/*List<String> ls1 = new ArrayList<String>();
	
		ArrayList<String> ar1 = new ArrayList<String>();
		
		List<String> ls2 = new LinkedList<String>();
		
		ls1 = ls2;
		
		Set<String> set  =new HashSet<>();
		set.add("amine");
		set.add("ala");
		set.add("marwa");
		set.add("raghda");
		boolean res = set.add("amine");
		System.out.println(set);*/
		/*System.out.println(ls1.size());
		System.out.println(ls1.isEmpty());
		System.out.println(ls1);
		ls1.add("true");
		ls1.add("OCA");
		ls1.add("12");
		
		for(Object o : ls1)
		{
			String s = (String)o;
		}
		
		
		System.out.println("*********");
		System.out.println(ls.size());
		System.out.println(ls.isEmpty());
		System.out.println(ls);*/
		/*
		ArrayList<Integer> li = new ArrayList<>();
		li.add(12);  // Autoboxing
		li.add(new Integer(12));
		System.out.println(li);
		
		int x = li.get(0); // Unboxing
		
		float primitive = Float.parseFloat("123.5");
		System.out.println(primitive);*/
		/*
		Integer[]tab = {10,20,30};
		List<Integer>list = (List<Integer>)Arrays.asList(tab);
		System.out.println(list.get(0));
		System.out.println(list.get(1));
		System.out.println(list.get(2));
		tab[0]=15;
		list.set(0, 40);
		System.out.println(list.get(0));
		System.out.println(tab[0]);
		list.add(22);*/
		
		List<Integer> list = new ArrayList<>();
		list.add(23);
		list.add(2);
		list.add(3);
		list.add(42);
		System.out.println(list);
		Collections.sort(list);// sort : méthode de classe
		System.out.println(list);

	}

}
