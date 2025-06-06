package questao1;

import br.edu.fateczl.gabriel.ArvoreInt;

public class Principal {
	public static void main(String[] args) {
		int[] vetor = {30, 15, 60, 10, 20, 40, 80};
		ArvoreInt arvoreInt = new ArvoreInt();
		
		for(int i : vetor) {
			arvoreInt.insert(i);
		}
		
		try {
			//Ordem Crescente
			arvoreInt.infixSearch();
			//Remoção do 60 e exibição da árvore
			arvoreInt.remove(60);
			System.out.println(" ");
			arvoreInt.infixSearch();
		}catch(Exception e) {
			System.err.println(e.getMessage());
		}
	}
}
