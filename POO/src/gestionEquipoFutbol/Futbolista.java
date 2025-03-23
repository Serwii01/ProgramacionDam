package gestionEquipoFutbol;

import java.util.Arrays;

public class Futbolista implements Deportista, Comparable<Futbolista> {
    private String nombre;
    private int edad;
    private Posicion posicion;
    private int anyosProfesional;
    private String[] equipos;
    private int trofeos;

    public Futbolista(String nombre, int edad, Posicion posicion, int anyosProfesional, String[] equipos, int trofeos) {
        this.nombre = nombre;
        this.edad = edad;
        this.posicion = posicion;
        this.anyosProfesional = anyosProfesional;
        this.equipos = equipos;
        this.trofeos = trofeos;
    }

    @Override
    public int getAnyosProfesional() {
        return anyosProfesional;
    }

    @Override
    public String getListadoEquipos() {
        return String.join(", ", equipos);
    }

    @Override
    public int getTotalTrofeos() {
        return trofeos;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public Posicion getPosicion() {
        return posicion;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setPosicion(Posicion posicion) {
        this.posicion = posicion;
    }

    @Override
    public String toString() {
        return "Futbolista{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", posicion=" + posicion.getPosicion() +
                ", años profesional=" + anyosProfesional +
                ", equipos=" + Arrays.toString(equipos) +
                ", trofeos=" + trofeos +
                '}';
    }

    @Override
    public int compareTo(Futbolista f1) {
        return this.posicion.ordinal() - f1.posicion.ordinal();
    }
}
