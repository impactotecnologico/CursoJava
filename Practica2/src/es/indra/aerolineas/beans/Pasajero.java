/**
 * 
 */
package es.indra.aerolineas.beans;

/**
 * @author josejarizav
 *
 *
 */
public class Pasajero extends Persona {
	
	Vuelo[] vuelos;

	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre.toLowerCase();
	}


	/**
	 * @return the vuelos
	 */
	public Vuelo[] getVuelos() {
		return vuelos;
	}

	/**
	 * @param vuelos the vuelos to set
	 */
	public void setVuelos(Vuelo[] vuelos) {
		this.vuelos = vuelos;
	}

}
