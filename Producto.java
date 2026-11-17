package extract_constant;

public class Producto {

    // CONSTANTES
    private static final double PRECIO_INICIAL = 0;
    private static final int STOCK_INICIAL = 0;

    private static final String MENSAJE_CANTIDAD_POSITIVA = "La cantidad debe ser positiva.";
    private static final String MENSAJE_STOCK_INSUFICIENTE = "No hay suficiente stock.";
    private static final String MENSAJE_VENTA_CORRECTA = "Venta realizada correctamente.";
    private static final String MENSAJE_REPOSICION_CORRECTA = "Stock repuesto correctamente.";

    // ATRIBUTOS
    private String nombre;
    private double precio;
    private int stock;

    // CONSTRUCTOR VACÍO
    public Producto() {
        this.nombre = "";
        this.precio = PRECIO_INICIAL;
        this.stock = STOCK_INICIAL;
    }

    // CONSTRUCTOR
    public Producto(String nombre, double precio, int stock) {
        this.nombre = nombre;

        if (precio >= PRECIO_INICIAL) {
            this.precio = precio;
        } else {
            this.precio = PRECIO_INICIAL;
        }

        this.stock = stock;
    }

    // MÉTODO PARA VENDER PRODUCTOS
    public void vender(int cantidad) {
        if (cantidad <= STOCK_INICIAL) {
            System.out.println(MENSAJE_CANTIDAD_POSITIVA);
        } else if (cantidad > stock) {
            System.out.println(MENSAJE_STOCK_INSUFICIENTE);
        } else {
            stock -= cantidad;
            System.out.println(MENSAJE_VENTA_CORRECTA);
        }
    }

    // MÉTODO PARA REPONER PRODUCTOS
    public void reponer(int cantidad) {
        if (cantidad <= STOCK_INICIAL) {
            System.out.println(MENSAJE_CANTIDAD_POSITIVA);
        } else {
            stock += cantidad;
            System.out.println(MENSAJE_REPOSICION_CORRECTA);
        }
    }

    // MÉTODO PARA MOSTRAR INFORMACIÓN
    public void mostrarInformacion() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Precio: " + precio + " €");
        System.out.println("Stock: " + stock);
    }
}
