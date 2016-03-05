package br.com.unicamp.inf323.aula3.questionario;

public class Base {

    private void f() { System.out.println("private f()"); }

    public static void main(String[] args) {

        Base x = new Derivada(); //upcasting
        x.f();

    }

}

class Derivada extends Base {

    public void f() { System.out.println("public f()"); }

}