package votiPagella;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int indice = 0;
		int [] vettore = new int [10]; 
		Scanner scanner = new Scanner (System.in);
		Scanner scanner2 = new Scanner (System.in);
		String car = "S"; 
		
		while (car.equals("S")) { //cicla finchè la variabile è uguale a 'S'
			
			System.out.println("Scrivi un voto");
			vettore[indice] = scanner.nextInt();
			
			System.out.println("vuoi continuare a inserire voti? S= si, N = no");
			car = scanner2.nextLine();
			if (indice < vettore.length) {
				indice++; 						//cambio la posizione nel vettore rispettando la lunghezza del vettore
			}
		}
		
		int somma = 0;
		
		for (int i=0;i<vettore.length;i++) {
			somma+=vettore[i];					//sommo i numeri dentro al vettore
		}
		
		System.out.print("La media dei voti è " + somma/indice);

	}

}
