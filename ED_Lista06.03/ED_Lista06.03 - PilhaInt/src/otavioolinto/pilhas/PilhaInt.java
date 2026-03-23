package otavioolinto.pilhas;

public class PilhaInt {

	No topo;
	
	public PilhaInt() {
		
		topo = null;
	}
	
	// Método destinado para verificar se a pilha está vazia
	public boolean isEmpty() {
		
		return (topo==null) ? true:false;
		
	}
	
	// Método destinado para adicionar elementos a pilha
	public void push(int num) {
		
		No elemento = new No();
		
		elemento.dado = num;
		
		if(isEmpty()) {
			
			topo = elemento;
			
		}else {
			
			elemento.proximo = topo;
			topo = elemento;
		}
		
	}
	
	// Método destinado para retirar elementos da pilha
	// Este método pode retornar exceção caso sua pilha esteja vazia
	// Trate-a em sua aplicação.
	// Mensagem da exceção: Pilha vazia
	public int pop() throws Exception{
		
		if(isEmpty()) {
			
			throw new Exception("Pilha vazia");
		}
		
		int valor = topo.dado;
		topo = topo.proximo;
		
		return valor;
	}
	
	// Método destinado para saber o valor do topo da pilha sem retira-lo
	// Este método pode retornar exceção caso sua pilha esteja vazia
	// Trate-a em sua aplicação.
	// Mensagem da exceção: Pilha vazia
	public int top() throws Exception{
		
		if(isEmpty()) {
			
			throw new Exception("Pilha vazia");
		}
		
		return topo.dado;
	}
	
	// Método destinado para saber o tamanho da pilha
	public int size() {
		
		int tamanho = 0;
		
		if(!isEmpty()) {
			
			tamanho++;
			No noAux = topo;
			
			while(noAux.proximo!=null) {
				
				tamanho++;
				noAux = noAux.proximo;
			}
		}
		
		return tamanho;
	}
}
