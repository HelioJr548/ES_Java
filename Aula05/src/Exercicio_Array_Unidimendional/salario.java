package Exercicio_Array_Unidimendional;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class salario {
	
	public static void main(String[] args) {
		double[]salario= new double[100];
        double[]novosalario= new double[100];
        double reajuste;
        int i=1;
       
        salario[0]=1;
       
        while(salario[(i-1)]!=-1) {
           
            salario[i]=Double.parseDouble(JOptionPane.showInputDialog("Digite o sal�rio" ));
            i++;           
        }
        reajuste=Double.parseDouble(JOptionPane.showInputDialog("Qual o reajuste?"));
       
        for(int x=1;x<=i-2;x++) {
            novosalario[x]=((reajuste*salario[x])/100)+salario[x];
            System.out.println("Sal�rio com reajuste:"+novosalario[x]);
        }
       
       
       
    }
}
