package co.edu.unbosque.view;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;

public class PanelEstadistica extends JPanel{
	
	JLabel titulo = null;
	
	public PanelEstadistica() {
		
		setLayout(null);
		setBackground(Color.white);
		setVisible(true);
		setBounds(30, 350, 820, 200);
		
		TitledBorder border = new TitledBorder("");
		
		setBorder(border);
		activarPanel();
		
	}
	
	public void activarPanel() {
		
		titulo = new JLabel("Estadisticas");
		titulo.setBackground(Color.white);
		titulo.setFont(new Font("Arial", Font.BOLD, 20));
		titulo.setBounds(330, -20, 150, 100);
		add(titulo);
	}
	
}
