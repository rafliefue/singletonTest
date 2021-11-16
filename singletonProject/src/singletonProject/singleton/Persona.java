package singletonProject.singleton;

public class Persona {

	private static Persona single_instance;
	
	private String nombre;
	
	public String getNombre() {
		return nombre;
	}

	public Persona(String nombre) {
		this.nombre = nombre;
	}
	
	public static Persona getInstance(String nombre) {
		if (single_instance == null){
			single_instance = new Persona(nombre);
		}
			return single_instance;
		
	}
	
	
}
