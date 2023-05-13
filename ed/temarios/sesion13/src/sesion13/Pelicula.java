package sesion13;

public class Pelicula implements Valorar, Valorar2{
	private String titulo;

	
	//generamos un constructor vacio
	public Pelicula() {
		super();
	}
	/*----------------------------------------------------------------------*/
	//generamos un constructor con el método `Pelicula`y sus atributos
	public Pelicula(String titulo) {
		super();
		this.titulo = titulo;
	}
	
	/*----------------------------------------------------------------------*/
	//generamos los getters & setters
	
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	
	/*----------------------------------------------------------------------*/
	//generamos el toString
	@Override
	public String toString() {
		return "Pelicula [titulo=" + titulo + "]";
	}
	/*----------------------------------------------------------------------*/
	//generamos el toString de los métodos abstractos source > override /implements Methods
	@Override
	public void ponerNota(int numero) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void ponerComentario(String texto) {
		// TODO Auto-generated method stub
		
	}
	//aqui implementamos los metodos abtractos creados previamente en la clase `Valorar2`
	@Override
	public void enlazar() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void guardar() {
		// TODO Auto-generated method stub
		
	}
}
