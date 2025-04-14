package Evaluacion1;

public class TestAlumno {
    public static void main(String[] args) {
        // Crear materias
        Asignatura m1 = new Asignatura(2102, "Pogramacion Java Junior");
        
        Asignatura[] materias = {m1};

        // Crear alumno
        Alumno alumno = new Alumno(6257815, "Carlos", "Martinez", "SNPP", materias);

        // Imprimir información del alumno
        System.out.println("Alumno: " + alumno.getNombre() + " " + alumno.getApellido());
        System.out.println("Cédula: " + alumno.getCedula());
        System.out.println("Institución: " + alumno.getInstitucion());
        System.out.println("Materias:");
        for (Asignatura a : alumno.getMaterias()) {
            System.out.println("- " + a.getCodigo() + ": " + a.getNombre());
        }
    }
}