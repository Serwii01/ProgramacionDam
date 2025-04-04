package clases;

import java.time.LocalDate;
//clase abstracta que implementa la interfaz asignable
public abstract class Trabajo implements Asignable{
	protected int id;
	protected String descripcion;
	protected Empleado responsable;
	protected LocalDate fechaLimite;
	//contructor
	public Trabajo(int id, String descripcion, Empleado responsable, LocalDate fechaLimite) {
		this.id = id;
		this.descripcion = descripcion;
		this.responsable = responsable;
		this.fechaLimite = fechaLimite;
	}
	//getter y setter
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	//metodos sobreescritos de la interfaz
	@Override
	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	@Override
	public Empleado getResponsable() {
		return responsable;
	}

	public void setResponsable(Empleado responsable) {
		this.responsable = responsable;
	}

	public LocalDate getFechaLimite() {
		return fechaLimite;
	}

	public void setFechaLimite(LocalDate fechaLimite) {
		this.fechaLimite = fechaLimite;
	}

	@Override
	public String toString() {
		return "Trabajo [id=" + id + ", descripcion=" + descripcion + ", responsable=" + responsable + ", fechaLimite="
				+ fechaLimite + "]";
	}

}
