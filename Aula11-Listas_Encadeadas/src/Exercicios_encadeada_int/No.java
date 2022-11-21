package Exercicios_encadeada_int;

public class No {

	private ListaIntEnc ListaIntEnc;	//Chama a classe Contato para manipular os getrs e setrs
	private No proximo;	//Criamos uma referência chamada proximo
	
	No (ListaIntEnc ListaIntEnc) {	//Recebemos a classe Contato com o objeto contato
		this.ListaIntEnc = ListaIntEnc;
		this.proximo=null;
	}
	
	//Metodo get responsavel por pegar valor
	public ListaIntEnc getListaIntEnc() {
		return ListaIntEnc;
	}
	
	//Metodo set responsavel por inserir um valor
	public void setListaIntEnc(ListaIntEnc listaIntEnc) {
		ListaIntEnc = listaIntEnc;
	}

	//Metodo getProximo vai receber para onde apontar
	public No getProximo() {	
		return proximo;
	}

	//Metodo setProximo vai receber o valor do proximo para achar o proximo elemento para linkar
	public void setProximo(No proximo) {	 
		this.proximo = proximo;
	}

	@Override
	public String toString() {
		return "No [ListaIntEnc=" + ListaIntEnc + ", proximo=" + proximo + "]";
	}

	
	

	
	
	
	
}

