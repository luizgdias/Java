/*
 * Métodos:
 * 	isEmpty()	-	verifica se a pilha é vazia
 * 	size()		-	retorna o tamanho da pilha
 * 	pop()		-	empilha elementos
 * 	push()		-	desempilha elementos
 * 	top()		-	mostra o último elemento empilhado
 * */
public class Pilha {
	public Object[] vetor;
	public int ponteiro;
	
	/*construtor*/
	public Pilha() {
		this.ponteiro = -1; //a pilha esta vazia na posição -1
		this.vetor = new Object[100]; // 10 milhões de posições
	}
	
	/*método que verifica se a pilha e vazia*/
	public boolean isEmpty(){
		if (this.ponteiro == -1){
			return true;
		}
		return false;
	}
	
	/*método que retorna o tamanho da pilha*/
	public int size(){
		if (this.isEmpty()){
			return 0;
		}
		return this.ponteiro+1; //porque o ponteiro começa de -1
	}
	
	/*método que retorna o último valor empilhado*/
	public Object top(){
		if (isEmpty()){
			return null;
		}
		return this.vetor[this.ponteiro];
	}
	
	/*método que desempilha um item da pilha*/
	public Object pop(){
		if (isEmpty()){
			return null;
		}
		return this.vetor[this.ponteiro--];
	}
	
	/*método que empilha*/
	public void push(Object valor) {
		if (this.ponteiro < this.vetor.length-1) { //verifica se o ponteiro não vai ultrapassar o tamanho do vetor
			this.vetor[++ponteiro]=valor;
		}
		
	}
	
	public static void main(String[] args) {
		Pilha p = new Pilha();
		p.push("L");
		p.push("U");
		p.push("I");
		p.push("Z");
		p.push("G");
		p.pop();
		
		while (p.isEmpty() == false) {
			
			System.out.println(p.pop());
		}
		
	}
}
