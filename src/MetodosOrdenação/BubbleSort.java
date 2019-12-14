package MetodosOrdenação;

public class BubbleSort {	
	
	public static void main(String[] args) {		
		int vetor[] = {19,25,23,1};
		
		ordenar(vetor);
		imprimir(vetor);

	}

	private static void imprimir(int[] vetor) {
		for(int i=0; i<vetor.length; i++) {
			System.out.println(vetor[i]);
		}
		
	}

	private static void ordenar(int[] vetor) {
		int aux;
		for(int i=0; i<vetor.length; i++) {
			for(int j=0; j<vetor.length-1;j++) {
				if(vetor[j] >= vetor[j+1]) {
					aux = vetor[j+1];
					vetor[j+1] = vetor[j];
					vetor[j] = aux;
				}
			}
		}
	}
}
