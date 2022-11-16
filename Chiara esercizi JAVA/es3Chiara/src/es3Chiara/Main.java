package es3Chiara;
import java.util.Scanner; 
public class Main {
	
	public static void main (String args[]) {
		Scanner scanner = new Scanner (System.in);
	
		double a = 0;
		double iva= 0.22;
	System.out.println("Inserisci il costo : ");
	a = scanner.nextDouble();
	
	System.out.println("Costo senza Iva : " +a);
	iva= a*0.22;
	a = iva + a ;
	System.out.println("Costo con Iva : " + a );
	
	
	
	
	
	
	
	}
	
	
	
}
