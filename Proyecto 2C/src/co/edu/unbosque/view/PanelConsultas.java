package co.edu.unbosque.view;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;

public class PanelConsultas extends JPanel {
	
	public JLabel titulo;
	public JButton btnReportePV;
	public JButton btnInfPV;
	public JButton btnDept;
	public JButton btnMun;
	public JButton btnCed;
	
	public ConsultaDep cdp = new ConsultaDep();
	public ConsultaCed ccc = new ConsultaCed();
	
	public PanelConsultas() {
		setLayout(null);
		setBackground(Color.white);
		setVisible(true);
		setBounds(450, 70, 400, 200);
			
		TitledBorder border = new TitledBorder("");
		border.setTitleFont(new Font("arial", Font.PLAIN, 16));
		
		setBorder(border);
		activarPanel();
	}

	public void activarPanel() {
		
		titulo = new JLabel("CONSULTAS Y REPORTES");
		titulo.setBackground(Color.white);
		titulo.setFont(new Font("Arial", Font.BOLD, 20));
		titulo.setBounds(80, 1, 280, 100);
		add(titulo);
		
		btnReportePV = new JButton("Reporte de puestos");
		btnReportePV.setFont(new Font("arial",Font.PLAIN,12));
		btnReportePV.setBackground(Color.white);
		btnReportePV.setBounds(5, 120, 200, 25);
		add(btnReportePV);
		
		btnInfPV = new JButton("Info Puesto Votación");
		btnInfPV.setFont(new Font("arial",Font.PLAIN,12));
		btnInfPV.setBackground(Color.white);
		btnInfPV.setBounds(200, 120, 200, 25);
		add(btnInfPV);
		
		btnDept = new JButton("Consulta por Departamento");
		btnDept.setFont(new Font("arial",Font.PLAIN,12));
		btnDept.setBackground(Color.white);
		btnDept.setBounds(5, 80, 200, 25);
		add(btnDept);
		
		btnMun = new JButton("Consulta por Municipio");
		btnMun.setFont(new Font("arial",Font.PLAIN,12));
		btnMun.setBackground(Color.white);
		btnMun.setBounds(200, 80, 200, 25);
		add(btnMun);
		
		btnCed = new JButton("Consulta por cédula");
		btnCed.setFont(new Font("arial",Font.PLAIN,12));
		btnCed.setBackground(Color.white);
		btnCed.setBounds(5, 160, 200, 25);
		add(btnCed);
		
		
			
	}
		
}
