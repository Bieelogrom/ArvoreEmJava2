package questao2;

import br.edu.fateczl.gabriel.ArvoreInt;

public class Principal {
	public static void main(String[] args) {
		int[] vetor = {12, 16, 4, 2, 8, 6};
		ArvoreInt novaArvore = new ArvoreInt();
		
		for(int i : vetor) {
			novaArvore.insert(i);
		}
		
		try {
			novaArvore.search(6);
			// Remoção do 12 e exibição
			novaArvore.remove(12);
			novaArvore.postfixSearch();
		}catch(Exception e) {
			System.err.println(e.getMessage());
		}
	}
}
