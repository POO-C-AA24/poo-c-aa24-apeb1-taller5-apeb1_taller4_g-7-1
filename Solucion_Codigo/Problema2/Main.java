
public class Main {
    public static void main(String[] args) {
        // Crear un estudiante
        Estudiante estudiante = new Estudiante("Juan Lopez", 20);

        // Crear una materia con sus calificaciones
        Materia matematicas = new Materia("Matemáticas", 3.0, 2.5, 2.0);

        // Asignar la materia al estudiante
        estudiante.asignarMateria(matematicas);

        // Verificar si el estudiante ha aprobado la materia
        estudiante.verificarAprobacion();
    }
}
