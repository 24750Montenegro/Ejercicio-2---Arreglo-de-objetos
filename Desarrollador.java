/*
//  @ Project : Ejercicio 2 Arreglos de objetos
//  @ File Name : Desarrollador.java
//  @ Date : 23/08/2014
//  @ Author : Juan Montenegro
//
//
 */

import java.util.ArrayList;

public class Desarrollador {
    //Atributos
    private String nombre;
    private String nivel;
    private ArrayList<Tarea> tareasAsignadas;


    //Getters&setters
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getNivel() {
        return nivel;
    }
    public void setNivel(String nivel) {
        this.nivel = nivel;
    }
    public ArrayList<Tarea> getTareasAsignadas() {
        return tareasAsignadas;
    }
    public void setTareasAsignadas(ArrayList<Tarea> tareasAsignadas) {
        this.tareasAsignadas = tareasAsignadas;
    }
    

    // Constructores
    public Desarrollador(String nombre, String nivel) {
        this.nombre = nombre;
        this.nivel = nivel;
        this.tareasAsignadas = new ArrayList<>();
    }
    public Desarrollador() {
    }



    //Métodos
    public void asignarTarea (Tarea tarea){
        tareasAsignadas.add(tarea);
    }

    //toString
    @Override
    public String toString() {
        return "Desarrollador " + nivel + " - " + nombre ;
    }
    
    


}
