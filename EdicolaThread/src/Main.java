
public class Main {

	public static void main(String[] args) throws InterruptedException {
		
		Edicola.set_quaderni_matite(10, 10);
		
		Cliente a = new Cliente (2,2);
		Cliente b = new Cliente (5,5);
		Cliente c = new Cliente (1,1);
		Cliente d = new Cliente (3,3);
		
		a.start();
		b.start();
		c.start();
		d.start();
		
	
		a.join();
		b.join();
		c.join();
		d.join();
		
		System.out.println ("matite: " + Edicola.matite + " quaderni: " + Edicola.quaderni);

	}

}
