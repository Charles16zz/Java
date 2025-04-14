package Evaluacion1;

public class Asignatura {
    private int codigo;
    private String nombre;

    // Constructor vacío
    public Asignatura() {}

    // Constructor con parámetros
    public Asignatura(int codigo, String nombre) {
        this.codigo = codigo;
        this.nombre = nombre;
    }

    // Getters y setters
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}