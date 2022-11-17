import java.util.ArrayList;
import java.util.Random;

public class Magazzino {
	
	public ArrayList<IProdotto> calzini;
	public ArrayList<IProdotto> felpe;
	public ArrayList<IProdotto> pantaloni;
	
	public Magazzino () {
		calzini = new ArrayList<IProdotto> ();
		felpe = new ArrayList<IProdotto> ();
		pantaloni = new ArrayList<IProdotto> ();
		
		riempimento ();
	}
	
	public boolean compra  (int num, ArrayList<IProdotto> prodotti) {
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
	
	public void carica () {
		
	}
	
	private void riempimento () {
		int num = 0;
		
		while (num<10) {
			num = new Random().nextInt(20);
		}
		
		
		for (int i=0;i<num; i++) {
			
				calzini.add(new Calzino ());
				felpe.add(new Felpa ());
				pantaloni.add(new Pantalone ());
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
