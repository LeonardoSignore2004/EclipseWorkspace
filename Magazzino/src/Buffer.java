
public class Buffer {
	private int [] array;
	private boolean disponibile;
	
	public Buffer () {
		array = new int [10];
		disponibile = false;
	}
	
	public synchronized int get () {
		while (!disponibile) {
			try {
				wait();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		disponibile = false;
		notify();
		return array[0];
	}
	
	public synchronized void put (int n) {
		while (disponibile) {
			try {
				wait();
			} catch (Exception e) {
				e.printStackTrace();
			}
			disponibile = true;
			notify();
		}
	}
}
