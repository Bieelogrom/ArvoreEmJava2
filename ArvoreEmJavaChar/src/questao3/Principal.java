package questao3;

import br.edu.fateczl.gabriel.ArvoreChar;

public class Principal {
	public static void main(String[] args) {
		char[] vetor = {'k','d','m','b','f','l','t','c','p','z','r'};
		ArvoreChar arvoreChar = new ArvoreChar();	
		
		for(char i : vetor) {
			arvoreChar.insert(i);
		}
		
		try {
			arvoreChar.remove('m');
			arvoreChar.prefixSearch();
			System.out.println(" ");
			arvoreChar.infixSearch();
			System.out.println(" ");
			arvoreChar.postfixSearch();
			System.out.println(" ");
			arvoreChar.search('r');
		}catch(Exception e) {
			System.err.println(e.getMessage());
		}
	}
}
