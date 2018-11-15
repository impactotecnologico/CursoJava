package net.impactotecnologico.mvc.demo.model;

public class Blog {
	int id;

	String titulo;

	String contenido;

	public Blog(int id) {
		this.id = id;
	}

	public Blog() {
	}

	public Blog(int id, String titulo, String contenido) {
		super();
		this.id = id;
		this.titulo = titulo;
		this.contenido = contenido;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getContenido() {
		return contenido;
	}

	public void setContenido(String contenido) {
		this.contenido = contenido;
	}

}
