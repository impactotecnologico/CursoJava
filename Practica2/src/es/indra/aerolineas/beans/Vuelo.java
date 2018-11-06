/**
 * 
 */
package es.indra.aerolineas.beans;

/**
 * @author josejarizav
 *
 *
 */
public class Vuelo {

	private int id;
	private String numeroVuelo;
	private String origen;
	private String destino;
	private int numeroPasajeros;
	private boolean disponible;
	
	public Vuelo() {
		
		
	}
	
	public Vuelo(int id) {
		this.id =id;
	}

	public Vuelo(int id, String numeroVuelo, String origen, String destino, int numeroPasajeros, boolean disponible) {
		super();
		this.id = id;
		this.numeroVuelo = numeroVuelo;
		this.origen = origen;
		this.destino = destino;
		this.numeroPasajeros = numeroPasajeros;
		this.disponible = disponible;
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
	 * @return the numeroVuelo
	 */
	public String getNumeroVuelo() {
		return numeroVuelo;
	}

	/**
	 * @param numeroVuelo the numeroVuelo to set
	 */
	public void setNumeroVuelo(String numeroVuelo) {
		this.numeroVuelo = numeroVuelo;
	}

	/**
	 * @return the origen
	 */
	public String getOrigen() {
		return origen;
	}

	/**
	 * @param origen the origen to set
	 */
	public void setOrigen(String origen) {
		this.origen = origen;
	}

	/**
	 * @return the destino
	 */
	public String getDestino() {
		return destino;
	}

	/**
	 * @param destino the destino to set
	 */
	public void setDestino(String destino) {
		this.destino = destino;
	}

	/**
	 * @return the numeroPasajeros
	 */
	public int getNumeroPasajeros() {
		return numeroPasajeros;
	}

	/**
	 * @param numeroPasajeros the numeroPasajeros to set
	 */
	public void setNumeroPasajeros(int numeroPasajeros) {
		this.numeroPasajeros = numeroPasajeros;
	}

	/**
	 * @return the disponible
	 */
	public boolean isDisponible() {
		return disponible;
	}

	/**
	 * @param disponible the disponible to set
	 */
	public void setDisponible(boolean disponible) {
		this.disponible = disponible;
	}

}
