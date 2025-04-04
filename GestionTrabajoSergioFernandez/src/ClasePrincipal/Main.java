package ClasePrincipal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;

import clases.*;

public class Main {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		//creo un arraylist de empleados para mostrarlos a la hora de crear trabajos
		ArrayList<Empleado> empleados = new ArrayList<>();
		//lista de tipo trabajo que alberga reuniones y tareas
		List<Trabajo> trabajos = new ArrayList<>();
		//empleados creados por mi
		Empleado e1 = new Empleado(1,"Juan", "Fontaneria");
		Empleado e2 = new Empleado(2,"Ivan enano", "RRHH");
		Empleado e3 = new Empleado(3,"Felipe", "Cocina");
		Empleado e4 = new Empleado(4,"Monica", "Programador");
		Empleado e5 = new Empleado(5,"Elias", "Caza");
		//se añaden a la lista
		empleados.add(e1);
		empleados.add(e2);
		empleados.add(e3);
		empleados.add(e4);
		empleados.add(e5);
		

		System.out.println("Bienvenido a la gestion de trabajos.");
		//menu con do while que para cuando pulsas el 0
		int num;
		do {
			System.out.println("1. Listar trabajadores");
			System.out.println("2. Crear reunion");
			System.out.println("3. Crear Tarea");
			System.out.println("4. Ver trabajos");
			System.out.println("5. Agrupar por empleado");
			System.out.println("0. Salir");
			num = scn.nextInt();
			switch (num) {
			case 1: {
				//mediante un foreach recorro e imprimo el arraylist trabajos00
				empleados.stream()
						 .forEach(System.out::println);	
				break;
			}
			case 2: {
				System.out.println("//Creacion de una Reunion//");
				System.out.println("Asignale una Id");
				int rID = scn.nextInt();
				System.out.println("Descripcion de la reunion:");
				String rDesc = scn.next();
				System.out.println("Responsable:");
				empleados.stream()
				 .forEach(System.out::println);	
				System.out.println("Elige 1:");
				int ie = scn.nextInt();
				Empleado eR = empleados.get(ie);
				System.out.println("Dentro de cuantos dias es la reunion¿?");
				int dL = scn.nextInt();
				LocalDate fR = LocalDate.now().plusDays(dL);
				System.out.println("¿Donde es la reunion?");
				String ubicacion = scn.next();
				Trabajo r1 = new Reunion(rID,rDesc,eR,fR,ubicacion);
				System.out.println("Trabajo creado exitosamente, puedes ver los trabajos dandole al 4!");
				trabajos.add(r1);
				break;
			}
			
			case 3: {
				System.out.println("//Creacion de una Tarea//");
				System.out.println("Asignale una Id");
				int tID = scn.nextInt();
				System.out.println("Descripcion de la tarea:");
				String tDesc = scn.next();
				System.out.println("Responsable:");
				empleados.stream()
				 .forEach(System.out::println);	
				System.out.println("Elige 1:");
				int ie = scn.nextInt();
				Empleado eT = empleados.get(ie);
				System.out.println("Dentro de cuantos dias es la tarea¿?");
				int dL = scn.nextInt();
				LocalDate fT = LocalDate.now().plusDays(dL);
				System.out.println("Que prioridad tiene la tarea¿?");
				System.out.println("1.Alta");
				System.out.println("2.Media");
				System.out.println("3.Baja");
				int prio = scn.nextInt();
				if(prio == 1) {
					Prioridad prioridad = Prioridad.Alta;
					Trabajo r1 = new Tarea(tID,tDesc,eT,fT,prioridad);
					trabajos.add(r1);
				}else if (prio == 2) {
					Prioridad prioridad = Prioridad.Media;
					Trabajo r1 = new Tarea(tID,tDesc,eT,fT,prioridad);
					trabajos.add(r1);
				}else {Prioridad prioridad = Prioridad.Baja;
					Trabajo r1 = new Tarea(tID,tDesc,eT,fT,prioridad);
					trabajos.add(r1);
				}
				System.out.println("Trabajo creado exitosamente, puedes ver los trabajos dandole al 4!");
				//al intentar crear la tarea si los dias no son correctos salta la excepcion
				break;
			}
			case 4: {
				//mediante un foreach recorro e imprimo el arraylist trabajos
				trabajos.stream()
						.forEach(System.out::println);
				break;
			}
			case 5:{
				//creo un mapa a a partir de un stream de trabajos donde ordeno por responsable
				Map<Empleado, List<Trabajo>> ordenacion = trabajos.stream()
				.collect(Collectors.groupingBy(Trabajo::getResponsable));
				ordenacion.toString();
				
				
				//Map<Prioridad, List<Trabajo>> ordenacion2 = trabajos.stream()
				//.filter(Trabajo.is(Tarea))		
						
				
				break;
			}
			case 0:{
				System.out.println("adios");
				break;
			}
			default:
				System.out.println("Opcion no valida");
			}
		}while (num!=0);
		
		
		
		
		
		
		
	}

}
