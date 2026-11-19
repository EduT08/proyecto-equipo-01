
package refactorizado.rename;

public class Producto {

    // ATRIBUTOS
    private String nombreProducto;
    private double precioProducto;
    private int cantidadStock;

    // CONSTRUCTOR VACÍO
    public Producto() {
        this.nombreProducto = "";
        this.precioProducto = 0;
        this.cantidadStock = 0;
    }

    // CONSTRUCTOR
    public Producto(String nombreProducto, double precioProducto,
                    int cantidadStock) {

        this.nombreProducto = nombreProducto;

        if (precioProducto >= 0) {
            this.precioProducto = precioProducto;
        } else {
            this.precioProducto = 0;
        }

        this.cantidadStock = cantidadStock;
    }

    // GETTERS Y SETTERS
    public String getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public double getPrecioProducto() {
        return precioProducto;
    }

    public void setPrecioProducto(double precioProducto) {
        this.precioProducto = precioProducto;
    }

    public int getCantidadStock() {
        return cantidadStock;
    }

    public void setCantidadStock(int cantidadStock) {
        this.cantidadStock = cantidadStock;
    }

    // MÉTODO PARA VENDER PRODUCTOS
    public void realizarVenta(int cantidad) {

        if (cantidad <= 0) {
            System.out.println("La cantidad debe ser positiva.");

        } else if (cantidad > cantidadStock) {
            System.out.println("No hay suficiente stock.");

        } else {
            cantidadStock -= cantidad;
            System.out.println("Venta realizada correctamente.");
        }
    }

    // MÉTODO PARA REPONER PRODUCTOS
    public void reponerStock(int cantidad) {

        if (cantidad <= 0) {
            System.out.println("La cantidad debe ser positiva.");

        } else {
            cantidadStock += cantidad;
            System.out.println("Stock repuesto correctamente.");
        }
    }

    // MÉTODO PARA MOSTRAR INFORMACIÓN
    public String obtenerInformacion() {
        return "\nNombre=" + nombreProducto
                + "\nPrecio=" + precioProducto
                + "\nStock=" + cantidadStock;
    }
}

