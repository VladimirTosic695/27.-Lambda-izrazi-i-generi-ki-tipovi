package paket;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int niz [] = new int [10];
		int niz1 [] = new int [10];
		
		for(int i = 0; i < 5; i++) {
		
		System.out.println("Unesite a");
		niz[i] = sc.nextInt();
		System.out.println("Unesite b");
		niz1[i] = sc.nextInt();
		
		ProveraDeljivosti broj = (n,m) -> (n % m) == 0;
		
		if(broj.deljiv(niz[i], niz1[i])) {
			System.out.println("Broj " + niz[i] + " je deljiv sa " + niz1[i]);
		} else {
			System.out.println("Broj " + niz[i] + " nije deljiv sa "  + niz1[i]);
		}
		
		}
		sc.close();
	}

}
