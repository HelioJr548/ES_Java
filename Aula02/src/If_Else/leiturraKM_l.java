package If_Else;
import java.util.Scanner;

public class leiturraKM_l {
	public static void main(String[] args) { 
		double km, l,consumo;
		
		Scanner ler = new Scanner(System.in);
		System.out.println("Digite a distancia em km: ");
		km = ler.nextDouble();
		System.out.println("Digite a quantidade de litros que o carro faz: ");
		l = ler.nextDouble();
		
		consumo  = km/l;
		
		System.out.println("O seu carro consome: "+consumo);
		if(consumo < 8) {
			System.out.println("Venda o carro");
		}else if(consumo > 8 && consumo < 14){
			System.out.println("Economico");
		}else if(consumo > 14) {
			System.out.println("Super Economico");
		}
		
		
	}
}
