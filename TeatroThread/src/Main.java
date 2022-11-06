
public class Main {

	public static void main(String[] args) throws InterruptedException {
		
		Teatro.setMax_persone(3);
		
		Spettatore sp1 = new Spettatore ();
		Spettatore sp2 = new Spettatore ();
		Spettatore sp3 = new Spettatore ();
		
		sp1.start();
		sp2.start();
		sp3.start();
		
		sp1.join();
		sp2.join();
		sp3.join();
		
		System.out.println("max_persone: " + Teatro.max_persone);
	}

}
