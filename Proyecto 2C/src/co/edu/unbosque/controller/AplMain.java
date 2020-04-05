package co.edu.unbosque.controller;

import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

import co.edu.unbosque.model.Sistema;
import co.edu.unbosque.view.CreacionUsuario;
import co.edu.unbosque.view.VentanaPrincipal;


public class AplMain {
	/**
	 * Este metodo llama a los paquetes Modelo y Vista para ser implementados en el controlador
	 * <b>pre</b> Se necesita inscribir cedulas en un puesto de votacion<br>
	 * <b>post</b> Se inscribe una cedula <br>
	 * @param args Envia valores al programa
	 */
	public static void main(String[] args) {
		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		} catch (UnsupportedLookAndFeelException e) {
		} catch (ClassNotFoundException e) {
		} catch (InstantiationException e) {
		} catch (IllegalAccessException e) {
		}
		
		
		Sistema sistema = new Sistema();
		CreacionUsuario usuario = new CreacionUsuario();
		VentanaPrincipal vp = new VentanaPrincipal();
		Controller controller = new Controller(vp, sistema);
	
	}
}
