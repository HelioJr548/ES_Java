package Array_Unidimensional;

import javax.swing.JOptionPane;

public class Programa {
	
	public static void main(String[] args) {
		
		double []notas= new double[5]; //Declaração do vetor para notas
		String []alunos= new String[5]; //Declaração do vetor para nomes
		
		int i; //Controle do laçgo
		double maiorNota=0;
		String maiorAluno = null;
		
		for (i=0;i<notas.length;i++) {
			//Inserir nome de aluno
			alunos[i]= JOptionPane.showInputDialog("Digite o nome do aluno:");
			//Inserir notas
			notas[i]= Double.parseDouble(JOptionPane.showInputDialog("Digite uma nota para o aluno:"));
		}
		
		for(i=0;i<notas.length;i++) {
			//Ler Array
			System.out.println(i+"O aluno(a) "+alunos[i]+" obteve: "+notas[i]);
			//Verifica maior nota
			if(notas[i]>maiorNota) {
				maiorNota = notas[i];
				maiorAluno= alunos[i];
			}
		}
		
		System.out.println("O aluno com maior nota foi: "+maiorAluno+", com nota: "+ maiorNota);
		
	}
}

