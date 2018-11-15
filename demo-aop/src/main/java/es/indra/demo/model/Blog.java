package es.indra.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Blog {
	
	@Id
	@GeneratedValue
	private long id;
	
	private String titulo;
	
	private String contenido;

	public Blog(long id, String titulo, String contenido) {
		super();
		this.id = id;
		this.titulo = titulo;
		this.contenido = contenido;
	}
	
	public Blog() {
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
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
