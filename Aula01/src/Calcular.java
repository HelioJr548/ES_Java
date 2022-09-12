
public class Calcular {
	int resultado;
	
	public void somar(int n1, int n2) {
		resultado = n1+n2;
		System.out.println("A soma de "+n1+" e "+n2+" é igual a: "+resultado);
	}
	
	public void mult(int n1,int n2) {
		resultado = n1 * n2;
		System.out.println("O produto da multiplicação de "+n1+" e "+n2+" é igual a: "+resultado);
	}
	
	public void subtrair(int n1, int n2) {
		resultado = n1 - n2;
		System.out.println("A subtração de "+n1+" e "+n2+" é igual a: "+resultado);
	}
}
