
public class Fila {
	private String[] alunos;
	private int fimFila;
	
	public Fila(int tamFila) {
		this.alunos = new String[tamFila];
		fimFila = -1;
	}
	
	public void enfileira(String nome) {
		if (fimFila == alunos.length-1) {
			System.out.println("Não inserido, a fila está cheia!");
		}else {
			fimFila++;
			alunos[fimFila] = nome;
		}
	}
	
	public void desenfileira() {
		if (fimFila < 0) {
			System.out.println("A fila está vazia!");
		}else {
			alunos[0] = null;
		}
		
		for(int x = 0; x < fimFila; x++) {
			alunos[x] = alunos[x+1];
		}
		alunos[fimFila] = null;
		--fimFila;
	}
	
	public void imprimeFila() {
		System.out.println("\nTamanho maximo da fila: "+ alunos.length +"\nFim da fila:" + (fimFila+1));
		for(int x = 0; x < alunos.length; x++) {
			System.out.println("Item [" + (x+1) + "] = " + alunos[x]);
		}
	}
	
	public void busca(String nome) {
		boolean n = false;
		for(int x = 0; x <= alunos.length; x++) {
			if(alunos[x].equals(nome)) {
				System.out.println("Encontrado: item["+ (x+1) + "] = " + alunos[x]);
				n = true;
				break;
			}
		}
		
		if(n == false) {
			System.out.println("item buscado: "+nome + " :Este item nao esta na fila");
		}
	}
	
	public void uniao(Fila f1) {
		System.out.println(f1);
		
	}
	
	public static void main(String[] args) {
		Fila f = new Fila(6);
		Fila f2 = new Fila(6);
		f.enfileira("Luiz Carlos");
		f.enfileira("Kelli");
		f.enfileira("Carlos");
		f.enfileira("Alana");
		f.enfileira("Bernardo");
		
		f2.enfileira("Luiz Carlos2");
		f2.enfileira("Kelli2");
		f2.enfileira("Carlos2");
		f2.enfileira("Alana2");
		f2.enfileira("Bernardo2");
		f2.busca("Bernardo2");
		f.imprimeFila();
		f.imprimeFila();
		
		f.uniao(f);

	}

}


