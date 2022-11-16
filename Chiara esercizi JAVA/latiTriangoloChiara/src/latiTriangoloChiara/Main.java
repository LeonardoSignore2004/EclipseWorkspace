package latiTriangoloChiara;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner ( System.in);
		
		double l1=0;
		double l2=0;
		double l3=0;
		
		System.out.println("Inserisci primo lato:");
		l1 = scanner.nextDouble();
		System.out.println("Inserisci secondo lato:");
		l2 = scanner.nextDouble();
		System.out.println("Inserisci terzo lato:");
		l3 = scanner.nextDouble();
		double area;
		double perimetro;
		
		if (l1==l2 && l2==l3) {
			area = (l1*l2)/2;
			perimetro = l1*3;
			System.out.println("L'area è : "+ area + " Il perimetro è : " + perimetro );
			
		} else {
			System.out.println("Il triangolo che hai inserito non è equilatero");
		}
	}

}
