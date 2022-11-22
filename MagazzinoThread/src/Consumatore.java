
public class Consumatore extends Thread {
	
	private Buffer buffer;
	
	public Consumatore (Buffer buffer) {
		this.buffer = buffer;
	}
	
	public void run () {
		boolean controllo = true;
		while(controllo) {
			buffer.get();
		}
			
	}
	
}