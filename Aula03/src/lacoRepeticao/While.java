package lacoRepeticao;

import java.util.Scanner;

public class While {
		
		public void somar(int x, int soma) {
			while(x!=0) {
				Scanner ler = new Scanner(System.in);
				System.out.println("Para fechar o programa digite 0 \nDigite um numero: ");
				x = ler.nextInt();
				soma = soma + x;
			}
			System.out.println("A soma é: "+soma);
		}
		
		public void notas(double n, double media, double maior, double menor, int aprovado, int x) {
			while (x<=10) {
				Scanner ler = new Scanner(System.in);
				System.out.println("Nota: ");
				n = ler.nextDouble();
				
				//calculo da media
				media = media + n; 
				//maior
				if(n>maior) {maior = n;}
				//menor
				if(n<menor) {menor = n;}
				//aprovados
				if(n>=6) {aprovado++;}
				
				x++;
			}
			System.out.println("A maior nota é: "+maior);
			System.out.println("A menor nota é: "+menor);
			System.out.println("A media da sala é: "+media/10);
			System.out.println("Total de aprovados: "+aprovado);
		}
}


