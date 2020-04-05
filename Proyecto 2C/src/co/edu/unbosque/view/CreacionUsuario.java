package co.edu.unbosque.view;

import java.awt.Color;
import java.awt.Font;
import java.io.*;
import java.util.ArrayList;

import javax.swing.ComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import javax.swing.JTextField;

import co.edu.unbosque.model.persistencia.LeerArchivos;


public class CreacionUsuario extends JFrame {
	

	
	public JComboBox tipoSexoCmb;
	public JComboBox diaExpCmb;
	public JComboBox mesExpCmb;
	public JComboBox anoExpCmb;
	public JComboBox diaNacCmb;
	public JComboBox mesNacCmb;
	public JComboBox anoNacCmb;
	public JComboBox depNac;
	public JComboBox depExp;
	
	public JTextField nombreUnoTxt;
	public JTextField nombreDosTxt;
	public JTextField apellidoUnoTxt;
	public JTextField apellidoDosTxt;
	public JTextField numeroIdentificacionTxt;
	public JTextField montoCreditoTxt;
	public JTextField lugarExpTxt;
	public JTextField fechaExpTxt;
	public JTextField fechaNacTxt;
	
	private JLabel nombreUno;
	private JLabel nombreDos;
	private JLabel apellidoUno;
	private JLabel apellidoDos;
	private JLabel numeroIdentificacion;
	private JLabel fechaExpLbl;
	private JLabel fechaNacLbl;
	private JLabel tipoUsuario;
	private JLabel titulo;
	private JLabel lugarNacLbl;
	private JLabel lugarExpLbl;
	
	public JButton guardarBtn;
	public JButton atrasBtn;
	
	public LeerArchivos leerArchivo = new LeerArchivos();
	
	
	public CreacionUsuario() {

		
		this.setTitle("Registraduria Nacional - Registrar Usuario");
		this.setSize(450, 380);
		this.setLocationRelativeTo(null); 
		this.setLayout(null);
		this.setResizable(false);
		this.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		
		titulo = new JLabel("NUEVO USUARIO");
		titulo.setBounds(150, 10, 200, 50);
		titulo.setFont(new Font("Arial", Font.BOLD, 20));
		add(titulo);
		
		
		
		activarComponentes();
		
		this.setVisible(false);
		
	}
	
