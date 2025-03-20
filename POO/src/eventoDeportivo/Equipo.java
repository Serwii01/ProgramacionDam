package eventoDeportivo;

import java.util.ArrayList;

class Equipo {
    private String nombre;
    private ArrayList<Participante> jugadores;
    private int puntos;

    public Equipo(String nombre) {
        this.nombre = nombre;
        this.jugadores = new ArrayList<>();
        this.puntos = 0;
    }

    public void añadirJugador(Participante jugador) {
        jugadores.add(jugador);
    }

    public void eliminarJugador(String nombre, String apellido) throws JugadorNoEncontradoException {
        for (int i = 0; i < jugadores.size(); i++) {
            Participante jugador = jugadores.get(i);
            if (jugador.getNombre().equals(nombre) && jugador.getApellido().equals(apellido)) {
                jugadores.remove(i);
                return; 
            }
        }
        throw new JugadorNoEncontradoException("Jugador no encontrado en el equipo.");
    }

    public void setPuntos(int puntos) {
        this.puntos += puntos;
    }

    public int getPuntos() { return puntos; }
    public String getNombre() { return nombre; }

    @Override
    public String toString() {
        return "Equipo: " + nombre + " - Puntos: " + puntos;
    }
}
