package If_Ternario;

import java.util.Scanner;

public class recebe_numeros {
	int a, b, c;
	
	public void numeros (int a,int b, int c) {
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Primeiro numero: ");
		a = ler.nextInt();
		System.out.println("Segundo numero: ");
		b = ler.nextInt();
		System.out.println("Terceiro numero: ");
		c = ler.nextInt();

	}

}
