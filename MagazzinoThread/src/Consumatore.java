
public class Consumatore extends Thread {
	
	private Buffer buffer;
	
	public Consumatore (Buffer buffer) {
		this.buffer = buffer;
	}
	
	public void run () {
		for (int i=0;i<10;i++) {
			buffer.get();
		}
	}
	
}