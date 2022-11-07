import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int[] vetor = new  int[5];
		int maior = 0;
		int menor = 10000;
		
		for(int i = 0; i < vetor.length;i++) {
			System.out.print("Adicione: ");
			vetor[i] = ler.nextInt();
		}
		
		for(int i = 0; i < vetor.length;i++) {
			if(vetor[i] > maior ) {
				maior = i;
			}
			
			if(vetor[i]<menor) {
				menor = i;
			}
		}
		System.out.println("Posição com maior valor: "+maior);
		System.out.println("Posição com menor valor: "+menor);
	}

}
