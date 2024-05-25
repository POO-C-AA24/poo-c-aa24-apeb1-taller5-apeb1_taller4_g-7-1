class Materia {
    private String nombre;
    private double calificacionACD;
    private double calificacionAPE;
    private double calificacionAA;

    public Materia(String nombre, double calificacionACD, double calificacionAPE, double calificacionAA) {
        this.nombre = nombre;
        this.calificacionACD = calificacionACD;
        this.calificacionAPE = calificacionAPE;
        this.calificacionAA = calificacionAA;
    }

    public String getNombre() {
        return nombre;
    }

    public double getCalificacionACD() {
        return calificacionACD;
    }

    public double getCalificacionAPE() {
        return calificacionAPE;
    }

    public double getCalificacionAA() {
        return calificacionAA;
    }

    public boolean verificarAprobacion() {
        double totalCalificaciones = calificacionACD + calificacionAPE + calificacionAA;
        double porcentajeTotal = (totalCalificaciones / 10.0) * 100.0;
        return porcentajeTotal >= 70.0;
    }

    public double calificacionRecuperacion(double calificacionRecuperacion) {
        double totalCalificaciones = calificacionACD + calificacionAPE + calificacionAA;
        double porcentajeAcumulado = (totalCalificaciones / 10.0) * 60.0;
        return porcentajeAcumulado + calificacionRecuperacion;
    }
}

class Estudiante {
    private String nombre;
    private int edad;
    private Materia materia;

    public Estudiante(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public void asignarMateria(Materia materia) {
        this.materia = materia;
    }

    public void verificarAprobacion() {
        if (materia != null) {
            if (materia.verificarAprobacion()) {
                System.out.println(nombre + " ha aprobado la materia " + materia.getNombre());
            } else {
                System.out.println(nombre + " no ha aprobado la materia " + materia.getNombre() + " y deberá rendir un examen de recuperación.");
                System.out.println("Calificación necesaria en el examen de recuperación: " + (3.5 - materia.calificacionRecuperacion(0)));
            }
        } else {
            System.out.println(nombre + " no tiene materia asignada.");
        }
    }
}
