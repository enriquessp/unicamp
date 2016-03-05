package br.com.unicamp.inf323.aula3.questionario;

public class Musica2 {

    public static void melodia(Instrumento i) {

        i.tocar(Nota.RE);
        i.tocar(Nota.MI);

    }
    public static void main(String[] args) {

        Violao v = new Violao();
        Guitarra g = new Guitarra();
        melodia(v);
        melodia(g);

    }

}