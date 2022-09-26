package Exercicio;

public class FrutasFavoritas {
	String[] frutas;
	int nrItens;
	int tamanho;
	
	FrutasFavoritas(int nrItens) {
		this.tamanho = 0;
		this.nrItens = nrItens;
		frutas = new String[nrItens];
	}
	
	public void adicionar(String palavras) {
		frutas[tamanho] = palavras;
		tamanho++;
	}
	
	public String concatenar() {
		String s="lista: ";
		for (int i=0;i < tamanho; i++) {
			s += frutas[i]+ " ";
		}
		return s;
	}
	
	public int getTamanho() {
		return this.tamanho;
	}
	
	public int getNrItens() {
		return this.nrItens;
	}
}
