package apis;

import java.util.ArrayList;
import java.util.Iterator;

public class ej2 {

    public static void main(String[] args) {
        ArrayList<Integer> lista = new ArrayList<>();

        // Llenar la lista con números del 1 al 9
        for (int i = 1; i < 10; i++) {
            lista.add(i);
        }

        // Crear un Iterator para la lista
        Iterator<Integer> it = lista.iterator();

        // Iterar sobre la lista y eliminar los números impares
        while (it.hasNext()) {
            Integer numero = it.next();
            if (numero % 2 != 0) {
                it.remove(); // Eliminar el número impar
            }
        }
        // Imprimir la lista resultante
        for (Integer numero : lista) {
            System.out.print(numero + " ");
        }
    }
}