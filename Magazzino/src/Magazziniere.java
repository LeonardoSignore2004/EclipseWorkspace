
public class Magazziniere extends Thread {
	
	private String nome;
	private Magazzino magazzino;
	
	public void run () {
		magazzino.carica();
	}

}
