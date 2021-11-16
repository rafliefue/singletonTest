package singletonProject.builder;

public class PersonaB {

	private String nombre;
	
	public PersonaB(PersonaBuilder a) {
		this.nombre = a.nombre;
	}

	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public PersonaB(String nombre) {
		this.nombre = nombre;
	}
	
	//Builder
	
	public static class PersonaBuilder{
		
		private String nombre;
		
		public PersonaBuilder(String nombre) {
			this.nombre = nombre;
		}
		
		public PersonaB build() {
			return new PersonaB(this);
		}
	}
	
	
}
