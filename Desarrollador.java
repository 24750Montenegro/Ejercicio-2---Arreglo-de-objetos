import java.util.ArrayList;

public class Desarrollador {
    private String nombre;
    private String nivel;
    private ArrayList<Tarea> tareasAsignadas;

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

    
    public Desarrollador(String nombre, String nivel, ArrayList<Tarea> tareasAsignadas) {
        this.nombre = nombre;
        this.nivel = nivel;
        this.tareasAsignadas = tareasAsignadas;
    }
    public Desarrollador() {
    }



    //Métodos
    public void asignarTarea (Tarea tarea){

    }
    

}
