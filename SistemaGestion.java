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
    }


    //Métodos
    public void crearProyecto(Proyecto proyecto){
        proyectos.add(proyecto);
    }

    public void crearDesarrollador(Desarrollador desarrollador){
        desarrolladores.add(desarrollador);
    }

    public void agregarTareaAProyecto(String codigoProyecto, Tarea tarea) {
        for (Proyecto i : proyectos) {
            if (i.getCodigo().equals(codigoProyecto)) {
                i.getTareas().add(tarea);
            }
        }
    }
    

    public void actualizarEstadoTarea(String codigoProyecto, String codigoTarea, String nuevoEstado) {
        for (Proyecto p : proyectos) {
            if (p.getCodigo().equals(codigoProyecto)) {
                for (Tarea t : p.getTareas()) {
                    if (t.getCodigo().equals(codigoTarea)) {
                        t.setEstado(nuevoEstado);
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
