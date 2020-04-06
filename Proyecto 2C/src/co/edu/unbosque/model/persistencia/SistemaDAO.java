package co.edu.unbosque.model.persistencia;

import java.io.IOException;
import java.util.ArrayList;

import co.edu.unbosque.model.Ciudadano;
import co.edu.unbosque.model.Persona;

public class SistemaDAO implements Ciudadano {

	private Archivo archivo;
	public ArrayList<Persona> arraypersonas = new ArrayList<Persona>();

	public SistemaDAO() {

	}

	public SistemaDAO(Archivo archivo) {
		this.archivo = archivo;
	}

	// CRUD

	public Persona buscarPersona(String cedula, ArrayList<Persona> arraypersonas) {
		Persona p = null;
		if (!arraypersonas.isEmpty()) {
			for (int i = 0; i <= arraypersonas.size() - 1; i++) {
				if (arraypersonas.get(i).getNumero_cedula().equals(cedula)) {
					p = arraypersonas.get(i);
				}
			}

		}
		return p;
	}

	@Override
	public boolean agregarPersona(String cedula, Persona persona, ArrayList<Persona> arraypersonas) {
		Persona nuevo = null;
		if (buscarPersona(cedula, arraypersonas) == null) {
			nuevo = persona;
			arraypersonas.add(persona);
			archivo.escribirEnArchivo(arraypersonas);
			return true;
		} else {
			return false;
		}
	}

	@Override
	public String modificarCiudadano(int pos, String n1, String n2, String a1, String a2) {
		String mensaje = "";
		if (n1.isEmpty() && n2.isEmpty() && a1.isEmpty() && a2.isEmpty()) {
			mensaje = "Para guardar debe sobreescribir al menos un campo";
		} else {
			if (!n1.isEmpty()) {
				arraypersonas.get(pos).setNombre1(n1);
				mensaje = "Se han hecho los cambios en el primer nombre";
			}
			if (!n2.isEmpty()) {
				arraypersonas.get(pos).setNombre2(n2);
				mensaje = "Se han hecho los cambios en el segundo nombre";
			}
			if (!a1.isEmpty()) {
				arraypersonas.get(pos).setApellido1(a1);
				mensaje = "Se han hecho los cambios en el primer apellido";
			}
			if (!a2.isEmpty()) {
				arraypersonas.get(pos).setApellido2(a2);
				mensaje = "Se han hecho los cambios en el segundo apellido";
			}
		}
		return mensaje;
	}

	@Override
	public String eliminarPersona(int pos) {
		try {

			String mensaje = "";
			arraypersonas.remove(pos);
			archivo.getArchivo().delete();
			archivo.getArchivo().createNewFile();
			archivo.escribirEnArchivo(arraypersonas);
			mensaje = "Se ha eliminado la persona";
			return mensaje;
		} catch (Exception e) {
			String mensaje = "No se ha eliminado";
			return mensaje;
		}
	}
}
