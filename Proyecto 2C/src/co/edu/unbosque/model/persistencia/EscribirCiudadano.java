package co.edu.unbosque.model.persistencia;

import java.io.FileWriter;
import java.io.PrintWriter;

public class EscribirCiudadano {
	{
	// CLASE PRUEBA, DE IGUAL MANERA ANDRES SABE MAS DE ARCHIVOS
	FileWriter fichero = null;
	PrintWriter pw = null; //DISCULPEN EL SUEÑO NO ME DEJA ENTENDER DEL POR QUE EL ERROR.

	try

	{
		fichero = new FileWriter(":/Ciudadano.txt");
		pw = new PrintWriter(fichero);

		for (int i = 0; i < 10; i++) { // I deberia tener un valor maximo al tamaño de lineas. No se como hacerlo,
										// maybe .lenght?
			pw.println("Linea " + i); // deberia imprimir cantidad de lineas / Ciudadanos. Tal ves se pueda modificar el contenido
		}
	}catch

	(
	Exception e)
	{

		e.printStackTrace();
	}finally
	{
		try {
			if (null != fichero)
				fichero.close();
		} catch (Exception e1) {
			e1.printStackTrace();
		}
	}
}}