
public class ThreadAcquistaFelpe extends Thread{
	private Magazzino magazzino;
	private int num;
	private String nome;
	
	public ThreadAcquistaFelpe (Magazzino magazzino, int num, String nome) {
		this.magazzino = magazzino;
		this.num = num;
		this.nome = nome;
	}
	
	public void run () {
		synchronized (ThreadAcquistaFelpe.class) {
			boolean t = magazzino.compra(num,magazzino.felpe);
			if (t) {
				System.out.println ("Thread: " + getNome() + " è riuscito a comprare " + num + " felpe");
				System.out.println("Rimangono " + magazzino.getSizeFelpe() + " felpe" + " nel magazzino \n\n");
			} else {
				System.out.println ("Thread: " + getNome() + " non è riuscito a comprare " + num + " felpe");
			}
		}
	}
	
	public String getNome () {
		return this.nome;
	}
}
