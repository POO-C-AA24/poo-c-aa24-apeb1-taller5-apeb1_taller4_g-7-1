
public class Main {
    public static void main(String[] args) {
        CarritoDeCompras carrito = new CarritoDeCompras(10, 10);

        Producto p1 = new Producto("Laptop", 1200, 10);
        Producto p2 = new Producto("Mouse", 25, 50);
        Producto p3 = new Producto("Teclado", 45, 30);

        carrito.agregarProductoTienda(p1);
        carrito.agregarProductoTienda(p2);
        carrito.agregarProductoTienda(p3);

        carrito.agregarProducto("Laptop", 2);
        carrito.agregarProducto("Mouse", 3);
        carrito.agregarProducto("Teclado", 1);

        carrito.mostrarDetalleCompra();
        
        double total = carrito.calcularTotal();
        System.out.println("Total a pagar: " + total);

        carrito.realizarPago(1300, 100); // Ejemplo con descuento promocional de 100
    }
}
