import java.util.ArrayList;

public class GestoreClienti {
	private ArrayList <Cliente> clienti;
	
	public GestoreClienti () {
		clienti = new ArrayList<Cliente>();
	}
	
	public void add(Cliente e){
		clienti.add(e);
	}
	
	public void mod(Cliente e) {
		
	}
	
	public void kill(Cliente e) {
		clienti.remove(e);
	}
}
