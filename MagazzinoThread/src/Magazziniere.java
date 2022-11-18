import java.util.Random;

public class Magazziniere extends Thread {
	
	private Buffer buffer;
	
	public Magazziniere (Buffer buffer) {
		this.buffer = buffer;
	}
	
	public void run () {
		int a=0;
		for (int i=0;i<10;i++) {
			a = new Random().nextInt(20);
			buffer.put(a);
		}
	}

}
