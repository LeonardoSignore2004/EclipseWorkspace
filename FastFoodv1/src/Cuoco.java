
public class Cuoco extends Thread {
	private FastFood fastfood;
	private String nome;
	
	public Cuoco (String nome,FastFood fastfood) {
		super (nome);
		this.fastfood = fastfood;
		this.nome = nome;
	}
	
	public void run () {
		boolean chiuso = false;
		while (chiuso==false) {
			try {
				chiuso = fastfood.cucina(nome);
			} catch (Exception e) {
				e.printStackTrace();
			}
			
		}
			
	}
}
