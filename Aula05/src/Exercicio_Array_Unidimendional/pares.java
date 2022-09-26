package Exercicio_Array_Unidimendional;

import javax.swing.JOptionPane;

class pares {
	
	public static void main(String[] args) {
		int []numeros = new int[10];
		int somapares = 0;
		for(int i=0; i<numeros.length;i++) {
			numeros[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor:"));
			if (i%2==0) {
				somapares += numeros[i];
			}
		}
		
		for(int i=0; i<numeros.length;i++) {
			System.out.print(numeros[i]+" ");
		}
		System.out.println("Soma do valores das posições pares: "+somapares);

	}

}
