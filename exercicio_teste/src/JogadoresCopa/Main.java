package JogadoresCopa;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("Quantos jogadores deseja convocar? ");
        int qtdJogadores = ler.nextInt();
        Escalacao jogadores = new Escalacao(qtdJogadores);

        for (int i = 0; i < qtdJogadores;i++){
            System.out.println("\nDigite o nome do jogador (Obs: utilize (-) para separar nomes. EX: Neymar-Junior):");
            jogadores.adicionar(ler.next());
        }


        System.out.println("\nPesquisar jogador?");
        String retorno = jogadores.pesquisar(ler.next());
        System.out.println(retorno);

        System.out.println("\nLista de Jogadores Convocados");
        System.out.println(jogadores.concatenar());

    }
}
