import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.Border;

public class PanelAggiungi extends JPanel{
	
	private JTextField textfieldnome;
	private JTextField textfieldcognome;
	private JLabel labelnome;
	private JLabel labelcognome;
	private JButton button_aggiungi;
	private JButton button_elimina;
	
	public PanelAggiungi (String testo) {
		
		//set layout and dimension
		setLayout(new GridBagLayout());
		Dimension dimension1 = getPreferredSize();
		setPreferredSize(new Dimension (340,340));
		
		GridBagConstraints gbc = new GridBagConstraints();
		
		
			
		gbc.gridx=0;
		gbc.gridy=0;
		
		gbc.weightx=0.01;
		gbc.weighty=0.01;
		gbc.anchor = GridBagConstraints.LINE_START;
		add(labelnome,gbc);
		
		gbc.gridx=1;
		gbc.gridy=0;
		
		gbc.weightx=0.01;
		gbc.weighty=0.01;
		gbc.anchor = GridBagConstraints.LINE_END;
		add(textfieldnome,gbc);
		
		gbc.gridx=0;
		gbc.gridy=1;
		
		gbc.weightx=0.01;
		gbc.weighty=0.01;
		gbc.anchor = GridBagConstraints.LINE_START;
		add(labelcognome,gbc);
		
		gbc.gridx=1;
		gbc.gridy=1;
		
		gbc.weightx=0.01;
		gbc.weighty=0.01;
		gbc.anchor = GridBagConstraints.LINE_END;
		add(textfieldcognome,gbc);
		
		/*if (testo == "Aggiungi cliente") {
			gbc.gridx=2;
			gbc.gridy=2;
			
			gbc.weightx=1;
			gbc.weighty=1;
			gbc.anchor = GridBagConstraints.CENTER;
			button_aggiungi = new JButton("Aggiungi cliente");
			add(button_aggiungi);
		} else {
			gbc.gridx=2;
			gbc.gridy=2;
			
			gbc.weightx=1;
			gbc.weighty=1;
			gbc.anchor = GridBagConstraints.CENTER;
			button_elimina = new JButton("Elimina cliente");
			add(button_elimina);
		}*/
		
		
		//set border
		Border bordointerno = BorderFactory.createTitledBorder(testo);
		Border bordoesterno = BorderFactory.createEmptyBorder(0,5,5,5);
		Border bordofinale = BorderFactory.createCompoundBorder(bordointerno,bordoesterno);
		setBorder(bordofinale);
		
		
	}
}
