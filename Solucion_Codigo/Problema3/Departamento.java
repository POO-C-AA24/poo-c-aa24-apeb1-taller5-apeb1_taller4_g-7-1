class Departamento {
    private String nombre;
    private int numeroEmpleados;
    private double produccionAnual;
    private char categoria;

    public Departamento(String nombre, int numeroEmpleados, double produccionAnual) {
        this.nombre = nombre;
        this.numeroEmpleados = numeroEmpleados;
        this.produccionAnual = produccionAnual;
        this.categoria = determinarCategoria();
    }

    private char determinarCategoria() {
        if (numeroEmpleados > 20 && produccionAnual > 1000000) {
            return 'A';
        } else if (numeroEmpleados == 20 && produccionAnual == 1000000) {
            return 'B';
        } else if (numeroEmpleados == 10 && produccionAnual == 500000) {
            return 'C';
        } else {
            return 'N'; // N para no clasificado
        }
    }

    public String getNombre() {
        return nombre;
    }

    public int getNumeroEmpleados() {
        return numeroEmpleados;
    }

    public double getProduccionAnual() {
        return produccionAnual;
    }

    public char getCategoria() {
        return categoria;
    }

    @Override
    public String toString() {
        return "Departamento{" +
                "nombre='" + nombre + '\'' +
                ", numeroEmpleados=" + numeroEmpleados +
                ", produccionAnual=" + produccionAnual +
                ", categoria=" + categoria +
                '}';
    }
}

class Empresa {
    private String nombre;
    private String ruc;
    private String direccion;
    private Departamento[] departamentos;
    private int numeroDepartamentos;

    public Empresa(String nombre, String ruc, String direccion, int maxDepartamentos) {
        this.nombre = nombre;
        this.ruc = ruc;
        this.direccion = direccion;
        this.departamentos = new Departamento[maxDepartamentos];
        this.numeroDepartamentos = 0;
    }

    public void agregarDepartamento(Departamento departamento) {
        if (numeroDepartamentos < departamentos.length) {
            departamentos[numeroDepartamentos++] = departamento;
        } else {
            System.out.println("No se pueden agregar más departamentos a la empresa.");
        }
    }

    public void mostrarDepartamentos() {
        System.out.println("Empresa: " + nombre + " - RUC: " + ruc + " - Dirección: " + direccion);
        for (int i = 0; i < numeroDepartamentos; i++) {
            System.out.println(departamentos[i].toString());
        }
    }
}