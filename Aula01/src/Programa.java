import java.util.Scanner;

public class Programa {

	public static void main(String[] args) { //metodo executor
		// TODO Auto-generated method stub
		/*
		Aluno a1 = new Aluno();	//Instanciando a classe Aluno, criando o objeto a1
		a1.mostrar();	//Chamando o metodo mostrar da classe Aluno, atraves do objeto a1
		*/
		
		Scanner ler = new Scanner(System.in);	//Criando o input do usuario
		/*
		int telefone;
		
		System.out.println("Digite um numero de telefone: ");
		telefone = ler.nextInt();
	
		Dobro db = new Dobro();
		int x;
		
		System.out.println("Digite um numero para dobrar: ");
		x = ler.nextInt();
		db.dobrar(x);
		*/
		
		Calcular calc = new Calcular();
		int n1, n2;
		
		System.out.println("Digite um numero para calcular: ");
		n1 = ler.nextInt();
		System.out.println("Digite um numero para calcular: ");
		n2 = ler.nextInt();
		
		System.out.println("Escolha a operção desejada: \n Somar[1] \n Multiplicar[2] \n Dividir[3]: \n");
		int op;
		op = ler.nextInt();
		if(op == 1) {
			calc.somar(n1,n2);
		}else if (op==2) {
			calc.mult(n1, n2);
		}else if (op == 3) {
			calc.subtrair(n1, n2);
		}
 
	}

}
