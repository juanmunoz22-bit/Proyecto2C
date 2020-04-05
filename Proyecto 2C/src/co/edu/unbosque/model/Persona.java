package co.edu.unbosque.model;

import java.io.Serializable;

/**
 * Clase que define a una persona
 * 
 * @author Grupo Votacion
 */
public class Persona implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1709433305121355488L;
	private String numero_cedula;
	private String fecha_exp;
	private String lugar_exp;
	private String nombre1;
	private String nombre2;
	private String apellido1;
	private String apellido2;
	private String fecha_nac;
	private String lugar_nac;
	private String sexo;
	private Puesto puesto;
	private int edad;

	

	public Persona(String numero_cedula, String fecha_exp, String lugar_exp, String nombre1, String nombre2,
			String apellido1, String apellido2, String fecha_nac, String lugar_nac, String sexo) {
		this.numero_cedula = numero_cedula;
		this.lugar_exp = lugar_exp;
		this.lugar_nac = lugar_nac;
		this.nombre1 = nombre1;
		this.nombre2 = nombre2;
		this.apellido1 = apellido1;
		this.apellido2 = apellido2;
		this.sexo = sexo;
	}

	public String getNumero_cedula() {
		return numero_cedula;
	}

	public void setNumero_cedula(String numero_cedula) {
		this.numero_cedula = numero_cedula;
	}

	public String getFecha_exp() {
		return fecha_exp;
	}

	public void setFecha_exp(String fecha_exp) {
		this.fecha_exp = fecha_exp;
	}

	public String getLugar_exp() {
		return lugar_exp;
	}

	public void setLugar_exp(String lugar_exp) {
		this.lugar_exp = lugar_exp;
	}

	public String getNombre1() {
		return nombre1;
	}

	public void setNombre1(String nombre1) {
		this.nombre1 = nombre1;
	}

	public String getNombre2() {
		return nombre2;
	}

	public void setNombre2(String nombre2) {
		this.nombre2 = nombre2;
	}

	public String getApellido1() {
		return apellido1;
	}

	public void setApellido1(String apellido1) {
		this.apellido1 = apellido1;
	}

	public String getApellido2() {
		return apellido2;
	}

	public void setApellido2(String apellido2) {
		this.apellido2 = apellido2;
	}

	public String getFecha_nac() {
		return fecha_nac;
	}

	public void setFecha_nac(String fecha_nac) {
		this.fecha_nac = fecha_nac;
	}

	public String getLugar_nac() {
		return lugar_nac;
	}

	public void setLugar_nac(String lugar_nac) {
		this.lugar_nac = lugar_nac;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public Puesto getPuesto() {
		return puesto;
	}

	public void setPuesto(Puesto puesto) {
		this.puesto = puesto;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}
}
