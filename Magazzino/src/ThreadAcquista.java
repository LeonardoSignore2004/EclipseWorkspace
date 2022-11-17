import java.util.ArrayList;

public class ThreadAcquista extends Thread{
	
	private Magazzino magazzino;
	private int num;
	private String nome;
	private Object lock = new Object();
	private ArrayList <IProdotto> prodotto;
	
	
	
	public ThreadAcquista(Magazzino magazzino, int num, String nome, Object lock) {
		super();
		this.magazzino = magazzino;
		this.num = num;
		this.nome = nome;
		this.prodotto = prodotto;
	}



	public void run () {
		
		String tipo;
		
		if (prodotto.get(0) instanceof Calzino) {
			tipo="calzino";
		} else if (prodotto.get(0) instanceof Pantalone) {
			tipo="Pantalone";
		} else {
			tipo="Felpa";
		}
			
		
		synchronized (lock) {
			boolean t = magazzino.compra(num,prodotto);
			if (t) {
				System.out.println ("Thread: " + nome + " è riuscito a comprare " + num + " prodotti di tipo: " + tipo);
				System.out.println("Rimangono " + magazzino.getSizeCalzini() + " prodotti" + " nel magazzino \n\n");
			} else {
				System.out.println ("Thread: " + nome + " non è riuscito a comprare " + num + " prodotti di tipo: " + tipo);
			}
		}
		}
	}
