
public class Spettatore extends Thread {
	
	public void acquistaBiglietto () {
		synchronized (Spettatore.class) {
			if (Teatro.max_persone>0) {
				Teatro.max_persone--;
			} else {
				System.out.println("Teatro pieno");
			}
		}
	}
	
	public void run () {
		acquistaBiglietto();
	}
}
