package Lista;

import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
//		Numeros lista = new Numeros(3);	// Instancia dando o tamanho da lista
//		lista.adicionar(5);	// 0
//		lista.adicionar(7);	// 1
//		lista.adicionar(8);	// 2
//		lista.adicionar(5);	 Erro por tamanho fora do limite
//		lista.imprimir();	//Imprime lista
		
//		Numeros n1 = new Numeros(4);	//
//		for(int i=0; i<4; i++) {
//		System.out.print("Digite o "+i+"° numero:");
//			n1.adicionar(ler.nextInt());
//		}
//		n1.imprimir();
		
		
		Numeros numero = new Numeros(5);
//		numero.adicionar(2);	// 0
//		numero.adicionar(3);	// 1
//		numero.adicionar(4);	// 2
//		numero.adicionar(5);	// 3
//		numero.adicionar(6);	// 4

		for(int i=1; i<=numero.qtdItens; i++) {
		System.out.print("Digite o "+i+"° numero:");
			numero.adicionar(ler.nextInt());
		}
		
		numero.imprimir();
		System.out.println("Procurando 3 na lista -> Resultado indice ="+numero.pesquisar(3));
		
		System.out.println(numero.remover());
		numero.imprimir();
		
	}

}
