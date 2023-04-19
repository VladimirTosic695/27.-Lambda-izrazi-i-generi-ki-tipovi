package paket;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class Main {

	public static void main(String[] args) {
		
		
	/*	OkreniString okr = (st) -> {
		List<String> kolekcija = new LinkedList<String>();
		
		ListIterator<String> iter = kolekcija.listIterator();
		
		List <Character> kolek = new LinkedList<Character>();
		char n;
		kolekcija.add(st);
		for(int i = 1; i < 7; i++) {
			n = kolekcija.toString().charAt(i);
			kolek.add(n);
		}
		ListIterator<Character> it = kolek.listIterator();
		String s = "";
		for(int i = 0; i < kolek.size(); i++) {
			s += kolek.get(i);
		}
		return s;
		
		};
		
		*/
		OkreniString okr = (st) -> { 
			String s = "";
			
			for(int i = st.length() - 1; i >= 0; i--) {
				s += st.charAt(i);
				
			}
			return s;
			
			
			
		};
		
		
		
		System.out.println("12345 " + okr.OkreniString("12345 "));
		System.out.println("Java obrnuto: " + okr.OkreniString("Java"));
		System.out.println("Ana voli Milovana " + okr.OkreniString("Ana voli Milovana "));

	}

}
