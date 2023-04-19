 package paket;

public class Main {

	public static void main(String[] args) {
		
		TestiraBroj paranBroj = (n) -> (n % 2) == 0;
		
		if(paranBroj.test(10)) {
			System.out.println("Broj je paran.");
		} else {
			System.out.println("Broj nije paran.");
		}
		
		TestiraBroj neparanBroj = (n) -> (n % 2) != 0;
		
		if(neparanBroj.test(11)) {
			System.out.println("Neparan! ");
		} else {
			System.out.println("Paran! ");
		}

	}

}
