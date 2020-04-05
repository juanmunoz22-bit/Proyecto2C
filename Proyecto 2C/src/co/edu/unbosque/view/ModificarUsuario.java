package co.edu.unbosque.view;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class ModificarUsuario extends JFrame {
	
	public JLabel aviso, cedula, titulo, nombreUno, nombreDos, apellidoUno, apellidoDos, tipoUsuario;
	public JTextField cedulaTxt, nombreUnoTxt,nombreDosTxt, apellidoUnoTxt, apellidoDosTxt;
	public JButton buscar, modificar, regresar, guardar;
	public JComboBox tipoSexoCmb;
	public PanelModificarUsuario pmu= new PanelModificarUsuario(); 
	
	public ModificarUsuario() {
		this.setTitle("Registraduria Nacional - Modificar Usuario");
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
		aviso = new JLabel(texto);
		aviso.setBounds(75, 0, 450, 50);
		aviso.setForeground(Color.red);
		aviso.setFont(new Font("Arial", Font.BOLD, 12));
		aviso.setVisible(false);
		add(aviso);
		
		String texto1="<html><body><center>MODIFICAR USUARIO</body></html>";
		titulo = new JLabel(texto1);
		titulo.setBounds(125, 10, 450, 50);
		titulo.setFont(new Font("Arial", Font.BOLD, 20));
		add(titulo);
		
		cedula = new JLabel("Ingrese numero de cedula");
		cedula.setBounds(50, 100, 200, 20);
		add(cedula);
		cedulaTxt = new JTextField();
		cedulaTxt.setBounds(200, 100, 150, 20);
		add(cedulaTxt);
		
		buscar = new JButton("Buscar");
		buscar.setBounds(355, 100, 70, 20);
		add(buscar);
		
		add(pmu);
		
		modificar = new JButton("Modificar");
		modificar.setBounds(250, 200, 150, 30);
		modificar.setVisible(false);
		add(modificar);
		
		regresar = new JButton("Regresar");
		regresar.setBounds(60, 200, 150, 30);
		add(regresar);
		
		nombreUno = new JLabel("Primer Nombre");
		nombreUno.setBounds(50, 300, 100, 20);
		add(nombreUno);
		nombreUno.setVisible(false);
		nombreUnoTxt = new JTextField();
		nombreUnoTxt.setBounds(250, 300, 150, 20);
		nombreUnoTxt.setName("nombreTxt");
		add(nombreUnoTxt);
		nombreUnoTxt.setVisible(false);
		
		nombreDos = new JLabel("Segundo Nombre");
		nombreDos.setBounds(50, 330, 100, 20);
		add(nombreDos);
		nombreDos.setVisible(false);
		nombreDosTxt = new JTextField();
		nombreDosTxt.setBounds(250, 330, 150, 20);
		nombreDosTxt.setName("nombreTxt");
		add(nombreDosTxt);
		nombreDosTxt.setVisible(false);
		
		apellidoUno = new JLabel("Primer Apellido");
		apellidoUno.setBounds(50, 360, 100, 20);
		add(apellidoUno);
		apellidoUno.setVisible(false);
		apellidoUnoTxt = new JTextField();
		apellidoUnoTxt.setBounds(250, 360, 150, 20);
		apellidoUnoTxt.setName("primerApellidoTxt");
		add(apellidoUnoTxt);
		apellidoUnoTxt.setVisible(false);
			
		apellidoDos = new JLabel("Segundo Apellido");
		apellidoDos.setBounds(50, 390, 100, 20);
		add(apellidoDos);
		apellidoDos.setVisible(false);
		apellidoDosTxt = new JTextField();
		apellidoDosTxt.setBounds(250, 390, 150, 20);
		apellidoDosTxt.setName("primerApellidoTxt");
		add(apellidoDosTxt);
		apellidoDosTxt.setVisible(false);
		
		tipoUsuario = new JLabel("Sexo");
		tipoUsuario.setBounds(50, 420, 100, 20);
		add(tipoUsuario);
		tipoUsuario.setVisible(false);
		Object[] listaTipoUsuario = new Object[2];
		listaTipoUsuario[0] = "Masculino";
		listaTipoUsuario[1] = "Femenino";
		tipoSexoCmb = new JComboBox(listaTipoUsuario);
		tipoSexoCmb.setBounds(250, 420, 150, 20);
		add(tipoSexoCmb);
		tipoSexoCmb.setVisible(false);
		
		guardar = new JButton("Guardar");
		guardar.setBounds(150, 500, 150, 30);
		guardar.setVisible(false);
		add(guardar);
		
	}
}
