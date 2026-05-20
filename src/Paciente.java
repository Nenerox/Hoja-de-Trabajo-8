public class Paciente {
    String nombre;
    String sintoma;
    String prioridad;

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
}
