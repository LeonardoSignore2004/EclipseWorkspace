package es10Chiara;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		
		double spesa = 0;
		double sconto1 = 0.1;
		double sconto2 = 0.2;
		
		System.out.println("Inserisci il costo della spesa : ");
		spesa = scanner.nextDouble();
		
		if (spesa < 500) {
			System.out.println("La spesa è inferiore ai 500 euro verrà scontata del 10 percento");
			sconto1 = sconto1*spesa;
			spesa= spesa- sconto1;
			System.out.println(spesa);
			
			
		} else{
			System.out.println("La spesa è maggiore di 500 euro verrà scontata del 20 percento");	
		    sconto2 = sconto2*spesa;
		    spesa = spesa - sconto2;
		    System.out.println(spesa);
		    
		}
	}

}
