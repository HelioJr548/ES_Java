package ListaDeTarefas;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Tarefa lista = new Tarefa(1);
        Scanner ler = new Scanner(System.in);
        int op = 1;
        while (op != 0) {
            System.out.println("Lista de Tarefas\n[1] - Adicionar tarefa\n[2] - Pesquisar tarefa\n[3] - Listar tarefas\n[0] - Sair");
            System.out.print("Opção: ");
            op = ler.nextInt();

            if (op == 1) {
                System.out.println("Digite a tarefa (Obs: utilize (-) para separar palavras): ");
                String tarefa = ler.next();
                lista.adicionar(tarefa);
                System.out.println();
            } else if (op == 2) {
                System.out.println("Qual tarefa deseja pesquisar? (Obs: utilize (-) para separar palavras):");
                String tarefa = ler.next();
                String achou = lista.pesquisar(tarefa);
                if (achou.equals("ok")) {
                    System.out.println("Ok. Item Localizado!\n");
                } else if (achou.equals("false")) {
                    lista.adicionar(tarefa);
                    System.out.println("Item não encontrado.\nTarefa incluida com sucesso!\n");
                }
            } else if (op == 3) {
                System.out.println("Lista de tarefas");
                System.out.println(lista.concatenar());
                System.out.println();
            } else if (op == 4){
                System.out.println("\nFinalizado");
            }
        }
        System.out.println("\n");
        System.out.println("Lista de tarefas");
        System.out.println(lista.concatenar());

    }
}