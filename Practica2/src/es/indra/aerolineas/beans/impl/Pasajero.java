/**
 * 
 */
package es.indra.aerolineas.beans.impl;

import java.util.List;

/**
 * @author josejarizav
 *
 *
 */
public class Pasajero extends Persona {
	
	private List<Vuelo> vuelos;

	/**
	 * @return the apellido
	 */
	public String getApellido() {
		return apellido.toUpperCase();
	}

	/**
	 * @param apellido the apellido to set
	 */
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	/**
	 * @return the dni
	 */
	public String getDni() {
		return dni;
	}

	/**
	 * @param dni the dni to set
	 */
	public void setDni(String dni) {
		this.dni = dni;
	}

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * @return the vuelos
	 */
	public List<Vuelo> getVuelos() {
		return vuelos;
	}

	/**
	 * @param vuelos the vuelos to set
	 */
	public void setVuelos(List<Vuelo> vuelos) {
		this.vuelos = vuelos;
	}

	@Override
	public String solicitarInformacion() {
		return "";
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Pasajero [nombre=" + nombre + ", apellido=" + apellido + ", dni=" + dni + "]";
	}
	
	

}
