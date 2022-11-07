package Recursividade;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		Fatorial ft = new Fatorial();
		int fr = Integer.parseInt(JOptionPane.showInputDialog("Fatorial:\nDigite um numero"));
		JOptionPane.showMessageDialog(null, "O fatorial de "+fr+" é: "+ft.fatorialRecursivo(fr));
		
		int sr = Integer.parseInt(JOptionPane.showInputDialog("Fatorial:\nDigite um numero"));
		JOptionPane.showMessageDialog(null, "A soma fatorial de "+sr+" é: "+ft.somaRecursiva(sr));
		
		
		
	}

}
