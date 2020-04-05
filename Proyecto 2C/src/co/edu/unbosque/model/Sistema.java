package co.edu.unbosque.model;

import java.io.Serializable;
import java.util.ArrayList;

public class Sistema implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -5334213412722624005L;

	private Persona persona = null;
	
	private Puesto puesto = null;
	
	public ArrayList<Persona> arraypersonas = new ArrayList<Persona>();

	public Sistema() {
	}

	public Persona getPersona() {
		return persona;
	}

	public void setPersona(Persona persona) {
		this.persona = persona;
	}

	public Puesto getPuesto() {
		return puesto;
	}

	public void setPuesto(Puesto puesto) {
		this.puesto = puesto;
	}

	public ArrayList<Persona> getArraypersonas() {
		return arraypersonas;
	}

	public void setArraypersonas(ArrayList<Persona> arraypersonas) {
		this.arraypersonas = arraypersonas;
	}


	
	 
	
	
	
	
}
