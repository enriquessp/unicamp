package br.com.unicamp.inf323.aula3.desafio1map;

public class Contador {
	private int num; // valor do contador

	public void incrementa() {
		num = num + 1;
	}

	public void decrementa() {
		num = num - 1;
	}

	public void comeca(int n) {
		num = n;
	}

	public int retornaNum() {
		return this.num;
	}
}
