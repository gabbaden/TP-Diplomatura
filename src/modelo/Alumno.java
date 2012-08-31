package modelo;

public abstract class Alumno {

	private String nombre;
	private String apellido;
	private String email;
	private int nota;
	private String curso;
	private String estado;
	private int valorcuota;
	
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getNota() {
		return nota;
	}
	public void setNota(int nota) {
		this.nota = nota;
	}
	public String getCurso() {
		return curso;
	}
	public void setCurso(String curso) {
		this.curso = curso;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public int getValorcuota() {
		return valorcuota;
	}
	public void setValorcuota(int valorcuota) {
		this.valorcuota = valorcuota;
	}
	
}
