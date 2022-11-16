import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.Border;

public class PannelloForm extends JPanel {
	
	private JLabel labelmarca;
	private JLabel labelmodello;
	
	private JTextField textfieldmarca;
	private JTextField textfieldmodello;
	
	private FormListener formlistener;
	
	private JButton aggiungi;
	
	public PannelloForm () {
		setLayout(new GridBagLayout());
		Dimension dimension1 = getPreferredSize();
		
		setPreferredSize(new Dimension (300,300));
		
		Border bordointerno = BorderFactory.createTitledBorder("Aggiungi automobile");
		Border bordoesterno = BorderFactory.createEmptyBorder(0,5,5,5);
		Border bordofinale = BorderFactory.createCompoundBorder(bordointerno,bordoesterno);
		
		setBorder(bordofinale);
		
		labelmarca = new JLabel ("marca: ");
		textfieldmarca = new JTextField (15);
		
		labelmodello = new JLabel ("modello: ");
		textfieldmodello = new JTextField (15);
		
		aggiungi = new JButton ("ADD");
		
		aggiungi.addActionListener(new ActionListener (){

			@Override
			public void actionPerformed(ActionEvent e) {
				String marca = textfieldmarca.getText();
				String modello = textfieldmodello.getText();
				
				textfieldmodello.setText("");
				textfieldmarca.setText("");
				
				FormEvent formevent = new FormEvent(this,marca,modello);
				
				if (formlistener != null) {
					formlistener.formEventListener(formevent);
				}
				
			}
			
		});
		
		GridBagConstraints gbc = new GridBagConstraints();
		
		gbc.gridx=0;
		gbc.gridy=0;
		
		gbc.weightx=0.01;
		gbc.weighty=0.01;
		gbc.anchor = GridBagConstraints.LINE_END;
		
		add(labelmarca,gbc);
		
		gbc.gridx=1;
		gbc.gridy=0;
		
		gbc.weightx=0.01;
		gbc.weighty=0.01;
		gbc.anchor = GridBagConstraints.LINE_START;
		
		add(textfieldmarca,gbc);
		
		gbc.gridx=0;
		gbc.gridy=-1;
		
		gbc.weightx=0.01;
		gbc.weighty=0.01;
		gbc.anchor = GridBagConstraints.LINE_END;
		
		add(labelmodello,gbc);
		
		gbc.gridx=1;
		gbc.gridy=-1;
		
		gbc.weightx=0.01;
		gbc.weighty=0.01;
		gbc.anchor = GridBagConstraints.LINE_START;
		
		add(textfieldmodello,gbc);
		
		gbc.gridx=0;
		gbc.gridy=-2;
		
		gbc.weightx=1;
		gbc.weighty=1;
		
		gbc.gridwidth=2;
		gbc.anchor = GridBagConstraints.PAGE_START;
		add(aggiungi,gbc);
		
		
		
		}
	public void setFormListener (FormListener s) {
		this.formlistener = s;
	}
}
