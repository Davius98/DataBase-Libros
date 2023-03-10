package uptc1;

import uptmodelo.*;

public class App {

	public static void main(String[] args) {
		Genero g1 = new Genero();
		Genero g2 = new Genero();
		Genero g3 = new Genero();

		Autores a1 = new Autores();
		Autores a2 = new Autores();

		Editoriales e1 = new Editoriales();
		Editoriales e2 = new Editoriales();

		Libro l1 = new Libro(1, 2);
		Libro l2 = new Libro(2, 1);

		g1.setIdGenero(1);
		g1.setNombre("Drama");
		g1.setDescripcion("El genero drama es--");

		g2.setIdGenero(2);
		g2.setNombre("Suspenso");
		g2.setDescripcion("El genero suspenso es--");

		g3.setIdGenero(3);
		g3.setNombre("Accion");
		g3.setDescripcion("El genero accion es--");

		a1.setNombre("Gabriel");
		a1.setApellido("Garcia Marquez");
		a1.setIdAutor(12);
		a1.setPais("Colombia");

		a2.setNombre("Paulo");
		a2.setApellido("Coelho");
		a2.setIdAutor(3);
		a2.setPais("Brasil");

		e1.setNombre("Cartel De Cali");
		e2.setNombre("Los Sapos");

		l1.setId(1);
		l1.setTitulo("Cien años de soledad");
		l1.setAnio(1967);
		l1.setEdicion(2002);
		l1.agregarGenero(g1, 0);
		l1.agregarAutores(a1, 0);
		l1.agregarAutores(a2, 1);

		l2.setId(1);
		l2.setTitulo("El Perfume");
		l2.setAnio(1967);
		l2.setEdicion(2002);
		l2.agregarGenero(g2, 0);
		l2.agregarGenero(g3, 1);
		l2.agregarAutores(a2, 0);
		
		// IMPRIMIR LIBRO 1

		System.out.println("\nPrimer Libro"+"\nTitulo: " + l1.getTitulo() + "\nId: " + l1.getId() + "\nAño: " + l1.getAnio()
				+ "\nEdicion: " + l1.getEdicion() + "\nEditorial: " + e1.getNombre());

		for (Genero i : l1.getGenero()) {
			System.out.println("Genero: " + i.getNombre());
		}
		for (Autores i : l1.getAutores()) {
			System.out.println("Autor: " + i.getNombre() + " " + i.getApellido());
		}

		// IMPRIMIR LIBRO 2

		System.out.println("\nSegundo Libro"+"\nTitulo: " + l2.getTitulo() + "\nId: " + l2.getId() + "\nAño: " + l2.getAnio()
				+ "\nEdicion: " + l2.getEdicion() + "\nEditorial: " + e1.getNombre());

		for (Genero i : l2.getGenero()) {
			System.out.println("Genero: " + i.getNombre());
		}
		for (Autores i : l2.getAutores()) {
			System.out.println("Autor: " + i.getNombre() + " " + i.getApellido());
		}

	}

}
