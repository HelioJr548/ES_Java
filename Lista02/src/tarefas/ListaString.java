package tarefas;

public class ListaString {
	String[] lista;
	int nrItens;
	int tamanho;
	
	ListaString(int nrItens) {
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
	
	public int pesquisar(String n) {
		int i;
		for (i=0; i<getTamanho() && lista[i] != n;i++) {}
		if (lista[i] == n) {
			return i;
		}else {
			return -1;
		}
	}
}


