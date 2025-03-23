package gestionEquipoFutbol;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Equipo {
    private String nombre;
    private ArrayList<Futbolista> jugadores;
    private int contadorPor = 0;
    private int contadorDef = 0;
    private int contadorCen = 0;
    private int contadorDel = 0;

    public Equipo(String nombre) {
        this.nombre = nombre;
        this.jugadores = new ArrayList<>();
    }

    public void anadirJugador(Futbolista fut) throws RegistroFutbolistaException {
        String posi = fut.getPosicion().getPosicion();

        switch (posi) {
            case "Portero":
                if (contadorPor < 2) {
                    jugadores.add(fut);
                    contadorPor++;
                } else {
                    throw new RegistroFutbolistaException("Huecos llenos para Porteros");
                }
                break;
            case "Defensa":
                if (contadorDef < 5) {
                    jugadores.add(fut);
                    contadorDef++;
                } else {
                    throw new RegistroFutbolistaException("Huecos llenos para Defensas");
                }
                break;
            case "Centrocampista":
                if (contadorCen < 5) {
                    jugadores.add(fut);
                    contadorCen++;
                } else {
                    throw new RegistroFutbolistaException("Huecos llenos para Centrocampistas");
                }
                break;
            case "Delantero":
                if (contadorDel < 4) {
                    jugadores.add(fut);
                    contadorDel++;
                } else {
                    throw new RegistroFutbolistaException("Huecos llenos para Delanteros");
                }
                break;
        }
    }

    public void listarFormaciónDelEquipo() {
        Collections.sort(jugadores);
        Iterator<Futbolista> iter = jugadores.iterator();
        while (iter.hasNext()) {
            System.out.println(iter.next());
        }
    }

    public String getNombre() {
        return nombre;
    }
}
