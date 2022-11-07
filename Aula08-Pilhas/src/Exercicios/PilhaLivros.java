package Exercicios;

public class PilhaLivros {
	
	String livros[];
	int topo;
	
	PilhaLivros(int qtdLivros){
		topo =-1;
		livros = new String[qtdLivros];
	}
	
	public boolean cheia() {
		return (topo == (livros.length-1));
	}
	
	public boolean vazia() {
		return (topo == -1);
	}

	public String toString() {
		String s = "[";
		for (int i=0; i<= topo; i++) {
			s = s + livros[i];
			if (i<topo) {
				s = s + ',';
			}
		}
		s = s + "]";
		return s;
	}
	
	public void empilha(String recebeLivro) {
		if (!cheia()) {
			topo++;
			livros[topo] = recebeLivro;
		}else {
			System.out.println("Pilha cheia");
		}
	}
	
	public String desempilha() {
		String valor = null;
		if (!vazia()) {
			valor = livros[topo];
			livros[topo] = null;
			topo--;
		} else {
			System.out.println("Pilha vazia!");
		}
		return valor;
	}
}
