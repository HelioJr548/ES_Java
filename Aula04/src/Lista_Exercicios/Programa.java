package Lista_Exercicios;

import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {
		Programa p = new Programa();
//		p.crime();
//		p.triangulo();
//		p.pesquisa(); rever
//		p.frangos();
		p.urna();
	}
	
	
	
	public void crime() {
	String r;
	int s =0;
	int n =0;
	Scanner ler = new Scanner(System.in);
	for(int i=1;i<=5;i++) {
		if (i==1) {
			System.out.println("Telefonou para a vítima?");
			r = ler.next();
			if (r.equals("s")) {
				s+=1;
				}else {
					n+=1;
				}
		}else if(i==2) {
			System.out.println("Esteve no local do crime?");
			r = ler.next();
			if (r.equals("s")) {
				s+=1;
				}else {
					n+=1;
				}
		}else if(i==3) {
			System.out.println("Mora perto da vítima?");
			r = ler.next();
			if (r.equals("s")) {
				s+=1;
				}else {
					n+=1;
				}
		}else if(i==4) {
			System.out.println("Devia para a vítima?");
			r = ler.next();
			if (r.equals("s")) {
				s+=1;
				}else {
					n+=1;
				}
			
		}else if(i==5) {
			System.out.println("Já trabalhou com a vítima?");
			r = ler.next();
			if (r.equals("s")) {
				s+=1;
				}else {
					n+=1;
				}
		}
		
	}
	if(s==2) {
		System.out.println("Participação da pessoa no crime classificada como: Suspeita");	
	}else if(s==3 || s==4) {
		System.out.println("Participação da pessoa no crime classificada como: Cúmplice");	
	}else if(s==5) {
		System.out.println("Participação da pessoa no crime classificada como: Assassino");	
	}else {
		System.out.println("Participação da pessoa no crime classificada como: Inocente");
	}
}

	public void triangulo() {
		int e;
		String x = "*";
		System.out.println("Altura desejada para o triangulo: ");
		Scanner ler = new Scanner(System.in);
		e = ler.nextInt();
		for(int i=1;i<=e;i++) {
			System.out.println(x);
			x+="*";
		}
	}
	
	public void pesquisa() {
		String rs;
		String rg;
		int h = 0;
		int m =0;
		int s = 0;
		int n =0;
		int ms = 0;
		int hng = 0;
		Scanner ler =new Scanner(System.in);
		for (int i=1;i<=2;i++) {
			System.out.println("Digite seu sexo: ");
			rs = ler.next();
			if(rs.equals("h")) {
				h+=1;
			}else {
				m+=1;
			}
			System.out.println("Gostou do novo produto?: ");
			rg = ler.next();
			if (rg.equals("s")) {
				s +=1;
			}else {
				n+=1;
			}
			if (rs.equals("m") && rg.equals("s")) {
				ms +=1;
			}
			if (rs.equals("h") && rg.equals("n")) {
				hng +=1;
			}
			
			
		}
		
		System.out.println("O número de pessoas que respondeu sim: "+s);
		System.out.println("O número de pessoas que respondeu não: "+n);
		System.out.println("O número de mulheres que respondeu sim: "+ms);
		System.out.println("A percentagem de homens que respondeu “não” entre todos os homens analisados: "+(hng/h)*100);
	}
	
	public void frangos() {
		int i = 1;
		int f = 0;
		double peso;
		double maispesado = 0;
		double maisleve = maispesado;
		double pesototal = 0;
		double mediapeso;
		Scanner ler = new Scanner(System.in);
		while(i!= 0){
			System.out.println("Digite [0] para encerrar o programa\nDeseja adicionar Frango? Digite seu identificador numerico:");
			i = ler.nextInt();
			if(i!=0){
				f+=1;
				System.out.println("\nDigite o Peso do frango: ");
				peso = ler.nextDouble();
				if(peso > maispesado) {
					maispesado=peso;
				}
				maisleve =peso;
				if (peso < maisleve) {
					maisleve = peso;
				}
				pesototal += peso;
			}
				
		}
		mediapeso = pesototal/f;
		System.out.println("A quantidade total de frangos: "+f);
		System.out.println("Frango mais gordinho: "+maispesado+"Kg.\nFrango mais magrinho: "+maisleve+"Kg.");
		System.out.println("A média do peso dos frangos: "+mediapeso);
	}

	public void urna() {
		int v = 0;
		int jr =0;
		int cl=0;
		int nr=0;
		int nulo=0;
		int branco=0;
		int total=0;
		Scanner ler = new Scanner(System.in);
		while(v!=6) {
			total++;
			System.out.println("1. Candidato Jair Rodrigues  \r\n" + 
					"2. Candidato Carlos Luz  \r\n" + 
					"3. Candidato Neves Rocha  \r\n" + 
					"4. Nulo \r\n" + 
					"5. Branco.\nEntre com o seu voto:");
			v = ler.nextInt();
			if (v==1) {
				jr++;
			}else if(v==2) {
				cl++;
			}else if(v==3) {
				nr++;
			}else if(v==4) {
				nulo++;
			}else if(v==5) {
				branco++;
			}else if(v==6) {
				System.out.println("Total de votos por candidato:\n"
						+ "Jair Rodrigues: "+jr+"\n"+
						"Candidato Carlos Luz: "+cl+"\n"+
						"Candidato Neves Rocha: "+nr+"\n"+
						"Nulo: "+nulo+"\n"+
						"Branco: "+branco);
				System.out.println("Porcentagem de votos nulos: "+(nulo*total)/100);
				System.out.println("A porcentagem de votos brancos: "+(branco*total)/100);
				if(jr>cl && jr >nr) {
					System.out.println("O candidato vencedor: Jair Rodrigues");
				}else if(cl>jr && cl>nr) {
					System.out.println("O candidato vencedor: Carlos Luz");
				}else {
					System.out.println("O candidato vencedor: Neves Rocha");
				}
			}
			
		}
	}
}


	


