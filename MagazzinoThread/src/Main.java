
public class Main {

	public static void main(String[] args) {
		
		Buffer buffer = new Buffer ();
		
		Magazziniere m = new Magazziniere(buffer);
		Consumatore c = new Consumatore(buffer);
		
			c.start();
			m.start();
			try {
				c.join();
				m.join();
			} catch (Exception e){
				e.printStackTrace();
			}
		
	}

}
