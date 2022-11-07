package Recursividade;

public class Fatorial {

	public int fatorialRecursivo(int numero) {
		if(numero==0) {
			return 1;
		}else {
			return numero*fatorialRecursivo(numero-1);
		}
	}
	
	
	public int somaRecursiva(int numero) {
		if(numero==0) {
			return 0;
		}else {
			return numero+somaRecursiva(numero-1);
		}
	}
}
