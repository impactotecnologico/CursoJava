package es.indra.aerolineas.beans.impl;

public abstract class Persona {

	protected String nombre;
	protected String apellido;
	protected String dni;
	protected int id;

	public Persona() {
		super();
	}
	
	public abstract String solicitarInformacion();
	
	/**
	 * @return the nombre en mayúsculas que lo necesitan los pasajeros
	 */
	public String getNombre() {
		return nombre.toUpperCase();
	}
	
	
	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	
}
