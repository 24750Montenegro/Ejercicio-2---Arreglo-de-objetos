/*
//  @ Project : Ejercicio 2 Arreglos de objetos
//  @ File Name : SistemaGestion.java
//  @ Date : 23/08/2014
//  @ Author : Juan Montenegro
//
//
 */

import java.util.ArrayList;


public class SistemaGestion {
    //Atributos
    private ArrayList<Proyecto> proyectos;
    private ArrayList<Desarrollador> desarrolladores;

    //Getters&setters
    public ArrayList<Proyecto> getProyectos() {
        return proyectos;
    }
    public void setProyectos(ArrayList<Proyecto> proyectos) {
        this.proyectos = proyectos;
    }
    public ArrayList<Desarrollador> getDesarrolladores() {
        return desarrolladores;
    }
    public void setDesarrolladores(ArrayList<Desarrollador> desarrolladores) {
        this.desarrolladores = desarrolladores;
    }


    //Constructores
    public SistemaGestion(ArrayList<Proyecto> proyectos, ArrayList<Desarrollador> desarrolladores) {
        this.proyectos = proyectos;
        this.desarrolladores = desarrolladores;
    }
    public SistemaGestion() {
        this.proyectos = new ArrayList<>();
        this.desarrolladores = new ArrayList<>();
    }


    //Métodos
    public void crearProyecto(Proyecto proyecto){
        proyectos.add(proyecto);
    }

    public void crearDesarrollador(Desarrollador desarrollador){
        desarrolladores.add(desarrollador);
    }

    
    public String agregarTareaAProyecto(String codigoProyecto, Tarea tarea, Desarrollador dev) {
        int tiempo = 0;
        
        // Calcular el tiempo total estimado del desarrollador asignado
        for (Tarea t : dev.getTareasAsignadas()) {
            tiempo += t.getTiempoEstimado();
        }
    
        // Verificar si al agregar esta tarea se exceden las 40 horas
        if (tiempo + tarea.getTiempoEstimado() > 40) {
            return "ERROR: Esta tarea excede la estimación máxima de 40 horas por programador";
        }
        
        // Buscar el proyecto y agregar la tarea
        for (Proyecto p : proyectos) {
            if (p.getCodigo().equals(codigoProyecto)) {
                p.agregarTarea(tarea);
                dev.getTareasAsignadas().add(tarea);
                return "Tarea agregada exitosamente";
            }
        }
        
        return "Error: Proyecto no encontrado";
    }
    
    

    public void actualizarEstadoTarea(String codigoProyecto, String codigoTarea, String nuevoEstado, int tiempoReal) {
        for (Proyecto p : proyectos) {
            //buscar proyecto por codigo
            if (p.getCodigo().equals(codigoProyecto)) {
                for (Tarea t : p.getTareas()) {
                    //buscar tarea por codigo
                    if (t.getCodigo().equals(codigoTarea)) {
                        //actualizar estado de la tarea
                        t.actualizarEstado(nuevoEstado, tiempoReal);
                    }
                }
            }
        }
    }
    

    public String generarReporteProyectos(){
        String reporte = "-- REPORTE DE PROYECTOS --";

        for (Proyecto proyecto : proyectos) {
            reporte += "---------------------------------------\n";
            reporte += proyecto.generarReporteProgreso();
            reporte += "\n---------------------------------------\n";

        }
        return reporte;
    }

    

}
