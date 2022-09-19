package Lista;

import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {
		Numeros lista = new Numeros(3);	// Instancia dando o tamanho da lista
		lista.adicionar(5);	// 0
		lista.adicionar(7);	// 1
		lista.adicionar(8);	// 2
//		lista.adicionar(5);	 Erro por tamanho fora do limite
		lista.imprimir();	//Imprime lista
		
		Numeros n1 = new Numeros(4);	//
		Scanner ler = new Scanner(System.in);
		for(int i=0; i<4; i++) {
			n1.adicionar(ler.nextInt());
		}
		
		n1.imprimir();
	}

}
