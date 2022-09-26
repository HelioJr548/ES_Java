package Lista;

public class Numeros {

	int qtdItens;	//Numero de itens da lista
	int tamanho;	//Tamanho da lista / quantos itens ocupam a lista
	int []itens; 
	
	//Metodo Construtor
	Numeros(int n) {
		this.qtdItens = n;
		this.tamanho = 0;
		itens = new int[n];
	}
	
	
	public void adicionar(int n) {
		itens[tamanho] = n;
		tamanho++;
	}
	
	public int getNrItens() {
		return qtdItens;
	}
	
	public int getTamanho() {
		return tamanho;
	}
	
	public int pesquisar(int n) {
		int i;
		for (i = 0; i< getTamanho() && itens[i] != n; i++) {
		}
		if(itens[i] == n) {
			return i;			
		}else {
			return -1;			
		}
	}
	
	public void imprimir() {
		System.out.print("[");
		for(int i=0; i<getTamanho(); i++) {
			System.out.print(itens[i]);
			if(i<getTamanho()-1) {
				System.out.print(", ");
			}
		}System.out.print("]\n");
	}
}
