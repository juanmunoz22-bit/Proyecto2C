package co.edu.unbosque.view;

import java.awt.Color;
import java.awt.Font;

import javax.swing.DefaultListModel;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.TitledBorder;

public class PanelConsultaDep extends JPanel {
	
	private JScrollPane scrollPane1 = new JScrollPane();
	public DefaultListModel<String> listModel1 = new DefaultListModel<>();
	public JList<String> modificarUsuario = new JList<String>(listModel1);
	public JLabel usuario = null;
	String nombre="";
	
	public PanelConsultaDep() {
	
		setLayout(null);
		setBackground(Color.white);
		setVisible(true);
		setBounds(30, 140, 380, 50);
		
		TitledBorder border = new TitledBorder("");
		border.setTitleFont(new Font("arial", Font.PLAIN, 16));
		setBorder(border);
		activarPanel(nombre);
		
	}
	
	public void activarPanel(String nombre) {
		
		scrollPane1.setViewportView(modificarUsuario);
		scrollPane1.setBounds(0, 0, 379, 50);
		modificarUsuario.setFont(new Font("arial", Font.PLAIN, 14));
		add(scrollPane1);
	}

}
