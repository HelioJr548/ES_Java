package Exercicio;

import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		FrutasFavoritas ff = new FrutasFavoritas(5);
		
		int i = 1;
		while (i <= ff.nrItens) {
			System.out.println("Sua "+i+"° fruta favorita:");
			ff.adicionar(ler.nextLine());
			i++;
		}
		System.out.println(ff.concatenar());
	}

}
