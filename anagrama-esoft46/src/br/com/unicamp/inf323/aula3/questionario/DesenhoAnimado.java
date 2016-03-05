package br.com.unicamp.inf323.aula3.questionario;

class Arte {

    Arte() { System.out.println("Construtor Arte"); }

}

class Desenho extends Arte {

    Desenho() { System.out.println("Construtor Desenho");
    }

}

public class DesenhoAnimado extends Desenho {

    public DesenhoAnimado() { System.out.println("Construtor DesenhoAnimado"); }

    public static void main(String[] args) {

        DesenhoAnimado x = new DesenhoAnimado();

    }

}