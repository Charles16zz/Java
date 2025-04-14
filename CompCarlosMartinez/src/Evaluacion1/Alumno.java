package Evaluacion1;

	// Comentario: Clase Alumno hereda de Persona y contiene información académica adicional.
	public class Alumno extends Persona {
	    private String institucion;
	    private Asignatura[] materias;

	    // Constructor vacío
	    public Alumno() {
	        super(0); // Llama al constructor de Persona con cédula 0
	    }

	    // Constructor con parámetros
	    public Alumno(int cedula, String nombre, String apellido, String institucion, Asignatura[] materias) {
	        super(cedula);
	        setNombre(nombre);
	        setApellido(apellido);
	        this.institucion = institucion;
	        this.materias = materias;
	    }

	    public String getInstitucion() {
	        return institucion;
	    }

	    public void setInstitucion(String institucion) {
	        this.institucion = institucion;
	    }

	    public Asignatura[] getMaterias() {
	        return materias;
	    }

	    public void setMaterias(Asignatura[] materias) {
	        this.materias = materias;
	    }
	}
