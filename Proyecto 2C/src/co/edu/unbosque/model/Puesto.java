package co.edu.unbosque.model;
/**
 * Clase que define un puesto de votacion utilizando metodos de la interfaz PuestoVotacion
 * @author Grupo Votacion
 */
public class Puesto {

	private String municipio;
	
	private String departamento;
	
	public String getMunicipio() {
		return municipio;
	}

	public void setMunicipio(String municipio) {
		this.municipio = municipio;
	}

	public String getDepartamento() {
		return departamento;
	}

	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}
	
}
