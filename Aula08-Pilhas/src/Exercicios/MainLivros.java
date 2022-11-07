package Exercicios;

import java.util.Scanner;

public class MainLivros {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int op = 1;
		int qtdLivros;
		int i;
		while (op != 0) {
			if(op == 1) {
				System.out.println("Quantidade de livros na pilha:");
				qtdLivros = ler.nextInt();
				PilhaLivros l1 = new PilhaLivros(qtdLivros);
				for(i=0;i<qtdLivros;i++) {
					System.out.print("Inserir livros: ");
					l1.empilha(ler.next());
				}
			}
			
		}
		
		
		//Empilhando pilha
		System.out.print("Empilhando:");
		l1.empilha(ler.next());
		
//		p1.empilha(12);		//Output: Pilha cheia!

		System.out.println(l1.toString());
		
		System.out.print("Desempilhar: ");
		l1.desempilha();
		System.out.println(l1.toString());

	}

}


