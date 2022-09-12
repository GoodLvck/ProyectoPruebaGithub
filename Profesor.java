
public class Profesor {

	// ATRIBUTOS
	private String nombre;
	private int vida;
	private int daño;
	
	
	
	// CONSTRUCTORES
	public Profesor() {
		this.nombre = null;
		this.vida = 0;
		this.daño = 0;
	}
	
	public Profesor(String n, int v, int d) {
		this.nombre = n;
		this.vida = v;
		this.daño = d;
	}
	
}
