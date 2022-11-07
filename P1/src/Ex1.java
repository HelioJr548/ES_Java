import java.util.Scanner;

public class Ex1 {
	
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int[] vetor = new  int[8];
		int x;
		int y;
		
		for(int i=0;i<vetor.length;i++) {
			System.out.print("Adicione um valor: ");
			vetor[i] = ler.nextInt();
		}
		
		System.out.println("Qual posição quer somar?: ");
		x = ler.nextInt();
		System.out.println("Qual posição quer somar?: ");
		y = ler.nextInt();

		System.out.println("Soma = "+(vetor[x]+vetor[y]));

	}
}
