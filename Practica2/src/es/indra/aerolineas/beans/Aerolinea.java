/**
 * 
 */
package es.indra.aerolineas.beans;

/**
 * @author josejarizav
 *
 *
 */
public class Aerolinea {
	
	private int id;
	private String nombre;
	private Vuelo[] vuelos = new Vuelo[10];
	
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
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
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

	public void consultarVuelos(String origen) {
		System.out.println("Metodo de 1 parametro: ".concat(origen));
	}
	
	public void consultarVuelos(String origen, String destino) {
		System.out.printf("Metodo de 2 parametros: %s y %s %n", origen, destino);
	}
	
	public void anularVuelos(String... vuelos ) {
		System.out.println("Numero de vuelos a anular: " + vuelos.length);
	}
	
	


}
