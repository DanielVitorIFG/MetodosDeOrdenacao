package MetodosOrdenação;
/**
 * @author Daniel Vitor
 *
 */
public class SelectionSort {

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
		int i,j;
		int menor;
		int aux;
		
		for(i=0; i<vetor.length;i++) {
			menor=i;
			for(j=i+1; j<vetor.length;j++) {
				if(vetor[j] < vetor[menor]) {
					menor=j;
					
					aux = vetor[menor];
					vetor[menor] = vetor[i];
					vetor[i] = aux;
				}
			}
		}
		
	}

}
