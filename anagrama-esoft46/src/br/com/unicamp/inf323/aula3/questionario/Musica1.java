package br.com.unicamp.inf323.aula3.questionario;

class Instrumento {

    public void tocar(Nota n) {
    System.out.println("Instrumento.tocar()");

    }

}

class Violao extends Instrumento {

    public void tocar(Nota n) {

        System.out.println("Violao.tocar() " + n);

    }

}

class Guitarra extends Instrumento {

    public void tocar(Nota n) {

        System.out.println("Guitarra.play() " + n);

    }

}

public class Musica1 {

    public static void melodia(Violao i) {

        i.tocar(Nota.RE);
        i.tocar(Nota.MI);

    }
    public static void melodia(Guitarra i) {

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

