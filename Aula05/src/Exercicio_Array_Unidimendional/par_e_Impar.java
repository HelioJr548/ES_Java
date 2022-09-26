package Exercicio_Array_Unidimendional;

import javax.swing.JOptionPane;

public class par_e_Impar {
	/*Receba 10 numero inteiros em um vetor 
	  e só aceite numeros pares nas posições pares
	  e numeros impares nas posições impares*/
	public static void main(String[] args) {
		int []numeros = new int[10];
		int i=0;
		int x;
		while(i<numeros.length) {
			x =Integer.parseInt(JOptionPane.showInputDialog("Digite um valor:"));
			
			if(i%2!=0 && x%2!=0) {
				numeros[i] = x;
				i++;
			}else if(i%2==0 && x%2==0){
				numeros[i] = x;
				i++;
			}else {
				if(i%2!=0 && x%2==0) {
					JOptionPane.showMessageDialog(null, "Numero deve ser IMPAR");
				}else if(i%2==0 && x%2!=0){
					JOptionPane.showMessageDialog(null, "Numero deve ser PAR");
				}
			}
		}
		
		for(i=0; i<numeros.length;i++) {
			System.out.print(" | ");
			System.out.print(numeros[i]);
		}
		System.out.print(" | ");
	}
}
