package co.edu.unbosque.view;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import co.edu.unbosque.model.persistencia.Propiedades;

public class ConsultaDep extends JFrame {
	
	public JLabel avisoLbl, depLbl, tituloLbl;
	public JTextField depTxt;
	public JButton buscarBtn, regresarBtn;

	public PanelConsultaDep cd= new PanelConsultaDep(); 
	
	public ConsultaDep() {
		this.setTitle("Registraduria Nacional - Consultar Departamento");
		this.setSize(450, 600);
		this.setLocationRelativeTo(null);
		this.setLayout(null);
		this.setResizable(false);
		this.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		activarComponentes();
		this.setVisible(false);
	}
	
	public void activarComponentes() {
		
		String texto="<html><body><center>Para modificar al usuario seleccionelo en el panel inferior<br> y oprima BORRAR</body></html>";
		avisoLbl = new JLabel(texto);
		avisoLbl.setBounds(75, 0, 450, 50);
		avisoLbl.setForeground(Color.red);
		avisoLbl.setFont(new Font("Arial", Font.BOLD, 12));
		avisoLbl.setVisible(false);
		add(avisoLbl);
		
		String texto1="<html><body><center>CONSULTAR DEPARTAMENTO</body></html>";
		tituloLbl = new JLabel(texto1);
		tituloLbl.setBounds(85, 10, 450, 50);
		tituloLbl.setFont(new Font("Arial", Font.BOLD, 20));
		add(tituloLbl);
		
		depLbl = new JLabel("Ingrese el departamento");
		depLbl.setBounds(30, 100, 200, 20);
		add(depLbl);
		
		depTxt = new JTextField();
		depTxt.setBounds(180, 100, 150, 20);
		add(depTxt);
		
		buscarBtn = new JButton("Buscar");
		buscarBtn.setBounds(335, 100, 100, 20);
		add(buscarBtn);

		add(cd);
		
		
		regresarBtn = new JButton("Regresar");
		regresarBtn.setBounds(60, 200, 150, 30);
		add(regresarBtn);	
		
		
	
	}
}