package empresa;

public class Staff extends Persona {

	//Atributos
	protected float sueldo;

	public Staff(String dni, String nombre, long telefono, float sueldo) {
		super(dni, nombre, telefono);
		this.sueldo = sueldo;
	}

	public float getSueldo() {
		return sueldo;
	}

	public void setSueldo(float sueldo) {
		this.sueldo = sueldo;
	}

	@Override
	public String toString() {
		return "Staff [sueldo=" + sueldo + ", dni=" + dni + ", nombre=" + nombre + ", telefono=" + telefono + "]";
	}
	
	
	
}
