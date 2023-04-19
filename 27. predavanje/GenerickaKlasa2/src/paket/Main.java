package paket;

public class Main {

	public static void main(String[] args) {
		
		A<Integer, String> objekat1 = new A<Integer, String>(100, "Java");
		
		objekat1.prikaziTip();
		System.out.println("Vrednost T: " + objekat1.getObj1() + "\nVrednost V: " + objekat1.getObj2());
		String drugi = objekat1.getObj2();
		
		A<String, Double> objekat2 = new A<String, Double>("Tekst 123", 123.45);
		
		objekat2.prikaziTip();
		String s = objekat2.getObj1();
		double d = objekat2.getObj2();
		
		System.out.println("Vrednost S: " + s + "\nVrednost d: " + d);
		

	}

}
