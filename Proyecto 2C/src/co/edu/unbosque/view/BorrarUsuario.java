package co.edu.unbosque.view;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class BorrarUsuario extends JFrame {

	public JLabel cedula, aviso;
	public JTextField insertar_cedula;
	public JButton borrar, regresar, buscar;
	public PanelBorrarUsuario pbu= new PanelBorrarUsuario();

	public BorrarUsuario() {

		this.setTitle("Registraduria Nacional - Borrar Usuario");
		this.setSize(450, 250);
		this.setLocationRelativeTo(null);
		this.setLayout(null);
		this.setResizable(false);
		this.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);

		activarComponentes();
		
		this.setVisible(false);
	}
	
	public void activarComponentes() {
		String texto="<html><body><center>Para eliminar al usuario seleccionelo en el panel inferior<br> y oprima BORRAR</body></html>";
		aviso = new JLabel(texto);
		aviso.setBounds(75, 0, 450, 50);
		aviso.setForeground(Color.red);
		aviso.setFont(new Font("Arial", Font.BOLD, 12));
		aviso.setVisible(false);
		add(aviso);
		
		cedula = new JLabel("Ingrese numero de cedula");
		cedula.setBounds(50, 60, 200, 20);
		add(cedula);
		insertar_cedula = new JTextField();
		insertar_cedula.setBounds(200, 60, 150, 20);
		add(insertar_cedula);
		
		buscar = new JButton("Buscar");
		buscar.setBounds(355, 60, 70, 20);
		add(buscar);
		
		borrar = new JButton("Borrar");
		borrar.setBounds(250, 165, 150, 30);
		add(borrar);
		
		regresar = new JButton("Regresar");
		regresar.setBounds(60, 165, 150, 30);
		add(regresar);
		
		add(pbu);
	}

}
