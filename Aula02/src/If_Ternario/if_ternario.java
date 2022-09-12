package If_Ternario;
import java.util.Scanner;

public class if_ternario {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a, b, c;
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Primeiro numero: ");
		a = ler.nextInt();
		System.out.println("Segundo numero: ");
		b = ler.nextInt();
		System.out.println("Terceiro numero: ");
		c = ler.nextInt();
		
		System.out.println((a<b && a<c) ? "O menor valor digitado foi: " +a: (b<a && b<c) ? "O menor valor digitado foi: "+b: "O menor valor digitado foi: "+c);
		
	}

}
