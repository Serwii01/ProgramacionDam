package eventoDeportivo;

import java.time.LocalDate;
import java.util.ArrayList;

abstract class EventoDeportivo implements Ganador {
    protected String nombre;
    protected LocalDate fecha;
    protected String lugar;
    protected ArrayList<Participante> participantes;

    public EventoDeportivo(String nombre, LocalDate fecha, String lugar) {
        this.nombre = nombre;
        this.fecha = fecha;
        this.lugar = lugar;
        this.participantes = new ArrayList<>();
    }

    public void inscribirParticipante(Participante participante) {
        participantes.add(participante);
    }

    public abstract Participante obtenerGanador();
}
