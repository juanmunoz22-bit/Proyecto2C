package co.edu.unbosque.view;

import java.awt.Color;
import java.awt.Font;

import javax.swing.DefaultListModel;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.ListModel;
import javax.swing.border.TitledBorder;

public class PanelBorrarUsuario extends JPanel{
	
	
	private JScrollPane scrollPane = new JScrollPane();
	public DefaultListModel<String> listModel = new DefaultListModel<>();
	public JList<String> borrarUsuario = new JList<String>(listModel);
	public JLabel usuario = null;
	String nombre="";
	
	public PanelBorrarUsuario() {
		
		setLayout(null);
		setBackground(Color.white);
		
		setBounds(30, 100, 380, 50);
		
		TitledBorder border = new TitledBorder("");
		border.setTitleFont(new Font("arial", Font.PLAIN, 16));
		setBorder(border);
		activarPanel(nombre);
		setVisible(true);
		
	}
	
	public void activarPanel(String nombre) {
		scrollPane.setViewportView(borrarUsuario);
		scrollPane.setBounds(0, 0, 379, 50);
		borrarUsuario.setFont(new Font("arial", Font.PLAIN, 14));
		add(scrollPane);
		
		
	}
	
}
