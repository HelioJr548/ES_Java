package ExemploAula;

public class Fila {
	    int inicio;
	    int fim;
	    int tamanho; // Indice, ex: 2 =  [0,1,2]
	    int qtdeElementos; // Elementos, ex: 3 [3,5,7]
	    int dados[];
	    
	    public Fila() {
	        inicio =fim =-1;
	        qtdeElementos = 0;
	        tamanho = 100;
	        dados = new int[tamanho];    
	    }
	    
	    public boolean cheia() {
	        if(qtdeElementos == tamanho-1) {
	            return true;
	        }
	        return false;
	    }
	    
	    public boolean vazia() {
	        if(qtdeElementos == 0) {
	            return true;
	        }
	        return false;
	    }    
	    
	    public void adicionar (int elemento) {
	        if(!cheia()) {
	            if(inicio==-1) {
	                inicio=0;
	            }
	            fim++;
	            dados[fim] = elemento;
	            qtdeElementos++;
	        }
	    }
	    
	    public void remover() {
	        if(!vazia()) {
	            inicio ++;
	            qtdeElementos--;
	        }
	    }
	    
	    public void exibir() {
	            String s = "[";
	            for (int i = inicio ; i <= fim; i++) {
	                s = s + dados[i];
	                if (i < fim)
	                    s = s + ", ";}
	            
	            s = s + "]";
	            System.out.println(s);
	        
	    }
	
	
	
}

