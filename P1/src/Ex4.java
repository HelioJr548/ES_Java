import java.util.Scanner;

public class Ex4 {
	String[] livro;
	int nrItens;
	int tamanho;
	
	Ex4(int nrItens) {
		this.tamanho = 0;
		this.nrItens = nrItens;
		livro = new String[nrItens];
	}
	
	public void adicionar(String palavras) {
		livro[tamanho] =palavras;
		tamanho++;
	}
	
	public String concatenar() {
		String s="";
		for (int i=0;i < tamanho; i++) {
			s = s + " "+livro[i];
		}
		return s;
	}
	
	public int getTamanho() {
		return this.tamanho;
	}
	
	public int getNrItens() {
		return this.nrItens;
	}
	
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int x,a;
		String[] livro;
		
		
		System.out.println("Obs: Para salvar livros com mais de uma palavra separe-as com (-).\nQuantidade de livros para adicionar:");
		x  = ler.nextInt();
		livro = new String[x];
		for(int i = 0; i <livro.length;i++) {
			System.out.print("Quantidade de palavras no nome do filme: ");
			a = ler.nextInt();
			for(int i = 0; i < a; i++ ) {
				Ex4 lf = new Ex4(a);
				System.out.print("Nome do Livro: ");
				lf.adicionar(ler.next());
				livro[i] = lf;
			}
		}
		
		for(int i = 0; i <livro.length;i++) {
			if(lf[i].equalsIgnoreCase("Use-a-cabeça-Java")){
				q=1;
			}else{
				q=0;
			}
		}
		
		if(q==1) {
			System.out.println("bom gosto");						
		}else {
			System.out.println("Não existe o livro pesquisado");						
			
		}
	}
}

