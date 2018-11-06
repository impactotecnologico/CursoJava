/**
 * 
 */
package es.indra.aerolineas;

/**
 * @author josejarizav
 *
 *
 */
public class Vuelo {

	int id;
	String numeroVuelo;
	String origen;
	String destino;
	int numeroPasajeros;
	boolean disponible;
	
	public Vuelo() {}

	public Vuelo(int id, String numeroVuelo, String origen, String destino, int numeroPasajeros, boolean disponible) {
		super();
		this.id = id;
		this.numeroVuelo = numeroVuelo;
		this.origen = origen;
		this.destino = destino;
		this.numeroPasajeros = numeroPasajeros;
		this.disponible = disponible;
	}

}
