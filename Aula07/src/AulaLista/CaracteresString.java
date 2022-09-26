package AulaLista;

public class CaracteresString {
	String[] lista;
	int nrItens;
	int tamanho;
	
	CaracteresString(int nrItens) {
		this.tamanho = 0;
		this.nrItens = nrItens;
		lista = new String[nrItens];
	}
	
	public void adicionar(String palavras) {
		lista[tamanho] =palavras;
		tamanho++;
	}
	
	public String concatenar() {
		String s="";
		for (int i=0;i < tamanho; i++) {
			s = s + " "+lista[i];
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

