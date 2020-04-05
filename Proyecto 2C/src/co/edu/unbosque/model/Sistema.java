package co.edu.unbosque.model;

import java.util.ArrayList;

public class Sistema implements Estadistica, Ciudadano {

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

	public Persona buscarPersona(String cedula, ArrayList<Persona> arraypersonas) {
		Persona p = null;
		if (!arraypersonas.isEmpty()) {
			for (int i = 0; i <= arraypersonas.size()-1 ; i++) {
				if(arraypersonas.get(i).getNumero_cedula().equals(cedula)){
					p = arraypersonas.get(i);
				}
			}
			
		}
		return p;
	}
	@Override
	public boolean agregarPersona(String cedula,Persona persona, ArrayList<Persona> arraypersonas) {
		Persona nuevo = null;
		if (buscarPersona(cedula, arraypersonas)==null) {
			nuevo=persona;
			arraypersonas.add(persona);
			return true;
		}else {
			return false;
		}
	}

	@Override
	public String modificarCiudadano(int pos, String n1, String n2, String a1, String a2) {
		String mensaje="";
		if(n1.isEmpty() && n2.isEmpty() && a1.isEmpty() && a2.isEmpty()) {
			mensaje="Para guardar debe sobreescribir al menos un campo";
		}
		else {
			if (!n1.isEmpty()) {
				arraypersonas.get(pos).setNombre1(n1);
				mensaje="Se han hecho los cambios en el primer nombre";
			}
			if(!n2.isEmpty()) {
				arraypersonas.get(pos).setNombre2(n2);
				mensaje="Se han hecho los cambios en el segundo nombre";
			}
			if(!a1.isEmpty()) {
				arraypersonas.get(pos).setApellido1(a1);
				mensaje="Se han hecho los cambios en el primer apellido";
			}
			if(!a2.isEmpty()) {
				arraypersonas.get(pos).setApellido2(a2);
				mensaje="Se han hecho los cambios en el segundo apellido";
			}
		}
		return mensaje;
	}

	@Override
	public String eliminarPersona(int pos) {
		
		String mensaje = "";
		arraypersonas.remove(pos);
		mensaje = "Se ha eliminado la persona";
		return mensaje;
		
	}

	

	@Override
	public void mostrarInfoPuesto() {
		
	}

	@Override
	public void modificarPuesto() {
		
	}

	@Override
	public void calcularEstadistica() {
		
	}

	
	 
	
	
	
	
}
