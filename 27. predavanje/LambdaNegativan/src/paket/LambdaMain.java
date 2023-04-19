package paket;


public class LambdaMain {

	public static void main(String[] args) {
		
		Lambda la = (n) -> (n < 0) ;
		
		if(la.apstrMet(-5)) {
			System.out.println("Broj je negativan");
		} else {
			System.out.println("Broj je pozitivan");
		}
		
	}

}
