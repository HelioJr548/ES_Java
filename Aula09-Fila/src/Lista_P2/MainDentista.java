package Lista_P2;

import java.util.Scanner;

public class MainDentista {
	public static void main(String[] args) {
		FilaDentista fd = new FilaDentista();
		Scanner ler = new Scanner(System.in);
		
//		Capacidade da fila		
		System.out.print("Quantas pessoas deseja atender hoje: ");
		fd.tamanho = ler.nextInt();
		
//		Inserir um paciente na fila de espera 
		int qtdPacientes;
		System.out.print("Há quantos pacientes na fila: ");
		qtdPacientes = ler.nextInt();
		for(int i = 0 ; i < qtdPacientes; i++) {
			System.out.print("Nome do Paciente: ");
			fd.adicionar(ler.next());
		}
		
//		Chamar o paciente para ser atendido 
		
		if(fd.vazia()) {
			System.out.println("Não há pacientes");
		}else {
			System.out.println("\nPacientes para ser atendido: "+fd.dados[fd.inicio]+"\n");					
		}
		
		
//		Verificar se a fila está cheia ou vazia
		if(fd.cheia()) {
			System.out.println("INFORMAÇÂO DA FILA: Fila cheia\n");
		} else if (fd.vazia()) {
			System.out.println("INFORMAÇÂO DA FILA: Fila vazia\n");
		}else {
			int vagas = fd.tamanho - fd.qtdeElementos;
			System.out.println("INFORMAÇÂO DA FILA: Ainda há "+vagas +" vaga(s) livre(s)\n");
		}
		
		
//		Informar o próximo paciente a ser atendido 
		fd.remover();
		if(fd.vazia()) {
			System.out.println("Não ha paciente na fila\n");
		}else {
			System.out.println("Paciente a ser atendido a seguir: "+fd.dados[fd.inicio]+"\n");					
		}
		
		
//		Exibir quantos pacientes existem na fila de espera
		System.out.println("Pacientes na fila de espera: "+fd.qtdeElementos+"\n");
	}
}