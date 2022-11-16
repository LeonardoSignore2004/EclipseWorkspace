
public class Cliente extends Thread {
	
	private Magazzino magazzino;
	private int num;
	private String nomeCliente;
	
	public Cliente (Magazzino magazzino, int num, String nomeCliente) {
		
		this.magazzino = magazzino;
		this.num = num;
		this.nomeCliente = nomeCliente;
		
	}
	
	public void run () {
		if (num > 0) {
		new ThreadAcquistaPantaloni(num,magazzino,nomeCliente).start();
		new ThreadAcquistaCalzini(magazzino,num, nomeCliente).start();
		new ThreadAcquistaFelpe(magazzino,num,nomeCliente).start();
		} else {
			System.out.println ("Non voglio acquistare niente");
		}
	}

}
