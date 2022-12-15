package ListaDeTarefas;

import java.util.Arrays;

public class Tarefa {
    String[] lista;
    int nrItens;
    int tamanho;

    Tarefa(int nrItens) {
        this.tamanho = 0;
        this.nrItens = nrItens;
        lista = new String[nrItens];
    }

    public void adicionar(String palavras) {
        nrItens += 1;
        String[] auxiliar = lista;
        this.lista = new String[nrItens];
        this.lista = Arrays.copyOf(auxiliar, nrItens);
        lista[tamanho] = palavras;
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

    public String pesquisar(String texto) {
        int i;
        for (i = 0; i < getTamanho() && !(lista[i].equals(texto)); i++) {
        }

        if (texto.equals(lista[i])) {
            return "ok";
        } else {
            return "false";
        }

    }
}
