/*
//  @ Project : Ejercicio 2 Arreglos de objetos
//  @ File Name : Tarea.java
//  @ Date : 23/08/2014
//  @ Author : Juan Montenegro
//
//
 */

public class Tarea {
    //Atributos
    private String codigo;
    private String nombre;
    private String tipo;
    private int tiempoEstimado;
    private int tiempoReal;
    private String estado;
    private String prioridad;
    private Desarrollador desarrolladorAsignado;

    //Getters&setters
    public String getCodigo() {
        return codigo;
    }
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public int getTiempoEstimado() {
        return tiempoEstimado;
    }
    public void setTiempoEstimado(int tiempoEstimado) {
        this.tiempoEstimado = tiempoEstimado;
    }
    public int getTiempoReal() {
        return tiempoReal;
    }
    public void setTiempoReal(int tiempoReal) {
        this.tiempoReal = tiempoReal;
    }
    public String getEstado() {
        return estado;
    }
    public void setEstado(String estado) {
        this.estado = estado;
    }
    public String getprioridad() {
        return prioridad;
    }
    public void setprioridad(String prioridad) {
        this.prioridad = prioridad;
    }
    public Desarrollador getDesarrolladorAsignado() {
        return desarrolladorAsignado;
    }
    public void setDesarrolladorAsignado(Desarrollador desarrolladorAsignado) {
        this.desarrolladorAsignado = desarrolladorAsignado;
    }

    //Constructores
    public Tarea(String codigo, String nombre, String tipo, int tiempoEstimado, int tiempoReal, String estado,
            String prioridad, Desarrollador desarrolladorAsignado) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.tipo = tipo;
        this.tiempoEstimado = tiempoEstimado;
        this.tiempoReal = tiempoReal;
        this.estado = estado;
        this.prioridad = prioridad;
        this.desarrolladorAsignado = desarrolladorAsignado;
    }

    public Tarea() {
    }

    //Métodos
    public void actualizarEstado(String nuevoEstado){
        setEstado(nuevoEstado);
    }

    public void asignarDesarrollador(Desarrollador desarrollador){
        setDesarrolladorAsignado(desarrollador);
    }
  

    
    //ToString 
    
      @Override
    public String toString() {
        return  codigo + " | " + nombre + ": Tipo:" + tipo + "Estado: "+estado + ", Prioridad: " + prioridad
                + " Asignado a:" + desarrolladorAsignado;
    }
}
