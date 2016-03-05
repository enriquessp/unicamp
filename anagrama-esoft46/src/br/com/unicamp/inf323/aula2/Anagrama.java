package br.com.unicamp.inf323.aula2;

import java.util.Arrays;
import java.util.Scanner;

public class Anagrama {

	public static void main(String[] args) {
		//		Scanner scanner = new Scanner(System.in);
		//		
		//		System.out.println("Insira a primeira palavra");
		//		String palavra1 = scanner.nextLine();
		//		
		//		System.out.println("Insira a segunda palavra");
		//		String palavra2 = scanner.nextLine();
		//		scanner.close();
		//		
		//		Anagrama anagrama = new Anagrama();
		//		if (anagrama.saoAnagrama(palavra1, palavra2)) {
		//			System.out.println("São anagramas");
		//		} else {
		//			System.out.println("Não são anagramas");
		//		}
		//
		//		System.out.println(anagrama.teste() & anagrama.teste());

		boolean b = teste1(0) && teste2(2) && teste3(2);
		boolean c = teste1(0) & teste2(2) & teste3(2);
		c = (c&b) & (teste3(1) && teste1(2) && teste2(1));
		System.out.println(incremento);

		int i1 = 35;
		int i2 = 175;
		int i3 = 045;
		System.out.println("Valor i3: "+i3);

		float f1 = 0x57f;
		double d1 = 3D;
		short x = 0x7fff;

		System.out.println("Valor f1: "+f1);
		System.out.println("Valor d1: "+d1);
		System.out.println("Valor x: "+x);

		i1 +=i1+i2+i3;
		x+=1;

		d1+=(i1*f1)/d1;
		d1-=x;
		System.out.println("d1 = "+ d1);
	}

	static int incremento;

	static boolean teste1(int valor) {
		System.out.println("teste1: "+(valor < 1));
		incremento += valor;
		return valor < 1;
	}

	static boolean teste2(int valor) {
		System.out.println("teste2: "+(valor < 2));
		incremento += valor;
		return valor < 2;
	}

	static boolean teste3(int valor) {
		System.out.println("teste3: "+(valor < 3));
		incremento += valor;
		return valor < 3;
	}

	public boolean teste() {
		System.out.println("rodou");
		return false;
	}

	public boolean saoAnagrama(String palavra1, String palavra2) {
		palavra1 = padronizaPalavra(palavra1);
		palavra2 = padronizaPalavra(palavra2);

		return palavra1.equals(palavra2);
	}

	String padronizaPalavra(String palavra) {
		palavra = palavra.toLowerCase().replaceAll(" ", "");

		char[] charArray = palavra.toCharArray();
		Arrays.sort(charArray);

		return new String(charArray);
	}

}