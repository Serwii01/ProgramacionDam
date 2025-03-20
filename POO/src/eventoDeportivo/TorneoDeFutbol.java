package eventoDeportivo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;

class TorneoDeFutbol extends EventoDeportivo {
    private ArrayList<Equipo> equipos;

    public TorneoDeFutbol(String nombre, LocalDate fecha, String lugar) {
        super(nombre, fecha, lugar);
        this.equipos = new ArrayList<>();
    }

    public void inscribirEquipo(Equipo equipo) {
        equipos.add(equipo);
    }
    public String getNombre() {
    	return nombre;
    }
    @Override
    public Participante obtenerGanador() {
        Equipo equipoGanador = equipos.stream().max(Comparator.comparingInt(Equipo::getPuntos)).orElse(null);
        if (equipoGanador != null) {
            try {
                return new Participante(equipoGanador.getNombre(), "Equipo", 14); // Edad mínima válida
            } catch (ParticipanteNoValidoException e) {
                System.out.println("Error al crear el ganador: " + e.getMessage());
            }
        }
        return null;
    }
}

