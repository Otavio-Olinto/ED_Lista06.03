package otavioolinto.pilhas;

public class PilhaStr {
	
	No topo;
	
	public PilhaStr() {

		topo = null;
	}
	
	// Método destinado para verificar se a pilha está vazia
	public boolean isEmpty() {
		
		return (topo == null) ? true:false;
	}
	
	// Método destinado para adicionar valores a pilha
	public void push(String palavra) {
		
		No elemento = new No();
		elemento.dado = palavra;
		
		if(isEmpty()) {
			
			topo = elemento;
			
		}else {
			
			elemento.proximo = topo;
			topo = elemento;
		}
	}
	
	// Método destinado a retirar valores da prilha
	// Este método pode retornar exceção caso sua pilha esteja vazia
	// Trate-a em sua aplicação.
	// Mensagem da exceção: Pilha vazia
	public String pop() throws Exception {
		
		if(isEmpty()) {
			
			throw new Exception("Pilha vazia"); 
		}
		
		String valor = topo.dado;
		topo = topo.proximo;
		
		return valor;
	}
	
	// Método destinado para consultar o valor do topo da pilha sem altera-la
	// Este método pode retornar exceção caso sua pilha esteja vazia
	// Trate-a em sua aplicação.
	// Mensagem da exceção: Pilha vazia
	public String top() throws Exception{
		
		if(isEmpty()) {
			
			throw new Exception("Pilha vazia");
		}
		
		return topo.dado;
	}
	
	// Método destinado a saber o tamanho da pilha
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
