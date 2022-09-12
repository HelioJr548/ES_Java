package lacoRepeticao;

import java.util.Scanner;

public class For {
	public void repeticaoFor() {
		for(int i=0;i<10;i++) {
			System.out.println("Bom dia");
			System.out.println(i);
		}
	}
	
	public void pares() {
		Scanner ler = new Scanner(System.in);
		System.out.println("Digite um numero: ");
		int x = ler.nextInt();
		System.out.println("Digite um numero: ");
		int y = ler.nextInt();
		for(int i=x; i<=y; i++) {
			if(i%2 == 0) {
				System.out.println(i);
			}
			
		}
	}
}
