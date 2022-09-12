package Array_Bidimensional;

import javax.swing.JOptionPane;

public class matriz {
	
	public static void main(String[] args) {
		int[][] matriz = new int[2][3];
		
		int soma = 0;
		for(int linha=0;linha<2;linha++) {
			for(int coluna=0;coluna<3;coluna++) {
				matriz[linha][coluna] = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor:"));
				soma += matriz[linha][coluna];
			}
		}
		for(int linha=0;linha<2;linha++) {
			for(int coluna=0;coluna<3;coluna++) {
				System.out.print("|");
				System.out.print(matriz[linha][coluna]);
			}
			System.out.println("|");
		}
		
		JOptionPane.showInputDialog(null, "Soma dos elementos da matriz: "+soma);
	}

}
