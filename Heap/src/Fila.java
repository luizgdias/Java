public class Fila {
	private String[] pessoa;
	private Integer [] prioridade;
	private int fimFila;
	
	public Fila(int tamFila) {
		this.pessoa = new String[tamFila];
		this.prioridade = new Integer [tamFila];
		fimFila = -1;
	}
	
	/*recepcionar = enfileirar*/
	public void recepcionar(String nome, int valor) {
		if (fimFila == pessoa.length-1) {
			System.out.println("Não inserido, a fila está cheia!");
		}else {
			fimFila++;

			pessoa[fimFila] = nome;
			prioridade[fimFila] = valor;
		}
	}

	/*encerrar = desenfileirar*/
	public void encerrar() {
		if (fimFila < 0) {
			System.out.println("A fila está vazia!");
		}else {
			pessoa[0] = null;
			prioridade[0] = 1;
		}
		
		for(int x = 0; x < fimFila; x++) {
			pessoa[x] = pessoa[x+1];
			prioridade[x] = prioridade[x+1];
		}
		
		pessoa[fimFila] = null;
		prioridade[fimFila] = null;
		--fimFila;
	}
	
	public void imprimeFila() {
		System.out.println("\nTamanho maximo da fila: "+ pessoa.length +"\nFim da fila:" + (fimFila+1));
		for(int x = 0; x < pessoa.length; x++) {
			System.out.println("Pessoa [" + (x+1) + "] = " + pessoa[x] + " Prioridade ["+ (x+1)+"] = " + prioridade[x]);
		}
	}
	
	public void busca(String nome) {
		boolean n = false;
		for(int x = 0; x <= pessoa.length; x++) {
			if(pessoa[x].equals(nome)) {
				System.out.println("Encontrado: item["+ (x+1) + "] = " + pessoa[x]);
				n = true;
				break;
			}
		}
		
		if(n == false) {
			System.out.println("item buscado: "+nome + " :Este item nao esta na fila");
		}
	}
	
	/*Funcionalidades necessárias para transformar a fila em heap*/
	public void descer(int i) {
		int filho = 2*i+1;
		
		if (filho <= prioridade.length ) {
			if (filho < prioridade.length - 1) {
				if (prioridade[i] > prioridade[filho]) {
					filho = filho + 1;
				}
				
				if (prioridade[i] < prioridade[filho]) {
					int aux = prioridade [i];
					String aux2 = pessoa[i];
					
					prioridade[i] = prioridade[filho];
					pessoa[i] = pessoa[filho];
					
					pessoa[filho] = aux2;
					prioridade[filho] = aux;
					
					descer(filho);
				}
			}
		}
	}

	/*atender = faz o heap*/
	public void atender() {
		for (int i = prioridade.length/2; i >= 0; i--) {
			descer(i);
		}
	}
	
	public static void main(String[] args) {
		Fila fila = new Fila(5);
		fila.recepcionar("Luiz C", 18);
		fila.recepcionar("Kelli E", 25);
		fila.recepcionar("Alana M", 41);
		fila.recepcionar("Carlos A", 34);
		fila.recepcionar("Bernardo M", 27);
		fila.imprimeFila();
		fila.atender();
		fila.imprimeFila();
		fila.encerrar();

		//f.busca("Bernardo");
		fila.imprimeFila();

	}

}


