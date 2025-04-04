package clases;

import java.time.LocalDate;

public class Tarea extends Trabajo  {

	private Prioridad prioridad;
	//constructor con super porque hereda de trabajo
	public Tarea(int id, String descripcion, Empleado responsable, LocalDate fechaLimite, Prioridad prioridad) {
		super(id, descripcion, responsable, fechaLimite);
		//lanza la excepcion cuando detecta que la tarea se programa a mas de 10 dias siendo prioridad alta
		if (prioridad == Prioridad.Alta && fechaLimite.isAfter(LocalDate.now().plusDays(10))) {
			throw new TrabajoInvalidoException("Es prioridad alta, 10 dias maximo");
		}
		//lanza la excepcion cuando detecta que la tarea se programa a mas de 15 dias siendo prioridad media
		if (prioridad == Prioridad.Media && fechaLimite.isAfter(LocalDate.now().plusDays(15))) {
			throw new TrabajoInvalidoException("Es prioridad media, 15 dias maximo");
		}
		//lanza la excepcion cuando detecta que la tarea se programa a mas de 17 dias siendo prioridad baja
		if (prioridad == Prioridad.Baja && fechaLimite.isAfter(LocalDate.now().plusDays(17))) {
			throw new TrabajoInvalidoException("Es prioridad baja, 17 dias maximo");
		}
		
		this.prioridad = prioridad;	
			
	}

	public Prioridad getPrioridad() {
		return prioridad;
	}

	public void setPrioridad(Prioridad prioridad) {
		this.prioridad = prioridad;
	}

	//toString
	@Override
	public String toString() {
		return "Tarea [prioridad=" + prioridad + "]";
	}

	}
	
