package tarefas;

import java.util.Scanner;

public class tarefas {
	
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int i = 0;
		
		System.out.print("Quantidade de Tarefas:");
		int qtdTarefas = ler.nextInt();
		int nrItens = ler.nextInt();
		ListaString tf = new ListaString(nrItens);
		
		
		
		while (i< qtdTarefas) {
			String tarefa = ler.next();
			tf.adicionar(tarefa);
			i++;
		}
		System.out.println(tf.concatenar());
		
	}
		
}


	