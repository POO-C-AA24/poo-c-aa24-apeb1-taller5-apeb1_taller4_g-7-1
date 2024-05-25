// Clase que representa un evento específico dentro de un conflicto internacional
class Evento {
    String nombre;
    private String fecha;
    private String ubicacion;
    private String descripcion;

    // Constructor
    public Evento(String nombre, String fecha, String ubicacion, String descripcion) {
        this.nombre = nombre;
        this.fecha = fecha;
        this.ubicacion = ubicacion;
        this.descripcion = descripcion;
    }

}

// Clase que representa un conflicto internacional
class ConflictoInternacional {
    private String nombre;
    private String[] paisesInvolucrados;
    private String fechaInicio;
    private String estadoActual;
    private Evento[] eventos;
    private int numEventos;

    // Constructor
    public ConflictoInternacional(String nombre, String[] paisesInvolucrados, String fechaInicio, String estadoActual, int maxEventos) {
        this.nombre = nombre;
        this.paisesInvolucrados = paisesInvolucrados;
        this.fechaInicio = fechaInicio;
        this.estadoActual = estadoActual;
        this.eventos = new Evento[maxEventos];
        this.numEventos = 0;
    }



    // Método para agregar un evento al conflicto
    public void agregarEvento(Evento evento) {
        if (numEventos < eventos.length) {
            eventos[numEventos++] = evento;
        } else {
            System.out.println("No se pueden agregar más eventos. Capacidad máxima alcanzada.");
        }
    }

    // Método para consultar información sobre los eventos del conflicto
    public Evento[] consultarEventos() {
        return eventos;
    }

    // Otros métodos relevantes
    // ...
}
