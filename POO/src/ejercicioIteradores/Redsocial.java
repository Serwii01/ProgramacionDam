package ejercicioIteradores;

import java.util.ArrayList;

public class Redsocial {
	ArrayList<Usuario> listaAmigos = new ArrayList<>();

    public void agregarAmigo(Usuario amigo) {
        listaAmigos.add(amigo);
    }

    public void mostrarAmigos() {
        System.out.println("Lista de amigos:");
        for (Usuario amigo : listaAmigos) {
            System.out.println(amigo);
        }
    }

    public void eliminarAmigosMenores(int edadMinima) {
        listaAmigos.removeIf(amigo -> amigo.edad < edadMinima);
        System.out.println("Amigos menores de " + edadMinima + " se han eliminado");
    }

    public void buscarAmigo(String nombre) {
        for (Usuario amigo : listaAmigos) {
            if (amigo.nombre.equalsIgnoreCase(nombre)) {
                System.out.println("Se encontro a: " + amigo);
                return;
            }
        }
        System.out.println("No se encontró a " + nombre);
    }
}
