package Ordenacao;

public class Main {

	public static void main(String[] args) {
		int [] v= {5,8,2,20,15,6};
		System.out.println("BubbleSort:");
		BubbleSort bs = new BubbleSort();
		bs.bubble(v);
		for(int x : v) {
			System.out.println(x);
		}
		
		System.out.println("\nInsertSort:");
		InsertSort is = new InsertSort();
		is.insert(v);
		for (int x:v) {
			System.out.println(x);
		}
	}

}
