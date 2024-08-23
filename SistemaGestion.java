import java.util.ArrayList;


public class SistemaGestion {
    private ArrayList<Proyecto> proyectos;
    private ArrayList<Desarrollador> desarrolladores;

    
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


    
    public SistemaGestion(ArrayList<Proyecto> proyectos, ArrayList<Desarrollador> desarrolladores) {
        this.proyectos = proyectos;
        this.desarrolladores = desarrolladores;
    }
    public SistemaGestion() {
    }


    //Métodos
    public void crearProyecto(Proyecto proyecto){

    }

    public void crearDesarrollador(Desarrollador desarrollador){

    }

    public void agregarTareaAProyecto(String codigoProyecto, Tarea tarea){

    }

    public void actualizarEstadoTarea(String codigoProyecto, String codigoTarea, String nuevoEstado){

    }

    public void generarReporteProyectos(){
        
    }

    

}
