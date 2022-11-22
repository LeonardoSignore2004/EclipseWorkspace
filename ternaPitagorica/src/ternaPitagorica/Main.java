package ternaPitagorica;

import java.util.Scanner;

public class Main {
	public static void main (String args[]) {
		double x; 
		double y;
		double z;
		
		Scanner scanner = new Scanner (System.in);
		
		System.out.print("Inserisci x\n");
		x = scanner.nextDouble();
		
		System.out.print("Inserisci y\n");
		y = scanner.nextDouble();
		
		System.out.print("Inserisci z\n");
		z = scanner.nextDouble();
		
		if (Math.pow(x, 2)+Math.pow(y, 2) == Math.pow(z, 2)) {
			System.out.println("E' una terna pitagorica");
		} else {
			System.out.println("Non è una terna pitagorica");
		}
	}
}
