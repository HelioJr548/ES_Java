package AulaLista;

import java.util.ArrayList;
import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Caracteres lChar = new Caracteres(lChar.nrItens);
//		lChar.adicionar('H');
//		lChar.adicionar('e');
//		lChar.adicionar('l');
//		lChar.adicionar('i');
//		lChar.adicionar('o');
//		System.out.println(lChar.concatenar());
		
		
		Scanner ler = new Scanner(System.in);
		int i = 0;
		System.out.print("Quantidade de letras no nome:");
		int nrItens = ler.nextInt();
		Caracteres lChar1 = new Caracteres(nrItens);
		while(i < nrItens) {
			lChar1.adicionar(ler.next().charAt(0));
			i++;
		}
		System.out.println(lChar1.concatenar());
		
		
//		CaracteresString lString = new CaracteresString(2);
//		lString.adicionar("Helio");
//		System.out.println(lString.concatenar());
		
		ArrayList<String>nomes = new ArrayList();
		nomes.add("Helio");
		nomes.add("Lais");
		nomes.add("Lucas");
		System.out.println(nomes);
		
		
	}

}
