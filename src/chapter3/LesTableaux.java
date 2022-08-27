package chapter3;

import java.util.Arrays;

public class LesTableaux {

	public static void main(String[] args) {
		
		//déclaration et initialisation d'un tableau
		//int [] tab = new int[3];
		
		/*int  tab [] = new int[3];
		tab[0]=10;
		tab[1]=20;
		tab[2]=30;
		System.out.println(tab[0]);
		System.out.println(tab[1]);
		System.out.println(tab[2]);*/
		//int tab[] = {10,20,30};
		
		/*System.out.println(tab[0]);
		System.out.println(tab[1]);
		System.out.println(tab[2]);*/
		
		// Affichage d'un tableau for classique
		/*
		for(int i=0; i<tab.length; i++)
		{
			System.out.println(tab[i]);
		}*/
		
		// Affichage d'un tableau for each
		
		/*for(int e:tab)
		{
			System.out.println(e);
		}*/
		
		
		// tri d'un tableau
		/*
		int tab[] = {100,40,2,10,20,12,30};
		for(int e:tab)
		{
			System.out.print(e+"\t");
		}
		Arrays.sort(tab);  // tri d'un tableau
		System.out.println();
		for(int e:tab)
		{
			System.out.print(e+"\t");
		}*/
		/*
		String names[]= {"cc","aa","bb","nn","dd"};
		Arrays.sort(names);  // tri d'un tableau
		System.out.println();
		for(String name:names)
		{
			System.out.print(name+"\t");
		}*/
		
		// Les tableaux multi-dimensions
		
		/*int tab[]= {};
		int tabMul[][]= new int[3][];
		tabMul[0]=new int[2];
		tabMul[1]=new int[4];
		tabMul[2]=new int[0];
	
		System.out.println(tabMul.length);
		System.out.println(tabMul[0].length);
		System.out.println(tabMul[1].length);
		System.out.println(tabMul[2].length);
		tabMul[2][0]=10;*/
		
		//String [] names []= {{"amine","ali"},{"amine","ali","salah"},{"ala"}};
		Animal[]animals = {new Animal(1),new Animal(2),new Animal(3)};
		
		//Animal[]animals2 =  new Animal[3] ;
		
		System.out.println(animals);
		System.out.println(animals[2]);
	}

}
