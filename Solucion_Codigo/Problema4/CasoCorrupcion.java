class CasoCorrupcion {
    private String nombre;
    private Fecha fechaInicio;
    private String estado;
    private String detalles;
    private Persona[] personasImplicadas;
    private int numPersonas;
    private double totalDanioEconomico;

    public CasoCorrupcion(String nombre, Fecha fechaInicio, String detalles, double totalDanioEconomico) {
        this.nombre = nombre;
        this.fechaInicio = fechaInicio;
        this.estado = "Iniciado";
        this.detalles = detalles;
        this.personasImplicadas = new Persona[10]; // Limite inicial de 10 personas
        this.numPersonas = 0;
        this.totalDanioEconomico = totalDanioEconomico;
    }

    public String getNombre() {
        return nombre;
    }

    public Fecha getFechaInicio() {
        return fechaInicio;
    }

    public String getEstado() {
        return estado;
    }

    public String getDetalles() {
        return detalles;
    }

    public Persona[] getPersonasImplicadas() {
        return personasImplicadas;
    }

    public void agregarPersonaImplicada(Persona persona) {
        if (numPersonas < personasImplicadas.length) {
            personasImplicadas[numPersonas++] = persona;
        } else {
            System.out.println("No se pueden agregar más personas implicadas en este caso.");
        }
    }

    public void actualizarEstado(Fecha fechaActual) {
        int diffInDays = fechaInicio.diferenciaEnDias(fechaActual);

        if (diffInDays > 14) {
            estado = "Urgente";
        } else if (diffInDays > 7) {
            estado = "Alerta";
        } else {
            estado = "Iniciado";
        }
    }

    public void evaluarColaboracion() {
        for (int i = 0; i < numPersonas; i++) {
            personasImplicadas[i].evaluarColaboracion(totalDanioEconomico);
        }
    }

    @Override
    public String toString() {
        StringBuilder personasStr = new StringBuilder();
        for (int i = 0; i < numPersonas; i++) {
            personasStr.append(personasImplicadas[i].toString()).append("\n");
        }

        return "CasoCorrupcion{" +
                "nombre='" + nombre + '\'' +
                ", fechaInicio=" + fechaInicio +
                ", estado='" + estado + '\'' +
                ", detalles='" + detalles + '\'' +
                ", personasImplicadas=\n" + personasStr +
                ", totalDanioEconomico=" + totalDanioEconomico +
                '}';
    }
}
