package clases;

import java.time.LocalDate;

public class Reunion extends Trabajo {
	private String ubicacion;
	//constructor con super porque hereda de trabajo
	public Reunion(int id, String descripcion, Empleado responsable, LocalDate fechaLimite, String ubicacion) {
		super(id, descripcion, responsable, fechaLimite);
		this.ubicacion=ubicacion;
	}

	public String getUbicacion() {
		return ubicacion;
	}

	public void setUbicacion(String ubicacion) {
		this.ubicacion = ubicacion;
	}
	
	//toString
	@Override
	public String toString() {
		return "Reunion [id=" + id +  "descripcion=" + descripcion + ", responsable=" + responsable + ", fechaLimite="
				+ fechaLimite +"ubicacion=" + ubicacion + "]";
	}
		
}
