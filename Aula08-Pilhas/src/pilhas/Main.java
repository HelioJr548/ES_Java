package pilhas;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		Pilha p1 = new Pilha(3);
		
		//Empilhando pilha
		System.out.print("Empilhando:");
		p1.empilha(3);
		p1.empilha(6);
		p1.empilha(9);
//		p1.empilha(12);		//Output: Pilha cheia!

		System.out.println(p1.toString());
		
		System.out.print("Desempilhar: ");
		p1.desempilha();
		System.out.println(p1.toString());

	}

}
