package MetodosOrdenação;

public class InsertionSort {
	public static void main(String[] args) {
		int vetor[] = { 19, 25, 23, 1 };

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
		int i,j;
		
		for(i=1; i<vetor.length;i++) {
			aux=vetor[i];
			for(j=i-1; j>=0 && aux > vetor[j];j--) {
				vetor[j+1] = vetor[j];
			}
			vetor[j+1] = aux;
		}
	}
}
