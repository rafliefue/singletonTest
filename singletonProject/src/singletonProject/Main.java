package singletonProject;

public class Main {
	
	public static void main(String args[]) {

        Persona a = Persona.getInstance();

        Persona b = Persona.getInstance();
 
        Persona c = Persona.getInstance();
 
        
        System.out.println("Nombre de a: " + a.getNombre());
        System.out.println("Nombre de b: " + b.getNombre());
        System.out.println("Nombre de c: " + c.getNombre());
 
  

    }
}
