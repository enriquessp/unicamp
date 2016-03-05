package br.com.unicamp.inf323.aula3.questionario;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

class Top {
	String name = "peludo ";
	
	public Top(String s) {
		System.out.println("aaa");
	}
	
	String makeNoise(){return "generico"; }
}

class Bottom extends Top {
	String name = "listras ";

	public Bottom(String s ) {
		super(s);
		System.out.println("ddd");
	}
	
	String makeNoise(){return "zurro"; }
}


class A {
	
}

class B extends A {
	
}

public class Base {

	static void sifter(A[]... as) {
		System.out.print("1");
	}

	static void sifter(B[]... bs) {
		System.out.print("2");
	}

	static void sifter(B[] bs) {
		System.out.print("3");
	}
	
	static void sifter(Object bs) {
		System.out.print("4");
	}

	private void f() { System.out.println("private f()"); }

	class Business {}
	class Hotel extends Business {}
	class Inn extends Hotel {}
	
	class Travel {
		ArrayList<Hotel> go() {
//			return new ArrayList<Inn>(); errado
//			return new ArrayList<Business>(); errado
//			return new ArrayList<Object>(); errado
			return new ArrayList<>();
		}
	}
	
    public static void main(String[] args) {

    	A[] as = new A[2];
    	B[] bs = new B[2];
    	System.out.print("-");
    	sifter(as);
    	sifter(bs);
    	sifter(7);
    	
    	
//    	Top t = new Bottom("ds" );
//    	System.out.println(t.name+t.makeNoise());
//    	List<List<Integer>> table = new ArrayList<>();
//    	
//        Base x = new Derivada(); //upcasting
//        x.f();

    }

}

class Derivada extends Base {

    public void f() { System.out.println("public f()"); }

}