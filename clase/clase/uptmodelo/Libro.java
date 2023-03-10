package uptmodelo;

public class Libro {
	private String titulo;
	private int id;
	private int anio;
	private int edicion;
	private Genero genero[];
	private Autores autores[];
	private Editoriales editorial;

	public Libro(int numeroGeneros, int numeroAutores) {
		this.genero = new Genero[numeroGeneros];
		this.autores = new Autores[numeroAutores];
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getAnio() {
		return anio;
	}

	public void setAnio(int anio) {
		this.anio = anio;
	}

	public int getEdicion() {
		return edicion;
	}

	public void setEdicion(int edicion) {
		this.edicion = edicion;
	}

	public Genero[] getGenero() {
		return genero;
	}

	public void setGenero(Genero[] genero) {
		this.genero = genero;
	}

	public void setAutores(Autores[] autores) {
		this.autores = autores;
	}

	public Autores[] getAutores() {
		return autores;
	}

	public void setEditorial(Editoriales editorial) {
		this.editorial = editorial;
	}

	public Editoriales getEditorial() {
		return editorial;
	}

	public void agregarGenero(Genero genero, int posicion) {
		this.genero[posicion] = genero;
	}

	public void agregarAutores(Autores autores, int posicion) {
		this.autores[posicion] = autores;
	}
}
