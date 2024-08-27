/*
//  @ Project : Ejercicio 2 Arreglos de objetos
//  @ File Name : Main.java
//  @ Date : 23/08/2014
//  @ Author : Juan Montenegro
//
//
 */

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Date;

public class Main {

    public static void main(String[] args) {
        int opcion = 0;
        SistemaGestion gestor = new SistemaGestion();
        Scanner teclado = new Scanner(System.in);

        while (opcion != 6) {
            System.out.println();
            System.out.println("--- Menu Principal ---");
            System.out.println("1. Crear nuevo proyecto");
            System.out.println("2. Agregar tarea a proyecto");
            System.out.println("3. Crear nuevo desarrollador");
            System.out.println("4. Actualizar estado de tarea");
            System.out.println("5. Generar reporte de progreso");
            System.out.println("6. Salir");
            System.out.println();
            System.out.print("Selecciona una opcion: ");
            opcion = Integer.parseInt(teclado.nextLine());


            switch (opcion) {
                case 1:
                    System.out.println("Ingresa los datos del nuevo proyecto:");

                    System.out.print("Código: ");
                    String codigo = teclado.nextLine();

                    System.out.print("Nombre: ");
                    String nombre = teclado.nextLine();

                    System.out.print("Categoría: ");
                    String categoria = teclado.nextLine();

                    
                    break;

                case 2:
                    

                   
                    break;
                case 3:

                    System.out.println("Ingresa los datos del nuevo desarrollador:");

                    System.out.print("Nombre: ");
                     nombre = teclado.nextLine();

                    System.out.print("Nombre: ");
                    String nivel = teclado.nextLine();

                    Desarrollador dev = new Desarrollador(nombre, nivel);
                    gestor.crearDesarrollador(dev);
                    break;
                case 4:
                    
                    break;
                case 5:
                    System.out.println(gestor.generarReporteProyectos());
                    break;
                case 6:
                    System.out.println("Hasta la proxima!!! :)");
                    teclado.close();
                    break;
                
                default:
                    System.out.println("Selecciona una opción valida");
                    break;
            }
        }

    }
}