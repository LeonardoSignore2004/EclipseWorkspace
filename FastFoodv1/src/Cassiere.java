
public class Cassiere extends Thread {
	private FastFood fastfood;
	private String nome;
	
	public Cassiere (FastFood fastfood,String nome) {
		this.fastfood = fastfood;
		this.nome = nome;
	}
	
	public void run () {
		boolean chiuso = false;
		while (chiuso==false) {
			chiuso = fastfood.ordina(nome);
		}
		new Cuoco ("Cuoco3",fastfood).start();
	}
}
