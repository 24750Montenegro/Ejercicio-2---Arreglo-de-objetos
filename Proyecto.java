import java.util.ArrayList;
import java.util.Date;


public class Proyecto {
    private String codigo;
    private String nombre;
    private String categoria;
    private Desarrollador desarrolladorJunior;
    private Desarrollador desarrolladorSenior;
    private Date fechaLimite;
    private ArrayList<Tarea> tareas;

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
    public String getCategoria() {
        return categoria;
    }
    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
    public Desarrollador getDesarrolladorJunior() {
        return desarrolladorJunior;
    }
    public void setDesarrolladorJunior(Desarrollador desarrolladorJunior) {
        this.desarrolladorJunior = desarrolladorJunior;
    }
    public Desarrollador getDesarrolladorSenior() {
        return desarrolladorSenior;
    }
    public void setDesarrolladorSenior(Desarrollador desarrolladorSenior) {
        this.desarrolladorSenior = desarrolladorSenior;
    }
    public Date getFechaLimite() {
        return fechaLimite;
    }
    public void setFechaLimite(Date fechaLimite) {
        this.fechaLimite = fechaLimite;
    }
    public ArrayList<Tarea> getTareas() {
        return tareas;
    }
    public void setTareas(ArrayList<Tarea> tareas) {
        this.tareas = tareas;
    }



    public Proyecto(String codigo, String nombre, String categoria, Desarrollador desarrolladorJunior,
            Desarrollador desarrolladorSenior, Date fechaLimite, ArrayList<Tarea> tareas) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.categoria = categoria;
        this.desarrolladorJunior = desarrolladorJunior;
        this.desarrolladorSenior = desarrolladorSenior;
        this.fechaLimite = fechaLimite;
        this.tareas = tareas;
    }
    public Proyecto() {
    }



    //Métodos
    public void agregarTarea(Tarea tarea){

    }
    
    public void generarReporteProgreso(){
        
    }

    
}
