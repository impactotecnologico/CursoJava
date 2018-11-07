package es.indra.aerolineas.beans;

import java.io.IOException;

import es.indra.aerolineas.beans.impl.Vuelo;

public interface IAerolinea {

	void consultarVuelos(String origen) throws IOException;

	void consultarVuelos(String origen, String destino);

	void anularVuelos(String... vuelos);

	Vuelo[] getVuelos();

	String getNombre();

}