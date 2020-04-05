package co.edu.unbosque.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

import co.edu.unbosque.model.Persona;
import co.edu.unbosque.model.Puesto;
import co.edu.unbosque.model.Sistema;
import co.edu.unbosque.view.CreacionUsuario;
import co.edu.unbosque.view.VentanaPrincipal;

/**
 * Clase controlador que se encarga de realizar todas las acciones y 
 * capturar los datos de la vista para implementar los metodos creados
 * en el modelo
 * @author Grupo Votacion
 *
 */
public class Controller implements ActionListener {
	
	Sistema sistema = null;
	VentanaPrincipal vp=null;

	private String cedula;
	private String nombre1="", nombre2="", apellido1="", apellido2="", lugar_exp="", lugar_nac="", sexo="", fechaN="",
			fechaE="";
	private String nombre=null;
	private int num;
	
	
	/**
	 * Metodo constructor del controlador
	 * @param persona Utiliza las propiedades del constructor de la clase Persona
	 * @param puesto Utiliza las propiedades del constructor de la clase Puesto
	 */
	public Controller(VentanaPrincipal vp, Sistema sistema) {
		super();
		this.sistema = sistema;
		this.vp = vp;
		actionListener(this);
	}
	
	/**
	 *	Metodo que sirve para escuchar cuando se ha oprimido un boton de la vista 
	 * <b>pre</b> Se necesita tener un resultado al orpimir un boton<br>
	 * <b>post</b> Crea una accion al oprimir un boton<br>
	 * @param escuchador Genera una accion si se Utiliza la clase ActionListener despues de un clic
	 */
	private void actionListener(ActionListener escuchador) {
		vp.pu.btnAgregar.addActionListener(escuchador);
		vp.pu.cu.guardarBtn.addActionListener(escuchador);
		vp.pu.cu.atrasBtn.addActionListener(escuchador);
		vp.pu.btnEliminar.addActionListener(escuchador);
		vp.pu.bu.buscar.addActionListener(escuchador);
		vp.pu.bu.borrar.addActionListener(escuchador);
		vp.pu.bu.regresar.addActionListener(escuchador);
		vp.pu.btnModificar.addActionListener(escuchador);
		vp.pu.mu.buscar.addActionListener(escuchador);
		vp.pu.mu.regresar.addActionListener(escuchador);
		vp.pu.mu.modificar.addActionListener(escuchador);
		vp.pu.mu.guardar.addActionListener(escuchador);
	}

