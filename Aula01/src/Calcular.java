
public class Calcular {
	int resultado;
	
	public void somar(int n1, int n2) {
		resultado = n1+n2;
		System.out.println("A soma de "+n1+" e "+n2+" � igual a: "+resultado);
	}
	
	public void mult(int n1,int n2) {
		resultado = n1 * n2;
		System.out.println("O produto da multiplica��o de "+n1+" e "+n2+" � igual a: "+resultado);
	}
	
	public void subtrair(int n1, int n2) {
		resultado = n1 - n2;
		System.out.println("A subtra��o de "+n1+" e "+n2+" � igual a: "+resultado);
	}
}
