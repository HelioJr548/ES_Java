package Ordenacao;

public class BubbleSort {
	
	public void bubble(int []valores) {
		for(int i=0;i<valores.length;i++) {
			for(int j=0;j<valores.length-1-i;j++) {
				if(valores[j]>valores[j+1]) {
					int aux=valores[j];
					valores[j]=valores[j+1];
					valores[j+1] = aux;
				}
				
			}
			
		}
		
	}
}
