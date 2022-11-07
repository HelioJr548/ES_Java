package Ordenacao;

public class InsertSort {

	public void insert(int[]valores) {
		for(int i=1; i<valores.length;i++) {	//Percorre vetor
			int aux=valores[i];	//Guarda valor da pposição atual do vetor
			int j=i-1; //Recebe posição anterior
			while((j>=0) && (aux<valores[j])) {	// Enquanto posição anterior maior/igual a 0 e valor da posição atual menor que valor da posição anterior
				valores[j+1] = valores[j];	//Posição atual recebe valor da posição anterior
				j--;	//Diminui posição 
			}
			valores[j+1] = aux;	//Posição atual recebe valor da posição atual
		}
	}
}
