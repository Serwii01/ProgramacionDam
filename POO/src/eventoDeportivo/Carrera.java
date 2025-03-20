package eventoDeportivo;

import java.time.LocalDate;
import java.util.ArrayList;

class Carrera extends EventoDeportivo {
    private double distancia;
    private ArrayList<Double> tiempos; // tiempo en segundos

    public Carrera(String nombre, LocalDate fecha, String lugar, double distancia) {
        super(nombre, fecha, lugar);
        this.distancia = distancia;
        this.tiempos = new ArrayList<>();
    }
    public String getNombre() {
    	return nombre;
    }
    public void registrarTiempo(Participante participante, double tiempo) {
        participantes.add(participante);
        tiempos.add(tiempo);
    }

    @Override
    public Participante obtenerGanador() {
        int indiceGanador = tiempos.indexOf(tiempos.stream().min(Double::compare).orElse(Double.MAX_VALUE));
        return participantes.get(indiceGanador);
    }
}
