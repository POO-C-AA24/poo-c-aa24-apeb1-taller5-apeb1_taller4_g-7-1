public class FiscaliaApp {
    private CasoCorrupcion[] casos;
    private int numCasos;

    public FiscaliaApp(int maxCasos) {
        this.casos = new CasoCorrupcion[maxCasos];
        this.numCasos = 0;
    }

    public void agregarCaso(CasoCorrupcion caso) {
        if (numCasos < casos.length) {
            casos[numCasos++] = caso;
        } else {
            System.out.println("No se pueden agregar más casos.");
        }
    }

    public void mostrarCasos() {
        for (int i = 0; i < numCasos; i++) {
            casos[i].evaluarColaboracion();
            System.out.println(casos[i].toString());
        }
    }

    public static void main(String[] args) {
        FiscaliaApp app = new FiscaliaApp(5);

        // Crear fechas
        Fecha fecha1 = new Fecha(10, 5, 2024);
        Fecha fecha2 = new Fecha(1, 5, 2024);

        // Crear casos de corrupción
        CasoCorrupcion caso1 = new CasoCorrupcion("Caso A", fecha1, "Detalles del caso A", 1000000);
        CasoCorrupcion caso2 = new CasoCorrupcion("Caso B", fecha2, "Detalles del caso B", 2000000);

        // Crear personas implicadas
        Persona persona1 = new Persona("Juan Perez", 30, "Ingeniero", "acusado");
        Persona persona2 = new Persona("Maria Lopez", 45, "Abogada", "testigo");
        Persona persona3 = new Persona("Carlos Gomez", 50, "Contador", "acusado");

        // Agregar personas a los casos
        caso1.agregarPersonaImplicada(persona1);
        caso1.agregarPersonaImplicada(persona2);
        caso2.agregarPersonaImplicada(persona3);

        // Establecer colaboración
        persona1.setColaboracion(true);
        persona3.setColaboracion(true);

        // Agregar casos a la aplicación
        app.agregarCaso(caso1);
        app.agregarCaso(caso2);

        // Mostrar información de los casos
        app.mostrarCasos();
    }
}
