package net.impactotecnologico.demohibernate.pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "categoria")
public class Categoria implements java.io.Serializable {

	@Id
	// @GeneratedValue
	@Column(name = "id", unique = true, nullable = false)
	private Integer id;

	@Column(name = "categoria")
	private String nombre;

	public Integer getId() {
		return this.id;
	}

	public Categoria() {
	}

	public Categoria(String nombre) {
		this.nombre = nombre;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@Column(name = "nombre", length = 50)
	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String name) {
		this.nombre = name;
	}

}
