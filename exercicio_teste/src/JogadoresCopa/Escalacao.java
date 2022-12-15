package JogadoresCopa;

import java.util.Arrays;

public class Escalacao {
    String[] lista;
    int nrItens;
    int tamanho;


    Escalacao(int nrItens) {
        this.tamanho = 0;
        this.nrItens = nrItens;
        lista = new String[nrItens];
    }

    public void adicionar(String jogador) {
        nrItens += 1;
        String[] auxiliar = lista;
        this.lista = new String[nrItens];
        this.lista = Arrays.copyOf(auxiliar, nrItens);
        lista[tamanho] = jogador;
        tamanho++;
    }

    public String concatenar() {
        String s = "";
        for (int i = 0; i < tamanho; i++) {
            s = s + "\n" + lista[i];
        }
        return s;
    }

    public int getTamanho() {
        return this.tamanho;
    }

    public int getNrItens() {
        return this.nrItens;
    }

    public String pesquisar(String jogador) {
        int i;
        String resultado = " ";
        for (i = 0; i < getTamanho() && !(lista[i].equals(jogador)); i++) {
        }

        if (jogador.equals(lista[i])) {
            resultado = "\nJogador já foi convocado";
        } else {
            resultado = "\nEsse jogador não está na lista de convocação\nConvocando Jogador...\n\nJogador Convocado!!";
            adicionar(jogador);
        }
        return resultado;
    }

}
