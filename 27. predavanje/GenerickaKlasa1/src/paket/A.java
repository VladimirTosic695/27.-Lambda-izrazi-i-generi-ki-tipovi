package paket;

public class A <T> { // Genericka klasa. Ovde je T paramater tipa koji ce biti zamenjen 
	// stvarnim tipom kada se napravi objekat tipa A
	
	T ob;
	
	A(T o){
		ob = o;
	}
	
	
	public void setOb(T ob) {
		this.ob = ob;
	}
	
	public T getOb() {
		return ob;
	}
	void prikaziTip() {
		System.out.println("Tip T je: "+ob.getClass().getName());
	}
	
	

}
