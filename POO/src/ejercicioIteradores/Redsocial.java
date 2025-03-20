package ejercicioIteradores;

import java.util.ArrayList;
import java.util.Iterator;

public class Redsocial {
	ArrayList<Usuario> listaAmigos = new ArrayList<>();

    public void addAmigo(Usuario amigo) {
        listaAmigos.add(amigo);
    }

    public void mostrarAmigos() {
        for (Usuario amigo : listaAmigos) {
            System.out.println(amigo.nombre+ ", "+amigo.edad);
        }
    }

    public void eliminarAmigosMenores(int edadMinima) {
        Iterator<Usuario> iterator = listaAmigos.iterator();
        while (iterator.hasNext()) {
            Usuario amigo = iterator.next();
            if (amigo.edad < edadMinima) {
                iterator.remove();
            }
        }
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
