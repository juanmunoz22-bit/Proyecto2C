package co.edu.unbosque.model;

import java.util.ArrayList;

public interface Ciudadano {

	public boolean agregarPersona(String cedula,Persona persona, ArrayList<Persona> arraypersonas);
	
	String modificarCiudadano(int pos, String n1, String n2, String a1, String a2);
	
	String eliminarPersona(int pos);	
	
}
