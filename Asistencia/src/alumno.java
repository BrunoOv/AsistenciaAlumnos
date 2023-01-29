public class alumno {
    private String name;
    private String apellido;
    private int asistencia;
    private int faltas;

    public alumno(String name, String apellido, int asistencia, int faltas) {
        this.name = name;
        this.apellido = apellido;
        this.asistencia = asistencia;
        this.faltas = faltas;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getAsistencia() {
        return asistencia;
    }

    public void setAsistencia(int asistencia) {
        this.asistencia = asistencia;
    }

    public int getFaltas() {
        return faltas;
    }

    public void setFaltas(int faltas) {
        this.faltas = faltas;
    }
}
