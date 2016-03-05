package br.com.unicamp.inf323.aula3.questionario;

class StaticSuper {

    public static String staticGet() {

        return "Base staticGet()";

    }

    public String dynamicGet() {

        return "Base dynamicGet()";

    }

}

class StaticSub extends StaticSuper {

    public static String staticGet() {

        return "Derivado staticGet()";

    }
    public String dynamicGet() {

        return "Derivado dynamicGet()";

    }

}

public class PolimorfismoEstatico {

    public static void main(String[] args) {

        StaticSuper sup = new StaticSub();
        System.out.println(sup.staticGet());
        System.out.println(sup.dynamicGet());

    }

}