package Exemplo;

public class No {

	private Contato contato;	//Chama a classe Contato para manipular os getrs e setrs
	private No proximo;	//Criamos uma referência chamada proximo
	
	No (Contato contato) {	//Recebemos a classe Contato com o objeto contato
		this.contato=contato;	
		this.proximo=null;
	}
	
	//Metodo get responsavel por pegar valor
	Contato getContato() {	
		return this.contato;
	}
	
	//Metodo set responsavel por inserir um valor
	public void setContato(Contato contato) {	
		this.contato=contato;
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
		return "No [contato=" + contato + ", proximo=" + proximo + "]";
	}
	
	
}
