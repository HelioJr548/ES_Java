import java.util.Scanner;

public class Ex3 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int[][]matriz = new int[4][4];
		int maior = 0;
		int l=0;
		int c=0;
		
		for(int linha = 0; linha<4;linha++) {
			for(int coluna = 0; coluna<4;coluna++) {
				System.out.println("Adicione:");
				matriz[linha][coluna] = ler.nextInt();
			}
		}
		
		for(int linha = 0; linha<4;linha++) {
			for(int coluna = 0; coluna<4;coluna++) {
				if(matriz[linha][coluna]>maior) {
					maior = matriz[linha][coluna];
					l = linha;
					c =	coluna;

				}
			}
		}
		
		for(int linha=0;linha<4;linha++) {
			for(int coluna=0;coluna<4;coluna++) {
				System.out.print("|");
				System.out.print(matriz[linha][coluna]);
			}
			System.out.println("|");
		}
		
		System.out.println("\nPosição da matriz com maior valor:\nLinha:"+l+" | Coluna:"+c);
	}
}
