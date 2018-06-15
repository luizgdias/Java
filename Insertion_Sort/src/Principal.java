
public class Principal {

	public static int[] insertionSort(int [] vetor) {
		for(int j = 1; j < vetor.length; j++) { //1� Compara da segunda posi��o at� o final
			int chave = vetor[j]; //2� A chave come�a tendo o valor da segunda posi��o
			int i = j - 1; //3� i recebe o valor da posi��o anterior de j
			
			//System.out.println("Valor da chave: vetor[j]: "+ chave);
			//System.out.println("Valor de i: "+ i);
			
			while(i >= 0 && vetor[i] > chave) { //4� Enquanto o vetor[i] for maior que a chave (vet[j])
				
				//troca os valores de i com j
				
				vetor[i+1] = vetor[i]; 
				i = i-1;
				
				vetor[i+1] = chave;	
			}				
		}
		
		return vetor;
	}
	
	public static void main(String [] args) {
		int [] vetor = {2,1,4,8,6,2,98,65,0};
		System.out.println("Vetor Original: ");
		for(int i=0; i < vetor.length;i++) {
			System.out.print(vetor[i] + "|");
		}
		
		
		
		int [] vetorOrdenado = insertionSort(vetor);
		System.out.println("\nVetor Ordenado");
		
		for(int i=0; i < vetorOrdenado.length; i++) {
			System.out.print(vetorOrdenado[i] + "|");
		}
	}
}
