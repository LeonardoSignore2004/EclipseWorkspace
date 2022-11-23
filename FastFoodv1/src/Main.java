
public class Main {

	public static void main(String[] args) {
		
		FastFood fastfood = new FastFood ();
		
		Cassiere cassiere1 = new Cassiere (fastfood, "cassiere1");
		Cassiere cassiere2 = new Cassiere (fastfood, "cassiere2");
		
		Cuoco cuoco1 = new Cuoco ("Cuoco1", fastfood);
		Cuoco cuoco2 = new Cuoco ("Cuoco2", fastfood);
		
		cassiere1.start();
		cassiere2.start();
		cuoco1.start();
		cuoco2.start();
	}

}
