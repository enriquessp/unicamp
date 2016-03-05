package br.com.unicamp.inf323.aula2;

public class Aluno {

	private static int numeroAlunos;
	private String nome;
	
	public Aluno(String nome) {
		this.nome = nome;
		numeroAlunos++;
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public static int getNumeroAlunos() {
		return numeroAlunos;
	}

	public int complica() {
		Aluno z = new Aluno("Virgulino");
		return this.getNumeroAlunos();
	}

	public static void main(String[] args) {
		Aluno a,b,c;
		a = new Aluno("A");
		b = new Aluno("B");
		c = new Aluno("C");
//		System.out.println("escola1: "+a.getNumeroAlunos());
//		System.out.println("escola2: "+b.complica());
//		System.out.println("escola3: "+c.getNumeroAlunos());

		
		String s = "-";
		Integer x = 343;
		long L343 = 343L;
		if (x.equals(L343)) {
			s+=".e1";
		}
		if (x.equals(343)) {
			s+=".e2";
		}
//		Short s1 = (short) (new Short((short)343) / (new Short((short)49)));
//		if (s1 == 7) {
//			s += "=s ";
//		}
//		if (s1 < new Integer(7+1)) s+= "fly ";
//		System.out.println(s);
		
		String s1 = "abc";
		String s2 = s1;
		s1 += "d";
		System.out.print(s1+" "+s2+" "+(s1==s2));
		
		StringBuilder sb1 = new StringBuilder("abc");
		StringBuilder sb2 = sb1;
		sb1.append("d");
		System.out.print("; " +sb1+" "+sb2+" "+(sb1==sb2));
		
		
	
	}
	
}
