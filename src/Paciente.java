public class Paciente implements Comparable<Paciente> {
    private String nombre;
    private String sintoma;
    private String prioridad;

    public Paciente(String nombre, String sintoma, String prioridad) {
        this.nombre = nombre;
        this.sintoma = sintoma;
        this.prioridad = prioridad;
    }

    public String getNombre() {
        return nombre;
    }

    public String getSintoma() {
        return sintoma;
    }

    public String getPrioridad() {
        return prioridad;
    }

    @Override
    public int compareTo(Paciente o) {
        return this.prioridad.compareTo(o.prioridad);
    }
    
    @Override
    public String toString() {
        return nombre + ", " + sintoma + ", " + prioridad;
    }

}
