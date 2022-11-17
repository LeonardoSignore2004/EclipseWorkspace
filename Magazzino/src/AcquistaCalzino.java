import java.util.ArrayList;

public class AcquistaCalzino extends ThreadAcquista{

	public AcquistaCalzino(Magazzino magazzino, int num, String nome, ArrayList<IProdotto> prodotto) {
		super(magazzino, num, nome,prodotto);
	}
}
