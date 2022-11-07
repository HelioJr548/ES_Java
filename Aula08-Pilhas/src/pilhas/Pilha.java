package pilhas;

public class Pilha {

	int pedidos[];	//recebe os dados
	int topo;	//verificar o topo da pilha
	
	Pilha (int qtdPedidos) {	//construtor
		topo =-1;	//verificar se a pilha esta vazia
		pedidos  = new int [qtdPedidos];	//pedido vai receber o valor que o ususario digitar
	}

	//metodo para verificar se a pilha esta cheia
	public boolean cheia() {
		return(topo==(pedidos.length-1));
	}
	
	//metodo verificar se esta vazia
	public boolean vazia() {
		return (topo == -1);
	}
	
	//imprimir
	public String toString() {
		String s = "[";
		for (int i=0; i<= topo; i++) {
			s = s + pedidos[i];
			if (i<topo) {
				s = s + ',';
			}
		}
		s = s + "]";
		return s;
	}
	
	public void empilha(int recebePedido) {
		if (!cheia()) {
			//se pilha vazia adicionar elemento ao topo
			topo++;
			pedidos[topo] = recebePedido;
		}else {
			System.out.println("Pilha cheia!");
		}
	}
	
	public int desempilha() {
		int valor = -1;
		if (!vazia()) {
			valor = pedidos[topo];
			pedidos[topo] = 0;
			topo--;
		} else {
			System.out.println("Pilha vazia!");
		}
		return valor;
	}
}
