package paket;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Unesite broj.");
		int broj = sc.nextInt();
		
		Test neparan = (n) -> (n) > 0;
		
		if(neparan.test(broj)) {
			System.out.println("Broj je pozitivan");
		} else {
			System.out.println("Broj je negativan.");
		}

	}

}
