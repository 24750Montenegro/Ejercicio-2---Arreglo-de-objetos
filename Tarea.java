public class Tarea {
    private String codigo;
    private String nombre;
    private String tipo;
    private int tiempoEstimado;
    private int tiempoReal;
    private String estado;
    private String priioridad;
    private Desarrollador desarrolladorAsignado;

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
    public String getPriioridad() {
        return priioridad;
    }
    public void setPriioridad(String priioridad) {
        this.priioridad = priioridad;
    }
    public Desarrollador getDesarrolladorAsignado() {
        return desarrolladorAsignado;
    }
    public void setDesarrolladorAsignado(Desarrollador desarrolladorAsignado) {
        this.desarrolladorAsignado = desarrolladorAsignado;
    }

    public Tarea(String codigo, String nombre, String tipo, int tiempoEstimado, int tiempoReal, String estado,
            String priioridad, Desarrollador desarrolladorAsignado) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.tipo = tipo;
        this.tiempoEstimado = tiempoEstimado;
        this.tiempoReal = tiempoReal;
        this.estado = estado;
        this.priioridad = priioridad;
        this.desarrolladorAsignado = desarrolladorAsignado;
    }
    public Tarea() {
    }

    //Métodos
    public void actualizarEstado(String nuevoEstado){

    }
    public void asignarDesarrollador(Desarrollador desarrollador){
        
    }

    
    
}
