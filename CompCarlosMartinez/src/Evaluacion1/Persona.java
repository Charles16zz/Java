package Evaluacion1;

public class Persona {
	//Comentario 1: Declaracion de Atributos privados para encapsular los datos
    private int cedula;
    private String nombre;
    private String apellido;

    // Comentario 2: Constructor que recibe la cédula y valida su valor.
    public Persona(int cedula) {
        setCedula(cedula);
        this.nombre = "Desconocido";
        this.apellido = "Desconocido";
    }

    // Comentario 3: Valida que la cédula sea mayor a 500000.
    public void setCedula(int cedula) {
        if (cedula > 500000) {
            this.cedula = cedula;
        } else {
            System.out.println("Cédula no válida. Se asignó 0.");
            this.cedula = 0;
        }
    }

    // Comentario 4: Valida que el nombre no esté vacío.
    public void setNombre(String nombre) {
        if (nombre.equals("")) {
            System.out.println("Nombre no válido. Se asignó 'Desconocido'.");
            this.nombre = "Desconocido";
        } else {
            this.nombre = nombre;
        }
    }

    // Comentario 5: Muestra los datos en una sola línea.
    public String toString() {
        return cedula + " - " + nombre + " - " + apellido;
    }

    public int getCedula() {
        return cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getApellido() {
        return apellido;
    }
}