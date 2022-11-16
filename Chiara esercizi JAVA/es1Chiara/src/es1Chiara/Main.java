package es1Chiara;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int a;
		int b;
		int c;
		int d;
		int e;
		
		Scanner scanner = new Scanner (System.in);
		
		System.out.println("Inserisci primo numero:" );
		a = scanner.nextInt();
		System.out.println("Il numero inserito è " + a);
		
		
		System.out.println("Inserisci secondo numero:" );
		b = scanner.nextInt();
		System.out.println("Il numero inserito è " + b);
		
		System.out.println("Inserisci terzo numero:" );
		c = scanner.nextInt();
		System.out.println("Il numero inserito è " + c);
		
		System.out.println("Inserisci quarto numero:" );
		d = scanner.nextInt();
		System.out.println("Il numero inserito è " + d);
		
		System.out.println("Inserisci quinto numero:" );
		e = scanner.nextInt();
		System.out.println("Il numero inserito è " + e);
		
		int somma;
		somma = a+b+c+d+e;
		System.out.println("La somma è:" + somma);
		
		
		
		
	}

}
