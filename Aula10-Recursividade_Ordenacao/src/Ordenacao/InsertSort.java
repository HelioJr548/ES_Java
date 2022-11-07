package Ordenacao;

public class InsertSort {

	public void insert(int[]valores) {
		for(int i=1; i<valores.length;i++) {	//Percorre vetor
			int aux=valores[i];	//Guarda valor da pposi��o atual do vetor
			int j=i-1; //Recebe posi��o anterior
			while((j>=0) && (aux<valores[j])) {	// Enquanto posi��o anterior maior/igual a 0 e valor da posi��o atual menor que valor da posi��o anterior
				valores[j+1] = valores[j];	//Posi��o atual recebe valor da posi��o anterior
				j--;	//Diminui posi��o 
			}
			valores[j+1] = aux;	//Posi��o atual recebe valor da posi��o atual
		}
	}
}
