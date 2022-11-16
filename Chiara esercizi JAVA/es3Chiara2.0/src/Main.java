import java.util.Scanner;
public class Main {
	
	
	public static void main (String args[]) {
		Scanner scanner = new Scanner (System.in);
	
		double a =0;
		double sconto = 0.2;
		
	
		System.out.println("Inserisci costo totale spesa : ");
		a = scanner.nextDouble();
		System.out.println("Se il costo della spesa è maggiore di 100 verrà apllicato lo sconto del 20 percento.");
		 if(a>100) {
			 sconto = sconto*a;
			 a= a- sconto;
			 System.out.println("Il costo ultimo è : "+ a);
		 }
	}
	
}
