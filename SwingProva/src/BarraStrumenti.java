import java.awt.FlowLayout;
import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class BarraStrumenti extends JPanel implements ActionListener{
	
	private JButton add_button;
	private JButton mod_button;
	private JButton kill_button;
	private TextListener textlistener;
	private GestoreClienti gestoreclienti;
	
	public BarraStrumenti () {
		add_button = new JButton ("Aggiungi cliente");
		mod_button = new JButton ("Modifica cliente");
		kill_button = new JButton ("Elimina cliente");
		gestoreclienti = new GestoreClienti();
		
		setLayout (new FlowLayout(FlowLayout.LEFT));
		
		add_button.addActionListener(this);
		mod_button.addActionListener(this);
		
		
		add(add_button);
		add(mod_button);
		add(kill_button);
	}
	
	public void setTextListener (TextListener textArea2) {
		this.textlistener = textArea2;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		if (textlistener != null) {
			JButton premuto = (JButton)e.getSource();
			if (premuto == add_button) {
				
			} else if (premuto == mod_button) {
				
			} else {
				
			}
			
		}
	}

}
