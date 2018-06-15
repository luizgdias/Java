
public class Principal {

	public static int[] insertionSort(int [] vetor) {
		for(int j = 1; j < vetor.length; j++) { //1º Compara da segunda posição até o final
			int chave = vetor[j]; //2º A chave começa tendo o valor da segunda posição
			int i = j - 1; //3º i recebe o valor da posição anterior de j
			
			//System.out.println("Valor da chave: vetor[j]: "+ chave);
			//System.out.println("Valor de i: "+ i);
			
			while(i >= 0 && vetor[i] > chave) { //4º Enquanto o vetor[i] for maior que a chave (vet[j])
				
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
