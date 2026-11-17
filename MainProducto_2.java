package extract_method;

/**
 * Clase principal del programa.
 * Se encarga de ejecutar las operaciones de creación,
 * venta, reposición y visualización de un producto.
 */
public class MainProducto_2 {

    /**
     * Método principal que inicia la ejecución del programa.
     *
     * @param args argumentos recibidos desde la línea de comandos.
     */
    public static void main(String[] args) {

        Producto_2 p1 = crearProducto();
        mostrarInformacionProducto(p1);
        realizarVenta(p1);
        realizarReposicion(p1);
        mostrarInformacionProducto(p1);
        realizarVentaExcesiva(p1);
    }

    /**
     * Crea un producto con sus datos iniciales.
     *
     * @return devuelve el producto creado.
     */
    public static Producto_2 crearProducto() {
        return new Producto_2("Portátil", 750, 10);
    }

    /**
     * Muestra la información del producto indicado.
     *
     * @param producto producto del que se quiere mostrar la información.
     */
    public static void mostrarInformacionProducto(Producto_2 producto) {
        producto.mostrarInformacion();
    }

    /**
     * Realiza una venta de 3 unidades del producto.
     *
     * @param producto producto sobre el que se realiza la venta.
     */
    public static void realizarVenta(Producto_2 producto) {
        producto.vender(3);
    }

    /**
     * Repone 5 unidades de stock del producto.
     *
     * @param producto producto al que se le repone el stock.
     */
    public static void realizarReposicion(Producto_2 producto) {
        producto.reponer(5);
    }

    /**
     * Intenta realizar una venta de 20 unidades del producto.
     *
     * @param producto producto sobre el que se intenta realizar la venta.
     */
    public static void realizarVentaExcesiva(Producto_2 producto) {
        producto.vender(20);
    }
}
