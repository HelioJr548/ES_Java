package Exercicio_Array_Bidimensional;

import javax.swing.JOptionPane;

public class a_b_c {
	
	public static void main(String[] args) {
		int [][]A = new int[3][3];
		int [][]B = new int[3][3];
		int [][]C = new int[3][3];
		
		for(int linha=0;linha<A.length;linha++) {
			for(int coluna=0;coluna<A.length;coluna++) {
				A[linha][coluna]= Integer.parseInt(JOptionPane.showInputDialog("Digite um valor para a matriz A:"));
			}
		}
		
		for(int linha=0;linha<B.length;linha++) {
			for(int coluna=0;coluna<B.length;coluna++) {
				B[linha][coluna]= Integer.parseInt(JOptionPane.showInputDialog("Digite um valor para a matriz B:"));
			}
		}
		
		for(int linha=0;linha<C.length;linha++) {
			for(int coluna=0;coluna<A.length;coluna++) {
				C[linha][coluna] = A[linha][coluna]*B[linha][coluna];
			}
		}
		
		for(int linha=0;linha<A.length;linha++) {
			for(int coluna=0;coluna<A.length;coluna++) {
				System.out.print("|");
				System.out.print(A[linha][coluna]);
			}
			System.out.println("|");
		}
		System.out.println("");
		
		for(int linha=0;linha<B.length;linha++) {
			for(int coluna=0;coluna<B.length;coluna++) {
				System.out.print("|");
				System.out.print(B[linha][coluna]);
			}
			System.out.println("|");
		}
		System.out.println("");
		
		for(int linha=0;linha<C.length;linha++) {
			for(int coluna=0;coluna<C.length;coluna++) {
				System.out.print("|");
				System.out.print(C[linha][coluna]);
			}
			System.out.println("|");
		}
	}
	
}