	/**
	 * Este metodo utiliza los valores de la clase ActionListener para realizar una accion 
	 * en caso de un clic o de oprimir un boton
	 * <b>pre</b>  Si se oprime un boton debe suceder algo<br>
	 * <b>post</b> Se genero una accion al oprimir un boton<br>
	 * @param evento Utiliza las propuedades de la clase ActionEvent en cuanto hay un evento o clic
	 * en la aplicacion
	 */
	@Override
	public void actionPerformed(ActionEvent event) {
		
		//Oprimir el boton agregar personas del JPanel Agregar Personas
		if(vp.pu.btnAgregar == event.getSource()) {
					vp.pu.cu.setVisible(true);
		}
		
		//Agregar una persona al arreglo de personas del JFrame CreacionUsuario
		if(vp.pu.cu.guardarBtn == event.getSource()) {
			String mensaje="";
		
				cedula=vp.pu.cu.numeroIdentificacionTxt.getText();
				nombre1=vp.pu.cu.nombreUnoTxt.getText();
				nombre2=vp.pu.cu.nombreDosTxt.getText();
				apellido1=vp.pu.cu.apellidoUnoTxt.getText();
				apellido2=vp.pu.cu.apellidoDosTxt.getText();
				lugar_nac=(String)vp.pu.cu.depNac.getSelectedItem();
				lugar_exp=(String)vp.pu.cu.depExp.getSelectedItem();
				sexo=(String) vp.pu.cu.tipoSexoCmb.getSelectedItem();
				fechaE=(String) vp.pu.cu.diaExpCmb.getSelectedItem()+"-"+
						vp.pu.cu.mesExpCmb.getSelectedItem()+"-"+
						vp.pu.cu.anoExpCmb.getSelectedItem();
				fechaN=(String) vp.pu.cu.diaNacCmb.getSelectedItem()+"-"+
						vp.pu.cu.mesNacCmb.getSelectedItem()+"-"+
						vp.pu.cu.anoNacCmb.getSelectedItem();
				
				if((String.valueOf(vp.pu.cu.numeroIdentificacionTxt.getText()).isEmpty())
						||vp.pu.cu.nombreUnoTxt.getText().isEmpty()
						||vp.pu.cu.nombreDosTxt.getText().isEmpty()
						||vp.pu.cu.apellidoUnoTxt.getText().isEmpty()
						||vp.pu.cu.apellidoDosTxt.getText().isEmpty()) {
					
					mensaje = "Todos los campos son obligatorios";
					vp.mostrarMensajes(mensaje);
					
				}
				
				else{
					Persona persona = new Persona(cedula, fechaE, lugar_exp, nombre1, nombre2, apellido1, apellido2,
							fechaN, lugar_nac, sexo);
					if(sistema.agregarPersona(cedula, persona, sistema.arraypersonas)) {
						mensaje="Persona añadida al sistema exitosamente";
						vp.mostrarMensajes(mensaje);
					}else {
						mensaje="Ya existe un usuario registrado con este numero de cedula";
						vp.mostrarMensajes(mensaje);
					}
					
				}
				vp.pu.cu.nombreUnoTxt.setText(null);
				vp.pu.cu.nombreDosTxt.setText(null);
				vp.pu.cu.apellidoUnoTxt.setText(null);
				vp.pu.cu.apellidoDosTxt.setText(null);
				vp.pu.cu.numeroIdentificacionTxt.setText(null);
				
		}
		//Boton para ir atras de la ventana agregar usuario(JFrame CreacionUsuario) a la ventana principal
		if(vp.pu.cu.atrasBtn == event.getSource()) {
				
			try {
				vp.pu.cu.setVisible(false);
				vp.setVisible(true);
				
			} catch (Exception e) {
				
				
			}
		
		}
		//Boton eliminar usuario para entrar a la ventana de eliminar usuario
		if (vp.pu.btnEliminar==event.getSource()) {
			try {
				vp.pu.bu.setVisible(true);
				}
			 catch (Exception e) {
			
			 }
		}
		//Filtra la informacion de las cedulas inscritas y muestra la informacion del ciudadano segun la cedula que se busque
		if (vp.pu.bu.buscar==event.getSource()) {
			
			String mensaje= "";
			try {
				vp.pu.bu.pbu.listModel.clear();
				if(sistema.arraypersonas.isEmpty()) {
					mensaje="No hay personas registradas en nuestra base de datos";
					vp.mostrarMensajes(mensaje);
				}
				int num = Integer.parseInt(vp.pu.bu.insertar_cedula.getText());
				if(sistema.arraypersonas.isEmpty()==false) {
					for (int i = 0; i <= sistema.arraypersonas.size()-1; i++) {
						if (num==Integer.parseInt(sistema.arraypersonas.get(i).getNumero_cedula())) {
							nombre=sistema.arraypersonas.get(i).getApellido1()+" "+sistema.arraypersonas.get(i).getApellido2()+" "
									+sistema.arraypersonas.get(i).getNombre1()+" "+sistema.arraypersonas.get(i).getNombre2()+" C.C. "
									+(sistema.arraypersonas.get(i).getNumero_cedula());
							vp.pu.bu.pbu.listModel.add(0, nombre.toUpperCase());
							vp.pu.bu.aviso.setVisible(true);
							
						}
						
					}if(vp.pu.bu.pbu.listModel.isEmpty()) {
						mensaje="El numero de cedula digitado no existe";
						vp.mostrarMensajes(mensaje);
					}
					
				}
					
			}catch (Exception e) {
				mensaje="DEBE DIGITAR UN NUMERO DE CEDULA";
				vp.mostrarMensajes(mensaje);
				
			}
		}
		
		if(vp.pu.bu.borrar==event.getSource()) {
			String mensaje="";
			if(vp.pu.bu.pbu.borrarUsuario.getSelectedIndex()!=0) {
				mensaje="Para confirmar su eleccion debe seleccionar el usuario en la ventana de abajo";
				vp.mostrarMensajes(mensaje);
			}else {
				num=vp.pu.bu.pbu.borrarUsuario.getSelectedIndex();
				mensaje=sistema.eliminarPersona(num);
				vp.mostrarMensajes(mensaje);
				vp.pu.bu.pbu.listModel.clear();
				vp.pu.bu.aviso.setVisible(false);
			}
		}
		
		//Boton regresar para volver del JFrame borrarUsuario a ventana principal
		if (vp.pu.bu.regresar==event.getSource()) {
			vp.pu.bu.setVisible(false);
		}
		
		//Boton para entrar en el Jframe modificarUsuairio
		if (vp.pu.btnModificar==event.getSource()) {
			vp.pu.mu.setVisible(true);
		}
		
		
		//Boton regresar para volver del JFrame MoUsuario a ventana principal
		if(vp.pu.mu.regresar==event.getSource()) {
			vp.pu.mu.setVisible(false);
			
		}
		
		if(vp.pu.mu.buscar==event.getSource()) {
			String mensaje= "";
			try {
				vp.pu.mu.pmu.listModel1.clear();
				if(sistema.arraypersonas.isEmpty()) {
					mensaje="No hay personas registradas en nuestra base de datos";
					vp.mostrarMensajes(mensaje);
				}
				int num = Integer.parseInt(vp.pu.mu.cedulaTxt.getText());
				if(sistema.arraypersonas.isEmpty()==false) {
					for (int i = 0; i <= sistema.arraypersonas.size()-1; i++) {
						if (num==Integer.parseInt(sistema.arraypersonas.get(i).getNumero_cedula())) {
							nombre=sistema.arraypersonas.get(i).getApellido1()+" "+sistema.arraypersonas.get(i).getApellido2()+" "
									+sistema.arraypersonas.get(i).getNombre1()+" "+sistema.arraypersonas.get(i).getNombre2()+" C.C. "
									+(sistema.arraypersonas.get(i).getNumero_cedula());
							vp.pu.mu.pmu.listModel1.add(0, nombre.toUpperCase());
							vp.pu.mu.titulo.setVisible(false);
							vp.pu.mu.aviso.setVisible(true);
							vp.pu.mu.modificar.setVisible(true);
							
						}
						
					}if(vp.pu.mu.pmu.listModel1.isEmpty()) {
						mensaje="El numero de cedula digitado no existe";
						vp.mostrarMensajes(mensaje);
					}
					
				}
					
			}catch (Exception e) {
				mensaje="DEBE DIGITAR UN NUMERO DE CEDULA";
				vp.mostrarMensajes(mensaje);
				
			}
		}
		
		if(vp.pu.mu.modificar==event.getSource()) {
			String mensaje="";
			if(vp.pu.mu.pmu.modificarUsuario.getSelectedIndex()!=0) {
				mensaje="Para confirmar su eleccion debe seleccionar el usuario en la ventana de abajo";
				vp.mostrarMensajes(mensaje);
			}else {
				
				vp.pu.mu.nombreUno.setVisible(true);
				vp.pu.mu.nombreUnoTxt.setVisible(true);
				vp.pu.mu.nombreDos.setVisible(true);
				vp.pu.mu.nombreDosTxt.setVisible(true);
				vp.pu.mu.apellidoUno.setVisible(true);
				vp.pu.mu.apellidoUnoTxt.setVisible(true);
				vp.pu.mu.apellidoDos.setVisible(true);
				vp.pu.mu.apellidoDosTxt.setVisible(true);
				vp.pu.mu.tipoUsuario.setVisible(true);
				vp.pu.mu.tipoSexoCmb.setVisible(true);
				vp.pu.mu.guardar.setVisible(true);
			}
		}
		
		if(vp.pu.mu.guardar==event.getSource()) {
			String mensaje;
			int num2 = Integer.parseInt(vp.pu.mu.cedulaTxt.getText());
			if(sistema.arraypersonas.isEmpty()==false) {
				for (int i = 0; i <= sistema.arraypersonas.size()-1; i++) {
					if (num2==Integer.parseInt(sistema.arraypersonas.get(i).getNumero_cedula())) {
						
						mensaje=sistema.modificarCiudadano(i, vp.pu.mu.nombreUnoTxt.getText(), vp.pu.mu.nombreDosTxt.getText(),
								vp.pu.mu.apellidoUnoTxt.getText(), vp.pu.mu.apellidoDosTxt.getText());
						vp.mostrarMensajes(mensaje);
						vp.pu.mu.nombreUno.setVisible(false);
						vp.pu.mu.nombreUnoTxt.setText(null);
						vp.pu.mu.nombreUnoTxt.setVisible(false);
						vp.pu.mu.nombreDos.setVisible(false);
						vp.pu.mu.nombreDosTxt.setText(null);
						vp.pu.mu.nombreDosTxt.setVisible(false);
						vp.pu.mu.apellidoUno.setVisible(false);
						vp.pu.mu.apellidoUnoTxt.setText(null);
						vp.pu.mu.apellidoUnoTxt.setVisible(false);
						vp.pu.mu.apellidoDos.setVisible(false);
						vp.pu.mu.apellidoDosTxt.setText(null);
						vp.pu.mu.apellidoDosTxt.setVisible(false);
						vp.pu.mu.tipoUsuario.setVisible(false);
						vp.pu.mu.tipoSexoCmb.setVisible(false);
						vp.pu.mu.guardar.setVisible(false);
						vp.pu.mu.pmu.listModel1.clear();
						
						
					}
					
				}
				
			}
			System.out.println(sistema.arraypersonas.get(0).getNombre1());
			System.out.println(sistema.arraypersonas.get(0).getNombre2());
		}
		
	}
	
}