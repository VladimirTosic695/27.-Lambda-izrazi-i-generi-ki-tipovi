package paket;

public class MainNiz {
	
	public static <Tip> void ispis(Tip n []){
		for(Tip i : n) {
			System.out.printf("%s ", i);
		}
	} 

	public static void main(String[] args) {
		
		Integer niz [] = {2,3,4,5,6};
		
		ispis(niz);
	

	}

}
