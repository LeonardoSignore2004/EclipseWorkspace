import java.util.Scanner;

public class Main {
	
	public static void main (String args[]) {
		int a;
		int somma = 0;
		int cont =  0;
		
		Scanner scanner = new Scanner ( System.in);
		
		do {
			System.out.println("Inserisci un numero: ");
			a = scanner.nextInt();
			somma = a+somma;
			cont = cont + 1;
			
		}while(cont < 5);
		
	}
}
