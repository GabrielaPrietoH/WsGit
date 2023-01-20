package git.main;

import git.entidad.Persona;

public class Main {

	public static void main(String[] args) {
		System.out.println("Bienvenidos a nuestras versiones con GIT");
        System.out.println("cambio");
		
		Persona p = new Persona();
		p.setNombre("Margarita");
		p.setEdad(52);
		
		System.out.println(p);
		
	}

}
