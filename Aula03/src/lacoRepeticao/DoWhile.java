package lacoRepeticao;

import java.util.Scanner;

public class DoWhile {
	
	public void menu() {
		int x;
		do {
			System.out.println("0 - Cadastrar \n1 - Consultar");
			Scanner ler = new Scanner(System.in);
			x = ler.nextInt();
			if(x>1) {
				System.out.println("Erro! Numero invalido!");
			}
		}while(x>1);
	}
}
