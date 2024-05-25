public class Main {
    public static void main(String[] args) {
        // Crear un evento
        Evento evento1 = new Evento("Batalla del Pichincha", "1982-05-24", "Frontera Ecuatoriana", "Disputa de tierras");

        // Crear un conflicto internacional
        String[] paisesInvolucrados = {"Ecuador", "Peru"};
        ConflictoInternacional conflicto1 = new ConflictoInternacional("Tratado de Paz", paisesInvolucrados, "2000-03-12", "En curso", 10);

        // Agregar evento al conflicto
        conflicto1.agregarEvento(evento1);

        // Consultar información sobre los eventos del conflicto
        Evento[] eventosConflicto1 = conflicto1.consultarEventos();
        for (Evento evento : eventosConflicto1) {
            if (evento != null) {
                System.out.println("Nombre del evento: " + evento.nombre);
                
            }
        }
    }
}