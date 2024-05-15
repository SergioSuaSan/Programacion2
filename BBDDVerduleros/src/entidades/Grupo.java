package entidades;

public class Grupo {
	private long idGrupo;
	private String nombre;
	
	public Grupo(long l, String nombre) {
		super();
		this.idGrupo = l;
		this.nombre = nombre;
	}

	public long getIdGrupo() {
		return idGrupo;
	}

	public void setIdGrupo(int idGrupo) {
		this.idGrupo = idGrupo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public String toString() {
		return "Grupo [idGrupo=" + idGrupo + ", nombre=" + nombre + "]";
	}
	
	
	

}
