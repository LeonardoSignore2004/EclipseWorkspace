package es2Chiara;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner ( System.in);
		int a;
		
		
		 
		System.out.println("Inserisci un numero: ");
		a = scanner.nextInt();
		int b = a-1;
		int c = a+1;
		System.out.println("Il numero precedente é: "+ b + "  Il numero successivo è : "+ c);
		

	}

}
