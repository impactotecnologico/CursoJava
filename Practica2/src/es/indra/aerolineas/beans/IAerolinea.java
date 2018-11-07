package es.indra.aerolineas.beans;

import es.indra.aerolineas.beans.impl.Vuelo;

public interface IAerolinea {

	void consultarVuelos(String origen);

	void consultarVuelos(String origen, String destino);

	void anularVuelos(String... vuelos);

	Vuelo[] getVuelos();

	String getNombre();

}