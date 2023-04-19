package paket;

import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Main {
	
	public static void ispisivanje(LinkedList <Integer> in,LinkedList<String> s ) {
		System.out.println("\nIspis ocena: ");
		for(int i = 0; i < 5; i++) {
			System.out.println(s.get(i) + ": " + in.get(i));
		}
		
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Klasa<Integer, String> k1 = new Klasa<Integer, String>();
		
		LinkedList <Integer> kolekcijaInt = new LinkedList<Integer>();
		LinkedList<String> stringKolek = new LinkedList<String>();
		
		System.out.println("Unesite opisnu ocenu");
		for(int i = 0; i < 5; i++) {
			System.out.print("\nOpisna ocena: ");
			k1.setObj2(sc.nextLine());
			stringKolek.add(k1.getObj2());
			k1.setPodatak(i+1);
			kolekcijaInt.add(k1.getPodatak());
		}
		ispisivanje(kolekcijaInt, stringKolek);
		
		
		
		
	}
	

}
