class Producto {
    private String nombre;
    private double precio;
    private int cantidad;

    public Producto(String nombre, double precio, int cantidad) {
        this.nombre = nombre;
        this.precio = precio;
        this.cantidad = cantidad;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
}

class CarritoDeCompras {
    private Producto[] productosCarrito;
    private int cantidadProductosCarrito;
    private Producto[] productosTienda;
    private int cantidadProductosTienda;

    public CarritoDeCompras(int tamanoTienda, int tamanoCarrito) {
        productosTienda = new Producto[tamanoTienda];
        cantidadProductosTienda = 0;
        productosCarrito = new Producto[tamanoCarrito];
        cantidadProductosCarrito = 0;
    }

    public void agregarProductoTienda(Producto producto) {
        if (cantidadProductosTienda < productosTienda.length) {
            productosTienda[cantidadProductosTienda++] = producto;
        } else {
            System.out.println("No se puede agregar más productos a la tienda.");
        }
    }

    private Producto encontrarProductoTienda(String nombre) {
        for (int i = 0; i < cantidadProductosTienda; i++) {
            if (productosTienda[i].getNombre().equals(nombre)) {
                return productosTienda[i];
            }
        }
        return null;
    }

    public void agregarProducto(String nombre, int cantidad) {
        Producto producto = encontrarProductoTienda(nombre);
        if (producto != null) {
            if (producto.getCantidad() >= cantidad) {
                Producto productoEnCarrito = null;
                for (int i = 0; i < cantidadProductosCarrito; i++) {
                    if (productosCarrito[i].getNombre().equals(nombre)) {
                        productoEnCarrito = productosCarrito[i];
                        break;
                    }
                }
                if (productoEnCarrito != null) {
                    productoEnCarrito.setCantidad(productoEnCarrito.getCantidad() + cantidad);
                } else {
                    if (cantidadProductosCarrito < productosCarrito.length) {
                        productosCarrito[cantidadProductosCarrito++] = new Producto(nombre, producto.getPrecio(), cantidad);
                    } else {
                        System.out.println("No se puede agregar más productos al carrito.");
                        return;
                    }
                }
                producto.setCantidad(producto.getCantidad() - cantidad);
                System.out.println("Producto " + nombre + " agregado al carrito.");
            } else {
                System.out.println("No hay suficiente cantidad de " + nombre + ". Disponible: " + producto.getCantidad());
            }
        } else {
            System.out.println("El producto " + nombre + " no existe en la tienda.");
        }
    }

    public double calcularTotal() {
        double total = 0;
        for (int i = 0; i < cantidadProductosCarrito; i++) {
            total += productosCarrito[i].getPrecio() * productosCarrito[i].getCantidad();
        }
        return total;
    }

    public void realizarPago(double montoPagado, double descuentoPromocional) {
        double total = calcularTotal();
        double totalFinal = total;

        if (total >= 1000) {
            totalFinal -= descuentoPromocional;
        }

        if (montoPagado >= totalFinal) {
            System.out.println("Pago realizado. Su cambio es: " + (montoPagado - totalFinal) + ". ¡Gracias por su compra!");
        } else {
            System.out.println("El monto pagado no es suficiente. Falta: " + (totalFinal - montoPagado));
        }
    }

    public void mostrarDetalleCompra() {
        System.out.println("Detalle de la compra:");
        for (int i = 0; i < cantidadProductosCarrito; i++) {
            System.out.println("Producto: " + productosCarrito[i].getNombre() + ", Cantidad: " + productosCarrito[i].getCantidad());
        }
    }
}