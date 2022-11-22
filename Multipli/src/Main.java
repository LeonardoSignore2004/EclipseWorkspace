import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		
		int a;
		
		System.out.println("Inserisci un numero ");
		a = scanner.nextInt();
		
		int prodotto;
		
		for (int i=0;i<12;i++) {
			prodotto = a*i;
			System.out.println(a + "*" + i + "= " + prodotto );
		}

	}

}
