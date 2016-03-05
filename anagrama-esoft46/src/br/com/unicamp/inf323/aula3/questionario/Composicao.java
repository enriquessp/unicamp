package br.com.unicamp.inf323.aula3.questionario;

class Componente {

    private String s;
    Componente() {

        System.out.println("Componente()");
        s = "Constructed";

    }
    public String toString() { return s; }

}

public class Composicao {

    private String s = "Happy";
    private Componente c1;
    public Composicao() {

        System.out.println("Dentro de Composicao()");
        c1 = new Componente();

    }
    public String toString() {

        return "s = " + s + "\n" + "Componente = " + c1;

    }
    public static void main(String[] args) {

        Composicao b = new Composicao();
        System.out.println(b);

    }

}
