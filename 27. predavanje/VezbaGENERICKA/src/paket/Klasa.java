package paket;

public class Klasa <Tip, kip> {
	
	Tip podatak;
	kip obj2;
	
	public Klasa() {
	}
	
	Klasa(Tip p, kip o){
		podatak = p;
		obj2 = o;
	}
	
	public Tip getPodatak() {
		return podatak;
	}
	
	public void setPodatak(Tip ob) {
		podatak = ob;
	}
	
	public kip getObj2() {
		return obj2;
	}
	public void setObj2(kip o) {
		obj2 = o;
	}
	
	public String ispisi() {
		return "Podatak: " + podatak + "\nPodatak 2: " + obj2;
	}

}
