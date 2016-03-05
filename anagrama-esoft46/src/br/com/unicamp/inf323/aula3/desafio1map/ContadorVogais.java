package br.com.unicamp.inf323.aula3.desafio1map;

import java.util.HashMap;
import java.util.Map;

public class ContadorVogais {

	public static void main(String args[]) {
		char[] sequencia = { 'A', 'p', 'e', 's', 'a', 'r', 'd', 'e', 'v', 'o', 'c', 'e', 'a', 'm', 'a', 'n', 'h', 'a',
				'h', 'a', 'd', 'e', 's', 'e', 'r', 'o', 'u', 't', 'r', 'o', 'd', 'i', 'a' };
		ContadorVogais contadorVogais = new ContadorVogais();
		Map<Character, Integer> contadores = contadorVogais.contarVogais(sequencia);
		int total = contadores.get('a') + contadores.get('e') + contadores.get('i')
				+ contadores.get('o') + contadores.get('u');

		System.out.println("Total de 'a': " + contadores.get('a'));
		System.out.println("Total de 'e': " + contadores.get('e'));
		System.out.println("Total de 'i': " + contadores.get('i'));
		System.out.println("Total de 'o': " + contadores.get('o'));
		System.out.println("Total de 'u': " + contadores.get('u'));
		System.out.println("Total de vogais: " + total);
	}

	public Map<Character, Integer> contarVogais(final char[] vogais) {
		Map<Character, Integer> vogaisMap = new HashMap<>();
		
		for (char character: vogais) {
			Character normalizaChar = Character.toLowerCase(character);
			vogaisMap.put(normalizaChar, vogaisMap.containsKey(normalizaChar) ? vogaisMap.get(normalizaChar)+1 : 1 );
		}
		
		return vogaisMap;
	}
}