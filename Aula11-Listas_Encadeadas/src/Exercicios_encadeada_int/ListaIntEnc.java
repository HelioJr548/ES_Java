package Exercicios_encadeada_int;

public class ListaIntEnc {
	
	private int numero;
	
	ListaIntEnc() {
		
	}
	
	ListaIntEnc(int numero){
		this.numero=numero;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	@Override
	public String toString() {
		return "ListaIntEnc [numero=" + numero + "]";
	}

}
