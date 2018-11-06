/**
 * 
 */
package es.indra.aerolineas;

/**
 * @author josejarizav
 *
 *
 */
public class Aerolinea {
	
	int id;
	String nombre;
	Vuelo[] vuelos = new Vuelo[10];
	
	public Aerolinea() {		
	}

	/**
	 * @param id
	 * @param nombre
	 * @param vuelos
	 */
	public Aerolinea(int id, String nombre, Vuelo[] vuelos) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.vuelos = vuelos;
	}

	
	
	

}
