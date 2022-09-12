package metodo;
import java.util.Scanner;

public class Programa01 {
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ler = new Scanner(System.in);
		
		Calculo calc = new Calculo();
		
		System.out.println("primeiro numero: ");
		int a = ler.nextInt();
		System.out.println("primeiro numero: ");
		int b = ler.nextInt();
		System.out.println("primeiro numero: ");
		int c = ler.nextInt();
		System.out.println("primeiro numero: ");
		int d = ler.nextInt();
		
		System.out.println("A soma dos valores: "+ calc.soma(calc.maior(a, b),calc.maior(c, d)));
	}

}
