package Exercicios_encadeada_int;


public class ListaInt {

	private int tamanho;	//Tamanho da lista para quando precisar
	private No inicio;	//Inicio da lista
	
	public ListaInt() {	//Contrutor
		tamanho=0;
		inicio=null;
	}
	//Metodo adicionar vai utilizar a clase Contato, por isso chamamos como parametro
	public void adicionar (ListaIntEnc ListaIntEnc) {	
		//Auxiliar é o objeto que aponta para a classe contato
		//Quando utilizamos uma referencia que vamos utilizar qualquer elemento de outra classe utilizamos o find
		ListaIntEnc auxiliar = find(ListaIntEnc.getNumero());	

		if(auxiliar==null) {	//Se não tiver nehum contato vamos adicionar o valor contato digitado e utilizar o metodo o inicio da lista				
			No no=new No(ListaIntEnc);					
			no.setProximo(inicio);
			inicio=no;
			tamanho++;	//Depois que adicionar nossa lista cresce com o tamanho++
	} else {
		System.out.println("Erro");
	}}
	
	public ListaIntEnc find(int numero) {	//A ação do find do segundo atributo de classe. Se tivemos mais de um elemento colocariamos no parametros
		for (No no=inicio;no!=null;no=no.getProximo()) {	//Laço para percorrer nossa lista utilizando o inicio e verificando quando estiver null
			if(no.getListaIntEnc().getNumero()==numero) {
				return no.getListaIntEnc();
			}
		}
		return null;
	}
	
	public void print() {	//Metodo para percorrer nossa lista e mostrar na tela
		for (No no=inicio;no!=null;no=no.getProximo()) {
			System.out.println(no.getListaIntEnc());
		}
	}
	
}

