package es.indra.aerolineas.beans;

public interface IAerolinea {

	void consultarVuelos(String origen);

	void consultarVuelos(String origen, String destino);

	void anularVuelos(String... vuelos);

}