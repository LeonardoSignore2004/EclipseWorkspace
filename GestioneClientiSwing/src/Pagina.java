import java.awt.BorderLayout;

import javax.swing.JFrame;

public class Pagina extends JFrame{
	
	PanelAggiungi pannello1;
	PanelAggiungi pannello2;
	
	public Pagina () {
		
		super("Home"); // richiamo il costruttore della classe JFrame per settare il titolo della pagina
		
		setLayout(new BorderLayout());
		
		pannello1 = new PanelAggiungi("Aggiungi cliente");
		pannello2 = new PanelAggiungi("Elimina cliente");
		
		add(pannello1,BorderLayout.LINE_START);
		add(pannello2,BorderLayout.LINE_END);
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);//si chiude colk tasto X
		setSize(800,800);//setto le dimensione che normalmente sono piccole, troppo piccole
		setVisible(true);//rendo il frame visibile solo quando è tutto buildato e messo ammodo
	}
}
