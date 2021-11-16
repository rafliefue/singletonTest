package singletonProject;

public class Persona {

	private static Persona single_instance = null;
	
	private String nombre;
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Persona() {
		nombre = "Pepe";
	}
	
	public static Persona getInstance() {
		if (single_instance == null){
			single_instance = new Persona();
		}
			return single_instance;
		
	}
	
	
}
