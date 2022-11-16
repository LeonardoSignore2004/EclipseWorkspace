import java.util.Scanner;

public class Main {
	public static void main (String args[]) {
		Scanner scanner = new Scanner ( System.in);
		int a;
		int somma = 0;
		int i = 0;
		
		while(i<5) {
			System.out.println("Inserisci un numero:");
			a = scanner.nextInt();
			somma = somma+a;
			i = i+1;
		}
		System.out.println(" La somma è: " + somma);
		
	}
}
