import java.util.Random;

public class Magazziniere extends Thread {
	
	private Buffer buffer;
	
	public Magazziniere (Buffer buffer) {
		this.buffer = buffer;
	}
	
	public void run () {
		int a=0;
		boolean controllo = true;
		while (controllo) {
				a = new Random().nextInt(20);
			buffer.put(a);
		}
	}

}
