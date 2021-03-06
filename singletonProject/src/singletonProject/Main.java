package singletonProject;

import singletonProject.builder.PersonaB;
import singletonProject.singleton.Persona;

public class Main {
	
	public static void main(String args[]) {

        Persona a = Persona.getInstance("pedro");

        Persona b = Persona.getInstance("jose");
 
        Persona c = Persona.getInstance("pepe");
 
        
        System.out.println("Nombre de a: " + a.getNombre());
        System.out.println("Nombre de b: " + b.getNombre());
        System.out.println("Nombre de c: " + c.getNombre());
 
        //----------------------
        
        PersonaB persona = new PersonaB.PersonaBuilder("Jose").build();
        
        System.out.println(persona.getNombre());

    }
}
