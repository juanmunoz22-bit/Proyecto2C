package co.edu.unbosque.view;

import java.awt.Color;
import java.awt.Font;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import co.edu.unbosque.view.images.FondoVentanaPrincipal;

public class VentanaPrincipal extends JFrame {

	public PanelUsuario pu = new PanelUsuario();
	public PanelConsultas pp= new PanelConsultas();
	public PanelEstadistica pe= new PanelEstadistica();
	public JLabel titulo = null;
	
	public VentanaPrincipal() {
		
		setTitle("REGISTRADURIA NACIONAL");
		setLayout(null);
		setSize(900, 620);
		titulo = new JLabel("SISTEMA DE INSCRIPCION");
		titulo.setBackground(Color.white);
		titulo.setBounds(320, 20, 300, 50);
		titulo.setFont(new Font("Arial", Font.BOLD, 22));

		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		
		add(titulo);
		add(pu);
		add(pp);
		add(pe);
		getContentPane().setBackground(Color.WHITE);

		setResizable(true);// IMPIDE QUE EL USUARIO MODIFIQUE EL TAMAÑO DE LA VENTANA
		setLocationRelativeTo(null);// CENTRAR LA VENTANA EN LA PANTALLA
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
	
	try {
        FondoVentanaPrincipal fondo = new FondoVentanaPrincipal(ImageIO.read(new File("./src/co/edu/unbosque/data/fondo.jpg")));
        JPanel panel = (JPanel) this.getContentPane();
        panel.setBorder(fondo);
    } catch (IOException ex) {
        JOptionPane.showMessageDialog(this, ex.getMessage(), "Error de lectura de fondo", JOptionPane.ERROR_MESSAGE);
    }
	
	}
	// ESTE METODO SE USA PARA MOSTRAR MENSAJES DE NOTIFICACION
			public void mostrarMensajes(String mensaje) {
				JOptionPane.showMessageDialog(null, mensaje);
			}	
	
		
}