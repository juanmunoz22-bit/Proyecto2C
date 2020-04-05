package co.edu.unbosque.model;
/**
 * Interfaz que define los metodos de un puesto de votacion 
 * * @author Grupo Votacion
 *
 */
public interface Estadistica {
	/**
	 * Metodo abstracto con la informacion del puesto
	 */
	void mostrarInfoPuesto();
	
	void modificarPuesto();
	
	void calcularEstadistica();
	
}
