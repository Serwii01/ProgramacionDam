package eventoDeportivo;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        try {
            Carrera carrera = new Carrera("Copa Piston", LocalDate.of(2025, 6, 21), "Salesianas nerv", 7000);
            Participante p1 = new Participante("Ivan", "Pastor", 18);
            Participante p2 = new Participante("Sergio", "Fernandez", 29);
            Participante p3 = new Participante("Jaime", "Aljama", 30);

            carrera.inscribirParticipante(p1);
            carrera.inscribirParticipante(p2);
            
            System.out.println("Evento: " + carrera.getNombre());
            System.out.println("Ganador: " + carrera.obtenerGanador());

            TorneoDeFutbol torneo = new TorneoDeFutbol("Peloteo", LocalDate.of(2025, 3, 13), "Atos");
            Equipo equipo1 = new Equipo("Medalleo");
            Equipo equipo2 = new Equipo("Peloteo");
            
            equipo1.setPuntos(22);
            equipo2.setPuntos(28);
            
            torneo.inscribirEquipo(equipo1);
            torneo.inscribirEquipo(equipo2);
            
            Participante p4 = new Participante("Sambi", "Lokonga", 25);
            equipo1.añadirJugador(p3);

            System.out.println("\nTorneo: " + torneo.getNombre());
            System.out.println("Ganador: " + torneo.obtenerGanador());

            // Eliminar un jugador existente en lugar de uno inexistente
            equipo1.eliminarJugador("Jaime", "Aljama");
            System.out.println("Jugador eliminado correctamente.");

        } catch (ParticipanteNoValidoException | JugadorNoEncontradoException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
