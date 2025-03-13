package eventoDeportivo;

import java.time.LocalDate;

public class Main {
	public static void main(String[] args) {
        try {
            Participante p1 = new Participante("Ivan", "Pastor", 20);
            Participante p2 = new Participante("Sergio", "Fernández", 25);
            Participante p3 = new Participante("Jaime", "Aljama", 30);

            Carrera carrera = new Carrera("Copa Piston", LocalDate.of(2025, 6, 10), "Ciudad", 42.195);
            carrera.registrarTiempo(p1, 7200);
            carrera.registrarTiempo(p2, 7100);
            carrera.registrarTiempo(p3, 7300);
            System.out.println("Carrera "+carrera.nombre);
            System.out.println("Ganador de la carrera: " + carrera.obtenerGanador());

            TorneoDeFutbol torneo = new TorneoDeFutbol("Conference betis", LocalDate.of(2025, 7, 15), "Estadio Central");
            Equipo equipo1 = new Equipo("Pelotas");
            Equipo equipo2 = new Equipo("Medallas 1dam");

            equipo1.añadirJugador(p1);
            equipo2.añadirJugador(p2);

            equipo1.agregarPuntos(10);
            equipo2.agregarPuntos(8);

            torneo.inscribirEquipo(equipo1);
            torneo.inscribirEquipo(equipo2);
            System.out.println("Torneo "+torneo.nombre);
            System.out.println("Ganador del torneo: " + torneo.obtenerGanador());
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
