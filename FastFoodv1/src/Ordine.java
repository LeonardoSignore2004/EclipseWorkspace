
public class Ordine {
	private boolean stato; //true = cucinato, false = non cucinato
	
	public Ordine () {
		this.stato = false;
	}
	
	public void setCucinato () {
		this.stato = true;
	}
}
