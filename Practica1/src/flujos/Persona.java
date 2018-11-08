package flujos;

public class Persona {

	protected String nombre;
	protected String apellido;
	protected String dni;
	protected int id;

	public Persona() {
		super();
	}
		
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

	/**
	 * @param nombre
	 * @param apellido
	 * @param dni
	 * @param id
	 */
	public Persona(String nombre, String apellido, String dni, int id) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.dni = dni;
		this.id = id;
	}

	/**
	 * @return the apellido
	 */
	public String getApellido() {
		return apellido;
	}

	/**
	 * @param apellido the apellido to set
	 */
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	/**
	 * @return the dni
	 */
	public String getDni() {
		return dni;
	}

	/**
	 * @param dni the dni to set
	 */
	public void setDni(String dni) {
		this.dni = dni;
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
	
	
	
	
}
