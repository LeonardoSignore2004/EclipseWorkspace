
public class ThreadAcquistaCalzini extends Thread{
	private Magazzino magazzino;
	private int num;
	private String nome;
	
	public ThreadAcquistaCalzini (Magazzino magazzino, int num, String nome) {
		super (nome);
		this.magazzino = magazzino;
		this.num = num;
		this.nome = nome;
	}
	
	public void run () {
		synchronized (ThreadAcquistaCalzini.class) {
			boolean t = magazzino.compra(num,magazzino.calzini);
			if (t) {
				System.out.println ("Thread: " + getNome() + " è riuscito a comprare " + num + " calzini");
				System.out.println("Rimangono " + magazzino.getSizeCalzini() + " calzini" + " nel magazzino \n\n");
			} else {
				System.out.println ("Thread: " + getNome() + " non è riuscito a comprare " + num + " calzini");
			}
		}
	}

	public Magazzino getMagazzino() {
		return magazzino;
	}

	public void setMagazzino(Magazzino magazzino) {
		this.magazzino = magazzino;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
}
