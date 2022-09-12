package Array_Bidimensional;

import javax.swing.JOptionPane;

public class matriz_sexo {

	public static void main(String[] args) {
		String[][] matriz = new String[5][2];
		String escolha;
		for(int linha=0;linha<5;linha++) {
			for(int coluna=0;coluna<2;coluna++) {
				if(coluna==0) {
					matriz[linha][coluna] = JOptionPane.showInputDialog("Digite um Nome:");					
				}else {
					matriz[linha][coluna] = JOptionPane.showInputDialog("Digite Sexo:");					
				}
				
			}
		}
		
		escolha = JOptionPane.showInputDialog("Digite Sexo:");
		
		for(int linha=0;linha<5;linha++) {
			for(int coluna=0;coluna<2;coluna++) {
				if(matriz[coluna].equals("h")) {
					
				}
				System.out.print("|");
				System.out.print(matriz[linha][coluna]);
			}
			System.out.println("|");
		}
		
	}
}
