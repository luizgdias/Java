/*
 * M�todos:
 * 	isEmpty()	-	verifica se a pilha � vazia
 * 	size()		-	retorna o tamanho da pilha
 * 	pop()		-	empilha elementos
 * 	push()		-	desempilha elementos
 * 	top()		-	mostra o �ltimo elemento empilhado
 * */
public class Pilha {
	public Object[] vetor;
	public int ponteiro;
	
	/*construtor*/
	public Pilha() {
		this.ponteiro = -1; //a pilha esta vazia na posi��o -1
		this.vetor = new Object[100]; // 10 milh�es de posi��es
	}
	
	/*m�todo que verifica se a pilha e vazia*/
	public boolean isEmpty(){
		if (this.ponteiro == -1){
			return true;
		}
		return false;
	}
	
	/*m�todo que retorna o tamanho da pilha*/
	public int size(){
		if (this.isEmpty()){
			return 0;
		}
		return this.ponteiro+1; //porque o ponteiro come�a de -1
	}
	
	/*m�todo que retorna o �ltimo valor empilhado*/
	public Object top(){
		if (isEmpty()){
			return null;
		}
		return this.vetor[this.ponteiro];
	}
	
	/*m�todo que desempilha um item da pilha*/
	public Object pop(){
		if (isEmpty()){
			return null;
		}
		return this.vetor[this.ponteiro--];
	}
	
	/*m�todo que empilha*/
	public void push(Object valor) {
		if (this.ponteiro < this.vetor.length-1) { //verifica se o ponteiro n�o vai ultrapassar o tamanho do vetor
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
