package AulaLista;

public class Caracteres {
	char[] lista;
	int nrItens;
	int tamanho;
	
	Caracteres(int nrItens) {
		this.tamanho = 0;
		this.nrItens = nrItens;
		lista = new char[nrItens];
	}
	
	public void adicionar(char c) {
		lista[tamanho] =c;
		tamanho++;
	}
	
	public String concatenar() {
		String s="";
		for (int i=0;i < tamanho; i++) {
			s = s + lista[i];
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
