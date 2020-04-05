package co.edu.unbosque.model.persistencia;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class LeerPuesto {
	{
//HAY UN METODO FILE QUE SE LLAME LIST, APARENTEMENTE ENTREGA TODO LO DE UN ARCHIVO EN FORMA DE LISTA, PODRIA SER UTIL.
	File archivo = null;
	FileReader fr = null;
	BufferedReader br = null; 
	
	try
	{
		archivo = new File(":/puestovotacion.txt"); // SE CREA UN TXT EN LA RAIZ DEL PROGRAMA
		fr = new FileReader(archivo); // SE INSTANCIAN TANTO EL LECTOR COMO EL BUFFER
		br = new BufferedReader(fr);

		// SE LEE EL FICHERO
		String linea;
		while ((linea = br.readLine()) != null)
			System.out.println(linea);
	}catch(
	Exception e)
	{
		e.printStackTrace();

	}finally
	{ // SI ALGO LLEGA A SALIR MAL EL FICHERO SE CIERRA DE TODAS MANERAS
		try {
			if (null != fr) {
				fr.close();
			}
		} catch (Exception e1) {
			e1.printStackTrace();
		}
	}
}}
