import java.util.ArrayList;
import java.util.Random;

public class Magazzino {
	
	public ArrayList<Prodotto> calzini;
	public ArrayList<Prodotto> felpe;
	public ArrayList<Prodotto> pantaloni;
	
	public Magazzino () {
		calzini = new ArrayList<Prodotto> ();
		felpe = new ArrayList<Prodotto> ();
		pantaloni = new ArrayList<Prodotto> ();
		
		riempimento ();
	}
	
	public boolean compra  (int num, ArrayList<Prodotto> prodotti) {
		boolean control = false;
		for (int i=0;i<num;i++) {
			if (prodotti.size()>num) {
				prodotti.remove(i);
				control = true;
			} else {
				control = false;
				break;
			} 
		}
		return control;
	}
	
	private void riempimento () {
		int num = 0;
		
		while (num<10) {
			num = new Random().nextInt(20);
		}
		
		
		for (int i=0;i<num; i++) {
			
				calzini.add(new Prodotto ("calzino"));
				felpe.add(new Prodotto ("felpa"));
				pantaloni.add(new Prodotto ("pantalone"));
		}
		
		System.out.print("Il magazzino ha " + num + " scorte \n\n\n");
	}
	
	public int getSizeCalzini () {
		return calzini.size();
	}
	public int getSizePantaloni () {
		return pantaloni.size();
	}
	public int getSizeFelpe () {
		return felpe.size();
	}
	
	
}
