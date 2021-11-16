package singletonProject;

public class Main {
	
	public static void main(String args[]) {

        Persona a = Persona.getInstance("pedro");

        Persona b = Persona.getInstance("jose");
 
        Persona c = Persona.getInstance("pepe");
 
        
        System.out.println("Nombre de a: " + a.getNombre());
        System.out.println("Nombre de b: " + b.getNombre());
        System.out.println("Nombre de c: " + c.getNombre());
 
  

    }
}
