package gestionEquipoFutbol;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.println("Bienvenido a la gestión del equipo de fútbol");
        System.out.print("Introduce el nombre del club: ");
        String nombreClub = scn.nextLine();
        
        Equipo equipo = new Equipo(nombreClub);

        int opcion;
        do {
            mostrarMenu();
            System.out.print("Elige una opción: ");
            opcion = scn.nextInt();
            scn.nextLine(); // Limpiar el buffer de entrada
            
            switch (opcion) {
                case 1:
                    agregarJugador(equipo, scn);
                    break;
                case 2:
                    System.out.println("\n=== Formación del equipo ===");
                    equipo.listarFormaciónDelEquipo();
                    break;
                case 3:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción no válida. Intenta de nuevo.");
            }
        } while (opcion != 3);
        
        scn.close();
    }

    public static void mostrarMenu() {
        System.out.println("\nMenú de gestión del equipo:");
        System.out.println("1. Añadir jugador");
        System.out.println("2. Listar formación del equipo");
        System.out.println("3. Salir");
    }

    public static void agregarJugador(Equipo equipo, Scanner scn) {
        System.out.print("Nombre del futbolista: ");
        String nombre = scn.nextLine();

        System.out.print("Edad del futbolista: ");
        int edad = scn.nextInt();

        System.out.println("Posiciones disponibles: 1. Portero  2. Defensa  3. Centrocampista  4. Delantero");
        System.out.print("Elige la posición (1-4): ");
        int pos = scn.nextInt();
        
        Posicion posicion = null;
        switch (pos) {
            case 1:
                posicion = Posicion.Portero;
                break;
            case 2:
                posicion = Posicion.Defensa;
                break;
            case 3:
                posicion = Posicion.Centrocampista;
                break;
            case 4:
                posicion = Posicion.Delantero;
                break;
            default:
                System.out.println("Posición no válida. Volviendo al menú.");
                return;
        }

        System.out.print("Años como profesional: ");
        int anyosProfesional = scn.nextInt();
        scn.nextLine();

        System.out.print("Número de equipos en los que ha jugado: ");
        int numEquipos = scn.nextInt();
        scn.nextLine();

        ArrayList<String> equiposList = new ArrayList<>();
        for (int i = 0; i < numEquipos; i++) {
            System.out.print("Nombre del equipo " + (i + 1) + ": ");
            equiposList.add(scn.nextLine());
        }
        String[] equipos = equiposList.toArray(new String[0]);

        System.out.print("Número de trofeos ganados: ");
        int trofeos = scn.nextInt();
        scn.nextLine();

        Futbolista nuevoJugador = new Futbolista(nombre, edad, posicion, anyosProfesional, equipos, trofeos);

        try {
            equipo.anadirJugador(nuevoJugador);
            System.out.println("✅ Jugador añadido correctamente.");
        } catch (RegistroFutbolistaException e) {
            System.out.println("❌ Error: " + e.getMessage());
        }
    }
}