	public void activarComponentes(){
		
		nombreUno = new JLabel("Primer Nombre");
		nombreUno.setBounds(50, 60, 100, 20);
		add(nombreUno);
		nombreUnoTxt = new JTextField();
		nombreUnoTxt.setBounds(250, 60, 150, 20);
		nombreUnoTxt.setName("nombreTxt");
		add(nombreUnoTxt);
		
		nombreDos = new JLabel("Segundo Nombre");
		nombreDos.setBounds(50, 80, 100, 20);
		add(nombreDos);
		nombreDosTxt = new JTextField();
		nombreDosTxt.setBounds(250, 80, 150, 20);
		nombreDosTxt.setName("nombreTxt");
		add(nombreDosTxt);
		
		apellidoUno = new JLabel("Primer Apellido");
		apellidoUno.setBounds(50, 100, 100, 20);
		add(apellidoUno);
		apellidoUnoTxt = new JTextField();
		apellidoUnoTxt.setBounds(250, 100, 150, 20);
		apellidoUnoTxt.setName("primerApellidoTxt");
		add(apellidoUnoTxt);
			
		apellidoDos = new JLabel("Segundo Apellido");
		apellidoDos.setBounds(50, 120, 100, 20);
		add(apellidoDos);
		apellidoDosTxt = new JTextField();
		apellidoDosTxt.setBounds(250, 120, 150, 20);
		apellidoDosTxt.setName("primerApellidoTxt");
		add(apellidoDosTxt);
		
		numeroIdentificacion = new JLabel("Identificación");
		numeroIdentificacion.setBounds(50, 140, 100, 20);
		add(numeroIdentificacion);
		numeroIdentificacionTxt = new JTextField();
		numeroIdentificacionTxt.setBounds(250, 140, 150, 20);
		numeroIdentificacionTxt.setName("numeroIdentificacionTxt");
		add(numeroIdentificacionTxt);
		
		lugarNacLbl = new JLabel("Lugar de Nacimiento");
		lugarNacLbl.setBounds(50, 160, 130, 20);
		add(lugarNacLbl);
		File depN = new File("./src/co/edu/unbosque/data/Departamentos");
		ArrayList<String> listaDepN = new ArrayList<String>();
		leerArchivo.leerDepartamento(depN, listaDepN);
		depNac = new JComboBox(listaDepN.toArray());
		depNac.setBounds(250, 160, 150, 20);
		add(depNac);
		
		lugarExpLbl = new JLabel("Lugar de Expedicion");
		lugarExpLbl.setBounds(50, 180, 150, 20);
		add(lugarExpLbl);
		File depE = new File("./src/co/edu/unbosque/data/Departamentos");
		ArrayList<String> listaDepE = new ArrayList<String>();
		leerArchivo.leerDepartamento(depE, listaDepE);
		depExp = new JComboBox(listaDepE.toArray());
		depExp.setBounds(250, 180, 150, 20);
		add(depExp);
	
		
		fechaExpLbl = new JLabel("Fecha Expedición Cédula");
		fechaExpLbl.setBounds(50, 200, 180, 20);
		add(fechaExpLbl);
		File diaE = new File ("./src/co/edu/unbosque/data/dia");;
		ArrayList<String> listaDia = new ArrayList<String>();
		leerArchivo.leerFecha(diaE, listaDia);
		diaExpCmb = new JComboBox(listaDia.toArray());
		diaExpCmb.setBounds(250,200 ,40 ,20 );
		add(diaExpCmb);
		File mesE = new File ("./src/co/edu/unbosque/data/mes");;
		ArrayList<String> listaMes = new ArrayList<String>();
		leerArchivo.leerFecha(mesE, listaMes);
		mesExpCmb = new JComboBox(listaMes.toArray());
		mesExpCmb.setBounds(300,200 ,40 ,20 );
		add(mesExpCmb);
		File anoE = new File ("./src/co/edu/unbosque/data/anio");;
		ArrayList<String> listaAno = new ArrayList<String>();
		leerArchivo.leerFecha(anoE, listaAno);
		anoExpCmb = new JComboBox(listaAno.toArray());
		anoExpCmb.setBounds(350,200 ,50 ,20 );
		add(anoExpCmb);
		
		
		fechaNacLbl = new JLabel("Fecha Nacimiento");
		fechaNacLbl.setBounds(50, 220, 120, 20);
		add(fechaNacLbl);
		File diaN = new File ("./src/co/edu/unbosque/data/dia");;
		ArrayList<String> listaDiaN = new ArrayList<String>();
		leerArchivo.leerFecha(diaN, listaDiaN);
		diaNacCmb = new JComboBox(listaDiaN.toArray());
		diaNacCmb.setBounds(250,220 ,40 ,20 );
		add(diaNacCmb);
		File mesN = new File ("./src/co/edu/unbosque/data/mes");;
		ArrayList<String> listaMesN = new ArrayList<String>();
		leerArchivo.leerFecha(mesN, listaMesN);
		mesNacCmb = new JComboBox(listaMesN.toArray());
		mesNacCmb.setBounds(300,220 ,40 ,20 );
		add(mesNacCmb);
		File anoN = new File ("./src/co/edu/unbosque/data/anio");
		ArrayList<String> listaAnoN = new ArrayList<String>();
		leerArchivo.leerFecha(anoN, listaAnoN);
		anoNacCmb = new JComboBox(listaAnoN.toArray());
		anoNacCmb.setBounds(350,220 ,50 ,20 );
		add(anoNacCmb);
		
		
		tipoUsuario = new JLabel("Sexo");
		tipoUsuario.setBounds(50, 240, 100, 20);
		add(tipoUsuario);
		Object[] listaTipoUsuario = new Object[2];
		listaTipoUsuario[0] = "Masculino";
		listaTipoUsuario[1] = "Femenino";
		tipoSexoCmb = new JComboBox(listaTipoUsuario);
		tipoSexoCmb.setBounds(250, 240, 150, 20);
		add(tipoSexoCmb);
		
		
		atrasBtn = new JButton("Regresar");
		atrasBtn.setBounds(120, 310, 100, 20);
		atrasBtn.setName("atrasBtn");
		add(atrasBtn);
		 
		guardarBtn = new JButton("Guardar");
		guardarBtn.setBounds(250, 310, 100, 20);
		guardarBtn.setName("guardarBtn");
		add(guardarBtn);
	}
	
	
}