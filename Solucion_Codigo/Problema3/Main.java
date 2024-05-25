
public class Main {
    public static void main(String[] args) {
        Empresa empresa = new Empresa("Coca Cola", "17023828382", "Avenida Occidental", 5);

        Departamento dept1 = new Departamento("Recursos Humanos", 15, 750000);
        Departamento dept2 = new Departamento("Ventas", 22, 1500000);
        Departamento dept3 = new Departamento("Producción", 10, 500000);
        Departamento dept4 = new Departamento("Investigación y Desarrollo", 20, 1000000);

        empresa.agregarDepartamento(dept1);
        empresa.agregarDepartamento(dept2);
        empresa.agregarDepartamento(dept3);
        empresa.agregarDepartamento(dept4);

        empresa.mostrarDepartamentos();
    }
}
