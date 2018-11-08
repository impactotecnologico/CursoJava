/**
 * 
 */
package es.indra.aerolineas.beans.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import es.indra.aerolineas.beans.IAerolinea;
import es.indra.aerolineas.exceptions.ErrorLecturaDeVuelosException;
import es.indra.aerolineas.services.ReadFile;

/**
 * @author josejarizav
 *
 *
 */
public class Aerolinea implements IAerolinea {
	
	private int id;
	private String nombre;
	private List<Vuelo> vuelos = new ArrayList<>();
	private Map<String, List<Billete>> billetes;
	
	
	
	public Aerolinea() {	
		
	}

	/**
	 * @param id
	 * @param nombre
	 * @param vuelos
	 */
	public Aerolinea(int id, String nombre, List<Vuelo> vuelos) {
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
	@Override
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
	@Override
	public List<Vuelo> getVuelos() {
		return vuelos;
	}

	/**
	 * @param vuelos the vuelos to set
	 */
	public void setVuelos(List<Vuelo> vuelos) {
		this.vuelos = vuelos;
	}

	/**
	 * @return the billetes
	 */
	public Map<String, List<Billete>> getBilletes() {
		return billetes;
	}

	/**
	 * @param billetes the billetes to set
	 */
	public void setBilletes(Map<String, List<Billete>> billetes) {
		this.billetes = billetes;
	}

	/* (non-Javadoc)
	 * @see es.indra.aerolineas.beans.IAerolinea#consultarVuelos(java.lang.String)
	 */
	@Override
	public void consultarVuelos(String origen) {
		ReadFile read = new ReadFile();
		List<String> vuelosEncontrados = new ArrayList<String>();
		try {
			vuelosEncontrados = read.retornarVuelos();
			if (vuelosEncontrados != null && !vuelosEncontrados.isEmpty()) {
				for (String vuelo : vuelosEncontrados) {
					System.out.println(vuelo);
				}
			} else {
				System.out.println("No se encontraron vuelos");
			}
		} catch (ErrorLecturaDeVuelosException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/* (non-Javadoc)
	 * @see es.indra.aerolineas.beans.IAerolinea#consultarVuelos(java.lang.String, java.lang.String)
	 */
	@Override
	public void consultarVuelos(String origen, String destino) {
		System.out.printf("Metodo de 2 parametros: %s y %s %n", origen, destino);
	}
	
	/* (non-Javadoc)
	 * @see es.indra.aerolineas.beans.IAerolinea#anularVuelos(java.lang.String)
	 */
	@Override
	public void anularVuelos(String... vuelos ) {
		System.out.println("Numero de vuelos a anular: " + vuelos.length);
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Aerolinea [nombre=" + nombre + "]";
	}

	@Override
	public void verBilletesPorFecha(String fechaBillete) {
		
		List<Billete> billetePorDia = this.billetes.get(fechaBillete);
		for (Billete b : billetePorDia) {
			System.out.println("\t" + b);
		}
		
		
		/*
		
		// RECORRIDO COMPLETO
		for (Map.Entry<String, List<Billete>> billete : this.billetes.entrySet()) {
			System.out.println("Billetes para el día ".concat(billete.getKey()));
			for (Billete b : billete.getValue()) {
				System.out.println("\t" + b);
			}
			System.out.println("________________________________________________________________________________________");
			
		}

		*/
	}
	


}
