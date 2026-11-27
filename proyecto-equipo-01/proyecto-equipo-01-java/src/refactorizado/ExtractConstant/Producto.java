
package refactorizado.ExtractConstant;

public class Producto {

    // CONSTANTES
    private static final String NOMBRE_INICIAL = "";
    private static final double PRECIO_INICIAL = 0;
    private static final int STOCK_INICIAL = 0;
    private static final String MENSAJE_CANTIDAD = "La cantidad debe ser positiva.";
    private static final String MENSAJE_STOCK = "No hay suficiente stock.";
    private static final String MENSAJE_VENTA = "Venta realizada correctamente.";
    private static final String MENSAJE_REPOSICION = "Stock repuesto correctamente.";

    // ATRIBUTOS
    private String nombre;
    private double precio;
    private int stock;

    // CONSTRUCTOR VACÍO
    public Producto() {
        this.nombre = NOMBRE_INICIAL;
        this.precio = PRECIO_INICIAL;
        this.stock = STOCK_INICIAL;
    }

    // CONSTRUCTOR
    public Producto(String nombre, double precio, int stock) {
        this.nombre = nombre;

        if (precio >= 0) {
            this.precio = precio;
        } else {
            this.precio = PRECIO_INICIAL;
        }

        this.stock = stock;
    }

    // GETTERS Y SETTERS
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    // MÉTODO PARA VENDER PRODUCTOS
    public void vender(int cantidad) {

        if (cantidad <= 0) {
            System.out.println(MENSAJE_CANTIDAD);

        } else if (cantidad > stock) {
            System.out.println(MENSAJE_STOCK);

        } else {
            stock -= cantidad;
            System.out.println(MENSAJE_VENTA);
        }
    }

    // MÉTODO PARA REPONER PRODUCTOS
    public void reponer(int cantidad) {

        if (cantidad <= 0) {
            System.out.println(MENSAJE_CANTIDAD);

        } else {
            stock += cantidad;
            System.out.println(MENSAJE_REPOSICION);
        }
    }

    // MÉTODO PARA MOSTRAR INFORMACIÓN
    public String mostrarInformación() {
        return "\nNombre=" + nombre
                + "\nPrecio=" + precio
                + "\nStock=" + stock;
    }
}

