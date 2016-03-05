package br.com.unicamp.inf323.aula2;

public class Clidlet {

	public final void flipper() {
		System.out.println("Clidlet");
	}
 	
	public static void main(String[] args) {
		new Clidlet().flipper();

		
		Tenor tenor = new Tenor();
		Singer singer = new Tenor();
		
		System.out.println(tenor.sing()+" "+singer.sing());
		
	}

	class Clidder {
		private final void flipper() {
			System.out.println("Clidder");
		}
	}
	

}

class Singer {
	void do1() {}
	
	public String sing() {
		return "la";
	}
}

class Tenor extends Singer {
	void do2() {}
	
	public String sing() {
		return "fa";
	}

}

class Chrome {
	void main() {
		Singer x1 = new Singer();
		Singer x2 = new Tenor();
		Tenor y1 = new Tenor();
		
	}
}