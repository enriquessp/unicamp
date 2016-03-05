package br.com.unicamp.inf323.aula3.questionario;

class Pessoa {

    private StringBuilder log = new StringBuilder("inicio");
    public void append(String a) { log.append(a); }
    public void editar() { append(" editar()"); }
    public void remover() { append(" remover()"); }
    public String toString() { return log.toString(); }
    public static void main(String[] args) {

        Pessoa x = new Pessoa();
        x.editar();
        x.remover();
        System.out.println(x);

    }

}

public class Funcionario extends Pessoa {

    public void remover() {
        append(" Funcionario.remover()");
        super.remover();

    }
    public void novoMetodo() { append(" novoMetodo()"); }  
    public static void main(String[] args) {

        Funcionario x = new Funcionario();
        x.editar();
        x.remover();
        x.novoMetodo();
        System.out.println(x);
        System.out.println("Testing a class base");
        Pessoa.main(args);

    }

}