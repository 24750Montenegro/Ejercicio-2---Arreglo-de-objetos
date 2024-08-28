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
        //variables iniciales
        int opcion = 0;
        SistemaGestion gestor = new SistemaGestion();
        Scanner teclado = new Scanner(System.in);

        //iniciar bucle
        while (opcion != 6) {
            //mostrar menú principal
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

            //opciónes del switch
            switch (opcion) {
                case 1:
                    //mensaje si no hay programadores
                    if(gestor.getDesarrolladores().isEmpty()){
                        System.out.println("Error: Hacen falta desarrolladores para crear un proyecto");
                        break;
                    }

                    System.out.println("Ingresa los datos del nuevo proyecto:");

                   // try catch para solicitud de crear un nuevo proyecto
                    try { 
                    System.out.print("Código: ");
                    String codigo = teclado.nextLine();

                    System.out.print("Nombre: ");
                    String nombre = teclado.nextLine();

                    System.out.print("Categoría: ");
                    System.out.println("1. Desarrollo de software   | 2. Mantenimiento de sistemas");
                    System.out.print("Ingresa el indice de la categoria: ");
                    int idCategoria = Integer.parseInt(teclado.nextLine());

                    String categoria = "";
                    if(idCategoria == 1){
                        categoria = "Desarrollo de software";
                    }else if(idCategoria == 2){
                        categoria = "Mantenimiento de sistemas";
                    }else{
                        System.out.println("ERROR: Está categoria no es valida. ");
                        break;
                    }

                   

                    // Mostrar lista de desarrolladores Junior disponibles

                    int juniors = 0;
                    System.out.println("Desarrolladores Junior disponibles:");
                    for (Desarrollador i: gestor.getDesarrolladores()) {
                        if (i.getNivel().equals("Junior")) {
                            juniors ++;
                            System.out.println(gestor.getDesarrolladores().indexOf(i) + ". " + i.getNombre() );
                        }
                    }

                    if(juniors == 0){
                        System.out.println("ERROR: NO HAY PROGRAMADORES JUNIOR");
                        break;
                    }
                    System.out.print("Selecciona el número del desarrollador Junior: ");
                    int indiceJunior = Integer.parseInt(teclado.nextLine());
                    Desarrollador desarrolladorJunior = gestor.getDesarrolladores().get(indiceJunior);

                    // Mostrar lista de desarrolladores Senior disponibles
                    int seniors = 0;
                    System.out.println("Desarrolladores Senior disponibles:");
                    for (Desarrollador i: gestor.getDesarrolladores()) {
                        if (i.getNivel().equals("Senior")) {
                            System.out.println(gestor.getDesarrolladores().indexOf(i) + ". " + i.getNombre());
                            seniors++;
                        }
                    }
                    if(seniors == 0){
                        System.out.println("ERROR: NO HAY PROGRAMADORES SENIOR");
                        break;
                    }

                    System.out.print("Selecciona el número del desarrollador Senior: ");
                    int indiceSenior = Integer.parseInt(teclado.nextLine());
                    Desarrollador desarrolladorSenior = gestor.getDesarrolladores().get(indiceSenior);

                    System.out.print("Fecha Límite (dd/MM/yyyy): ");
                    String fechaLimiteStr = teclado.nextLine();
                        Date fechaLimite = new SimpleDateFormat("dd/MM/yyyy").parse(fechaLimiteStr);
                        // Crear el objeto Proyecto con los datos ingresados
                        Proyecto proyecto = new Proyecto(codigo, nombre, categoria, desarrolladorJunior, desarrolladorSenior, fechaLimite, new ArrayList<>());

                        // Llamar al método para agregar el proyecto al sistema de gestión
                        gestor.crearProyecto(proyecto);

                        System.out.println("Proyecto creado exitosamente.");
                    } catch (Exception e) {
                        System.out.println("ERROR: algo salio mal");
                        System.out.println(e.getMessage());
                    }

                    
                    break;

                case 2:
                    //mensaje si no hay proyectos
                    if (gestor.getProyectos().isEmpty()) {
                        System.out.println("ERROR: NO hay proyectos para agregarles tareas");
                        break;
                    }

                    System.out.println("Proyectos disponibles:");
                    
                    for (Proyecto p : gestor.getProyectos()) {
                        System.out.println("Código: " + p.getCodigo() + " - Nombre: " + p.getNombre());
                        
                    }
                
                    System.out.print("Ingresa el código del proyecto al que deseas agregar la tarea: ");
                    String codigoProyectoSeleccionado = teclado.nextLine();
                
                    System.out.print("Código de la tarea: ");
                    String codigoTarea = teclado.nextLine();
                
                    System.out.print("Nombre de la tarea: ");
                    String nombreTarea = teclado.nextLine();
                
                    System.out.print("Tipo de tarea: ");
                    System.out.println("1. Desarrollo   | 2. Pruebas    | 3. Documentación");
                    int idTipoTarea = Integer.parseInt(teclado.nextLine());
                    String tipoTarea = "";

                    if (idTipoTarea == 1) {
                        tipoTarea = "Desarrollo";
                    }else if (idTipoTarea == 2) {
                        tipoTarea = "Pruebas";
                    }else if (idTipoTarea == 3) {
                        tipoTarea = "Documetación";
                    }else{
                        System.out.println("ERROR: Está opción no existe");
                        break;
                    }
                
                    System.out.print("Tiempo estimado (en horas): ");
                    int tiempoEstimado = Integer.parseInt(teclado.nextLine());
                
                    
                
                    System.out.print("Estado de la tarea: ");
                    System.out.println(" 1. No iniciada | 2. En progreso | 3. Completada");
                    System.out.print("Ingresa el estado: ");
                    int idEstadoTarea = Integer.parseInt(teclado.nextLine());
                    String estadoTarea = "";
                    if (idEstadoTarea == 1) {
                        estadoTarea = "No iniciada";
                    }else if (idEstadoTarea == 2) {
                        estadoTarea = "En progreso";
                    }else if (idEstadoTarea == 3) {
                        estadoTarea = "Completada";
                    }else {
                        System.out.println("ERROR: Este estado no es valido");
                        break;
                    }
                
                    System.out.print("Prioridad de la tarea: ");
                    String prioridadTarea = teclado.nextLine();
                
                    // Mostrar lista de desarrolladores disponibles
                    if(gestor.getDesarrolladores().isEmpty()){
                        System.out.println("ERROR: NO hay desarrolladores para agregarles la tarea");
                        break;
                    }
                    System.out.println("Desarrolladores disponibles:");
                    for (Desarrollador i :gestor.getDesarrolladores()) {
                        System.out.println(gestor.getDesarrolladores().indexOf(i) + ". " + i.getNombre() + " - "+ i.getNivel());
                    }
                    System.out.print("Selecciona el número del desarrollador asignado: ");
                    int indiceDesarrollador = Integer.parseInt(teclado.nextLine());
                    Desarrollador desarrolladorAsignado = gestor.getDesarrolladores().get(indiceDesarrollador);
                
                    // Crear el objeto Tarea con los datos ingresados
                    Tarea tarea = new Tarea(codigoTarea, nombreTarea, tipoTarea, tiempoEstimado, estadoTarea, prioridadTarea, desarrolladorAsignado);
                
                    // Llamar al método para agregar la tarea al proyecto seleccionado
                    System.out.println(gestor.agregarTareaAProyecto(codigoProyectoSeleccionado, tarea, desarrolladorAsignado));
                
                    break;
                
                case 3:
                    //crear un nuevo desarrollador
                    System.out.println("Ingresa los datos del nuevo desarrollador:");

                    System.out.print("Nombre: ");
                    String nombre = teclado.nextLine();

                    System.out.print("Nivel: ");
                    System.out.println("1. Junior      | 2. Senior");
                    System.out.print("Ingresa el indice del nivel: ");
                    int indiceNivel = Integer.parseInt(teclado.nextLine());

                    String nivel = "";
                    if (indiceNivel == 1) {
                         nivel = "Junior";

                    }else if (indiceNivel == 2){
                         nivel = "Senior";

                    }else{
                        System.out.println("ERROR: Está opción no es valida");
                        break;
                    }

                    Desarrollador dev = new Desarrollador(nombre, nivel);
                    gestor.crearDesarrollador(dev);
                    break;
                case 4:
                    //mensaje si no hay proyectos
                    if(gestor.getProyectos().isEmpty()){
                        System.out.println("ERROR: NO hay proyectos agregados");
                        break;
                    }
                    

                    System.out.println("Proyectos disponibles:");
                    for (Proyecto p : gestor.getProyectos()) {
                        System.out.println("Código: " + p.getCodigo() + " - Nombre: " + p.getNombre());
                    }
                    System.out.println("Ingresa el codigo del proyecto que deseas actualizar el estado de una tarea");
                    codigoProyectoSeleccionado = teclado.nextLine();

                    // try catch para verificar la solicitud de cambio de estado de una tarea
                    try {
                        Proyecto proyectoSeleccionado = new Proyecto();
                        for (Proyecto p : gestor.getProyectos()) {
                            if (p.getCodigo().equals(codigoProyectoSeleccionado)) {
                                proyectoSeleccionado = p;
                            }
                        }

                        // Tareas del proyecto seleccionado
                        if(proyectoSeleccionado.getTareas().isEmpty()){
                            System.out.println("Esté proyecto no tiene tareas para modificar su estado");
                            break;
                        }
                        System.out.println("TAREAS DEL PROYECTO ");
                        for(Tarea t : proyectoSeleccionado.getTareas()){
                            System.out.println("Código: "+ t.getCodigo() + " Nombre: " +t.getNombre() + " Estado : "+ t.getEstado());
                        }
                    
                    

                        System.out.print("Ingresa el codigo de la tarea: ");
                        codigoTarea = teclado.nextLine();

                        String nuevoEstado = "";

                        System.out.println("Actualizar estado: ");
                        System.out.println(" 1. No iniciada | 2. En progreso | 3. Completada");
                        System.out.print("Ingresa el nuevo estado de la tarea: ");
                        int idNuevoEstadoTarea = Integer.parseInt(teclado.nextLine());

                        if (idNuevoEstadoTarea == 1) {
                            nuevoEstado = "No iniciada";
                        }else if (idNuevoEstadoTarea == 2) {
                            nuevoEstado = "En progreso";
                        }else if (idNuevoEstadoTarea == 3) {
                            nuevoEstado = "Completada";
                        }else {
                            System.out.println("ERROR: Este estado no es valido");
                            break;
                        }

                        System.out.print("Tiempo real (en horas): ");
                        int tiempoReal = Integer.parseInt(teclado.nextLine());

                        
                        gestor.actualizarEstadoTarea(codigoProyectoSeleccionado, codigoTarea, nuevoEstado, tiempoReal);
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }


                    break;
                case 5:
                //reporte
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