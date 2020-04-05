package co.edu.unbosque.view;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;

public class PanelUsuario extends JPanel {

	public JButton btnAgregar, btnModificar, btnEliminar, btnAsignarPuesto;
	public JLabel titulo;
	public CreacionUsuario cu = new CreacionUsuario();
	public BorrarUsuario bu = new BorrarUsuario();
	public ModificarUsuario mu = new ModificarUsuario();
	
	
	public PanelUsuario(){
		setLayout(null);
		setBackground(Color.white);
		setVisible(true);
		setBounds(30, 70, 400, 200);
		
		TitledBorder border = new TitledBorder("");
		border.setTitleFont(new Font("arial", Font.PLAIN, 16));
		
		setBorder(border);
		activarPanel();
	}
	
	public void activarPanel() {
	
		titulo = new JLabel("USUARIOS");
		titulo.setBackground(Color.white);
		titulo.setFont(new Font("Arial", Font.BOLD, 20));
		titulo.setBounds(150, 2, 360, 100);
		add(titulo);
		
		btnAgregar = new JButton("Agregar");
		btnAgregar.setFont(new Font("arial", Font.PLAIN, 14));
		btnAgregar.setBounds(50, 80, 100, 25);
		btnAgregar.setBackground(Color.white);
		add(btnAgregar);
		
		btnModificar = new JButton("Modificar");
		btnModificar.setFont(new Font("arial", Font.PLAIN, 14));
		btnModificar.setBounds(150, 80, 100, 25);
		btnModificar.setBackground(Color.white);
		add(btnModificar);
		
		btnEliminar = new JButton("Eliminar");
		btnEliminar.setFont(new Font("arial", Font.PLAIN, 14));
		btnEliminar.setBounds(250, 80, 100, 25);
		btnEliminar.setBackground(Color.white);
		add(btnEliminar);
		
		btnAsignarPuesto = new JButton("Asignar puesto de votacion");
		btnAsignarPuesto.setFont(new Font("arial", Font.PLAIN, 16));
		btnAsignarPuesto.setBounds(80, 120, 250, 30);
		btnAsignarPuesto.setBackground(Color.white);
		add(btnAsignarPuesto);
		
	}
	
	/* AGregar imagen al fondo del panel 
	public void paint(Graphics g) {
		Dimension tamano = getSize();
		imagen = new ImageIcon(getClass().getResource(nombre));
		g.drawImage(imagen.getImage(),0,0, tamano.width , tamano.height , null);
		setOpaque(false);
		super.paint(g);
		
		
	}*/
	
}

