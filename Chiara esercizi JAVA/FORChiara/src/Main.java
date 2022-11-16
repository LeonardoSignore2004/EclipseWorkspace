import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner ( System.in);
		int a;
		int somma = 0;
		int i;
		 for (i = 0; i<5; i++){
			 System.out.println("Inserisci un numero:");
			 a = scanner.nextInt();
			 somma = somma+a;
			 
			 
		 }
		 System.out.println("La somma è: " + somma);
		
		
		

	}

}
