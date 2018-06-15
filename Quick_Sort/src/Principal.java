public class Principal {

    public static int[] sort(int[] lista) {
        return sort(lista, 0, lista.length - 1);

    }

    private static int[] sort(int[] lista, int p, int r) {
    	//quebra o array em dois sub arrays e realiza o sort entre eles
        if (p < r) {
            int q = partition(lista, p, r);
            sort(lista, p, q - 1);
            sort(lista, q + 1, r);
        }
        return lista;
    }

    private static int partition(int[] lista, int e, int d) {
    
    	int sorteio = d;
        trocar(lista, d, sorteio);
        
        //define o pivo como o último elemento da lista
        int pivot = lista[d];
        
        //i inicializa antes do primeiro elemento
        int i = e - 1;
        
        //para j = o primeiro elemento até o penúltimo
        for (int j = e; j < d; j++)
        	//se o elemento atual for menor que o pivô
            if (lista[j] < pivot)
                trocar(lista, ++i, j);
        		trocar(lista, i + 1, d);
        return i + 1;
    }

    private static void trocar(int[] lista, int i, int j) {
        int aux = lista[i];
        lista[i] = lista[j];
        lista[j] = aux;
    }
    
	public static void main(String [] args) {
		int [] vetor = {2,1,4,8,6,2,98,65,0,111,90,-1,-500,9,32,23,11,1000};
		System.out.println("Vetor Original: ");
		for(int i=0; i < vetor.length;i++) {
			System.out.print(vetor[i] + "|");
		}
		
		System.out.println();
		
		
		int [] vetorOrdenado = sort(vetor);
		System.out.println("Vetor Ordenado - QuickSort");
		
		for(int i=0; i < vetorOrdenado.length; i++) {
			System.out.print(vetorOrdenado[i] + "|");
		}
	}

}
