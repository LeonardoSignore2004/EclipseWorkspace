import java.awt.BorderLayout;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class PaginaIniziale extends JFrame {
	
	private JTextField textfield;
	private JButton button;
	private BarraStrumenti barrastrumenti;
	private JTextArea textArea;
	private PannelloForm pannelloform;
	
	public PaginaIniziale () {
		
		super("Pagina iniziale");
		
		setLayout(new BorderLayout());
		
		button = new JButton ("cliccami");
		textfield = new JTextField();
		textArea = new JTextArea ();
		barrastrumenti = new BarraStrumenti ();
		pannelloform = new PannelloForm();
		
		pannelloform.setFormListener(new FormListener () {

			@Override
			public void formEventListener(FormEvent s) {
				String marca = s.getMarca();
				String modello = s.getModello();
				
				textArea.append(marca + " " + modello + "\n");
			}
			
		});
		barrastrumenti.setTextListener(new TextListener () {

			@Override
			public void testoEmesso(String testo) {
				textArea.append(testo);
				
			}
			
		});
		
		button.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (!textfield.getText().equals("")) {
					textArea.append(textfield.getText()+"\n");
					textfield.setText("");
				}
				
			}
			
		});
		
		add(textfield, BorderLayout.PAGE_START);
		add(button, BorderLayout.PAGE_END);
		add(textArea,BorderLayout.CENTER);
		add(barrastrumenti, BorderLayout.PAGE_START);
		add(pannelloform, BorderLayout.LINE_START);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(800,800);
		setVisible(true);
	}
}
