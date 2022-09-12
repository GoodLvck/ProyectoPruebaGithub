
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

	// GETTERS Y SETTERS
    public String getNombre() {
        return this.nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    
    public int getVida() {
        return this.vida;
    }
    public void setVida(int vida) {
        this.vida = vida;
    }
    
    
    public int getDaño() {
        return this.daño;
    }
    public void setDaño(int daño) {
        this.daño = daño;
    }
	
}
