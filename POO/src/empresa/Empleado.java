package empresa;

public class Empleado extends Staff{

	//Atributos
	//No hay
	
	
	
	
	//Métodos
		
	public Empleado(String dni, String nombre, long telefono, float sueldo) {
		super(dni, nombre, telefono, sueldo);
	}

	@Override
	public String toString() {
		return "Empleado [sueldo=" + sueldo + ", dni=" + dni + ", nombre=" + nombre + ", telefono=" + telefono + "]";
	}
	
	
	
}
