
public class Principal {

	public static int[] bubbleSort(int [] vetor) {
		int trocas = 0;
        for (int i = vetor.length - 1; i > 0; i--, trocas = 0) {
            for (int j = 0; j < i; j++)
                if (vetor[j] > vetor[j + 1]) {
                    trocar(vetor, j, j + 1);
                    trocas++;
                }
            if (trocas == 0) break;
        }
		
		return vetor;
	}
	
	private static void trocar(int[] vetor, int i, int j) {
        int aux = vetor[i];
        vetor[i] = vetor[j];
        vetor[j] = aux;
    }
	
	public static void main(String [] args) {
		int [] vetor = {2,1,4,8,6,2,98,65,0};
		System.out.println("Vetor Original: ");
		for(int i=0; i < vetor.length;i++) {
			System.out.print(vetor[i] + "|");
		}
		
		System.out.println();
		
		
		int [] vetorOrdenado = bubbleSort(vetor);
		System.out.println("Vetor Ordenado");
		
		for(int i=0; i < vetorOrdenado.length; i++) {
			System.out.print(vetorOrdenado[i] + "|");
		}
	}
}
