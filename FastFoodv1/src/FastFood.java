
public class FastFood {
	private Ordine [] ordine;
	private int numCassiere; //indice vettore
	private int numCuoco; //indice vettore
	private boolean stoCucinando; // variabile per sincronizzare i cuochi
	private boolean stoOrdinando; // variabile per sincronizzare i cassieri
	private boolean chiusoCassieri; //variabile per terminare i thread Cassieri
	private boolean chiusoCuochi; //variabile per terminare i thread Cuochi
	
	public FastFood () {
		ordine = new Ordine [50];
		stoCucinando = false;
		stoOrdinando = false;
	}
	
	public synchronized boolean cucina (String nome) {
		if (numCuoco<50) {
			while (stoCucinando == true || ordine[numCuoco]==null) {
			try {
				wait();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		ordine[numCuoco].setCucinato();
		numCuoco++;
		if (numCuoco<50) {
			stoCucinando = false;
		} else {
			chiusoCuochi = true;
		}
		System.out.println("Thread: " + nome + " ha cucinato l'ordine numero " + numCuoco);
		notifyAll();
		}
		
		return chiusoCuochi;
	}
	
	public boolean ordina (String nome) {
		boolean chiuso = false;
		Ordine ordine = new Ordine ();
		chiuso = pubblicaOrdine(ordine,nome);
		return chiuso;
	}
	
	private synchronized boolean pubblicaOrdine (Ordine ordine,String nome) {
		
		if (numCassiere<50) {
		while (stoOrdinando == true) {
			try {
				wait();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		this.ordine[numCassiere]= ordine;
		numCassiere++;
		if (numCassiere<50) {
			stoOrdinando = false;
		} else {
			chiusoCassieri = true;
		}
		System.out.println("Thread: " + nome + " ha aggiunto l'ordine numero: " + numCassiere);
		notifyAll();
		}
		
		return chiusoCassieri;
	}
}
