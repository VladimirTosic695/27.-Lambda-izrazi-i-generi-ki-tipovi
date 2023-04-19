package paket;

public class Main {

	public static void main(String[] args) {
		
		A<Integer> intObjekat = new A<Integer>(100);
		
		intObjekat.prikaziTip();
		int vrednostIntObjekta = intObjekat.getOb();
		System.out.println("Vrednost: "+ vrednostIntObjekta);
		
		A<String> StringObj = new A<String>(" = ");
		StringObj.prikaziTip();
		System.out.println("Vrednost Stringa: " + StringObj.getOb());
		
		A<Double> doubleObj = new A<Double>(100.0);
		
		System.out.println(intObjekat.getOb() + StringObj.getOb() + doubleObj.getOb());

	}

}
