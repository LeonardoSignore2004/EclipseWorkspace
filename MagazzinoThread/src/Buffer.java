
public class Buffer {
	private int [] value;
	private boolean disponibile;
	public int indice = 0;
	
	
	public Buffer () {
		disponibile = false;
		value = new int [10];
	}
	
	public synchronized int get () {
		while (disponibile == false) {
			try {
				wait();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		notifyAll();
		disponibile = false;
		indice++;
		System.out.print( "Il consumatore ha preso: " + value[indice-1] + "\n");
		return value[indice-1];
	}
	
	public synchronized void put (int n) {
		
		while (disponibile == true) {
			try {
				wait();
			} catch (Exception e) {
				e.printStackTrace();
			} 
		}
			
			value[indice] = n;
			disponibile = true;
			notifyAll();
			System.out.println("\nHo inserito un numero: " + n + "\n");
		
	}
}
