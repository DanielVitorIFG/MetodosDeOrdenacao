package MetodosOrdenação;

public class MergeSort {

	public static void main(String[] args) {
		int vetor[] = {5, 2, 7, 6, 2, 1, 0, 3, 9, 4};
		for(int i=0; i<vetor.length; i++) {
			System.out.print(vetor[i]+" ");
		}
		System.out.println();
		System.out.println("===================");
		mergeSort(vetor, 0, vetor.length-1);
		for(int i=0; i<vetor.length; i++) {
			System.out.print(vetor[i]+" ");
		}
	}


	private static void mergeSort(int[] vetor, int inicio, int fim) {
		if(inicio<fim) {
			int meio = (inicio+fim)/2;
			mergeSort(vetor, inicio, meio); //ordena do subvetor esquerdo, o meio faz papel de fim do subvetor1.
			mergeSort(vetor, meio+1, fim); //ordena do subvetor direito, o meio+1 faz papel de inicio do subvetor2.
			intercalar(vetor,inicio,meio,fim); // fusão dos 2 dois subvetores.
		}
	}

	private static void intercalar(int[] vetor, int inicio, int meio, int fim) {
		int tamanhoEsquerdo = meio-inicio+1; // tamanho do subvetor esquerdo.
		int tamanhoDireito = fim - meio; // tamanho do subvetor direito.
		int auxEsquerdo[] = new int[tamanhoEsquerdo]; // subvetor auxiliar esquerdo.
		int auxDireito[] = new int[tamanhoDireito];	// subvetor auxiliar direito.
		int idxEsquerda = 0; //índice do subvetor auxiliar esquerdo.
		int idxDireita = 0; //índice do subvetor auxiliar direito.
		
		//Copia os elementos do subvetor esquerdo para o vetor auxiliar
		for(int i=0; i<tamanhoEsquerdo; i++) {
			auxEsquerdo[i] = vetor[inicio+i];
		}
		
		//Copia os elementos do subvetor direito para o vetor auxiliar
		for(int j=0; j<tamanhoDireito; j++) {
			auxDireito[j] = vetor[meio+1+j];
		}
		
		// Intercalando os vetores
		for(int k=inicio; k<=fim; k++) {
			if(idxEsquerda < tamanhoEsquerdo) {
				if(idxDireita < tamanhoDireito) {
					if(auxEsquerdo[idxEsquerda] < auxDireito[idxDireita]) {
						vetor[k] = auxEsquerdo[idxEsquerda++];
					}
					else {
						vetor[k] = auxDireito[idxDireita++];
					}
				}
				else {
					vetor[k] = auxEsquerdo[idxEsquerda++];
				}
			}
			else {
				vetor[k] = auxDireito[idxDireita++];
			}
		}		
	}

}
