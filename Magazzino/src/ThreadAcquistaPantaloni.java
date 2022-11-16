
public class ThreadAcquistaPantaloni extends Thread{
	
	private int num;
	private Magazzino magazzino;
	private String nome;
	
	public ThreadAcquistaPantaloni(int num, Magazzino magazzino, String nome) {
		super(nome);
		this.num = num;
		this.magazzino = magazzino;
		this.nome = nome;
	}



	public void run () {
		synchronized (ThreadAcquistaPantaloni.class) {
			boolean t =magazzino.compra(num,magazzino.pantaloni);
			if (t) {
				System.out.println ("Thread: " + getNome() + " è riuscito a comprare " + num + " pantaloni");
				System.out.println("Rimangono " + magazzino.getSizePantaloni() + " pantaloni" + " nel magazzino\n\n");
			} else {
				System.out.println ("Thread: " + getNome() + " non è riuscito a comprare " + num + " pantaloni \n");
			}
		}
	}
	
	public String getNome () {
		return nome;
		
	}
}
