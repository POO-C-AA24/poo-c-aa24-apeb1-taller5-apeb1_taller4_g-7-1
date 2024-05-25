class Persona {
    private String nombre;
    private int edad;
    private String ocupacion;
    private String nivelImplicacion;
    private boolean colaboracion;
    private double fianza;

    public Persona(String nombre, int edad, String ocupacion, String nivelImplicacion) {
        this.nombre = nombre;
        this.edad = edad;
        this.ocupacion = ocupacion;
        this.nivelImplicacion = nivelImplicacion;
        this.colaboracion = false;
        this.fianza = 0.0;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public String getOcupacion() {
        return ocupacion;
    }

    public String getNivelImplicacion() {
        return nivelImplicacion;
    }

    public boolean isColaboracion() {
        return colaboracion;
    }

    public double getFianza() {
        return fianza;
    }

    public void setColaboracion(boolean colaboracion) {
        this.colaboracion = colaboracion;
    }

    public void setFianza(double fianza) {
        this.fianza = fianza;
    }

    public void evaluarColaboracion(double totalDanioEconomico) {
        if (nivelImplicacion.equals("acusado") && colaboracion) {
            if (edad < 1) { // Asumiendo que la edad representa los años de sentencia
                fianza = totalDanioEconomico * 0.5;
            }
        }
    }

    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", ocupacion='" + ocupacion + '\'' +
                ", nivelImplicacion='" + nivelImplicacion + '\'' +
                ", colaboracion=" + colaboracion +
                ", fianza=" + fianza +
                '}';
    }
}
