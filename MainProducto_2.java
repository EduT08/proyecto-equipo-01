package refactorizado.ExtractMethod;
/**
* Clase principal del programa.
* Se encarga de ejecutar las operaciones de creación,
* venta, reposición y visualización de un producto.
*/
public class Mainproducto {
   // CONSTANTES
   private static final String NOMBRE_PRODUCTO = "Portátil";
   private static final double PRECIO_PRODUCTO = 750;
   private static final int STOCK_PRODUCTO = 10;
   private static final int CANTIDAD_VENTA = 3;
   private static final int CANTIDAD_REPOSICION = 5;
   private static final int CANTIDAD_VENTA_EXCESIVA = 20;
   /**
    * Método principal que inicia la ejecución del programa.
    *
    * @param args argumentos recibidos desde la línea de comandos.
    */
   public static void main(String[] args) {
       Producto producto = crearProducto();
       mostrarInformacionProducto(producto);
       realizarVenta(producto);
       realizarReposicion(producto);
       mostrarInformacionProducto(producto);
       realizarVentaExcesiva(producto);
   }
   /**
    * Crea un producto con sus datos iniciales.
    *
    * @return devuelve el producto creado.
    */
   public static Producto crearProducto() {
       return new Producto(
               NOMBRE_PRODUCTO,
               PRECIO_PRODUCTO,
               STOCK_PRODUCTO
       );
   }
   /**
    * Muestra la información del producto indicado.
    *
    * @param producto producto del que se quiere mostrar
    *                  la información.
    */
   public static void mostrarInformacionProducto(Producto producto) {
       producto.mostrarInformacion();
   }
   /**
    * Realiza una venta de 3 unidades del producto.
    *
    * @param producto producto sobre el que se realiza la venta.
    */
   public static void realizarVenta(Producto producto) {
       producto.vender(CANTIDAD_VENTA);
   }
   /**
    * Repone 5 unidades de stock del producto.
    *
    * @param producto producto al que se le repone el stock.
    */
   public static void realizarReposicion(Producto producto) {
       producto.reponer(CANTIDAD_REPOSICION);
   }
   /**
    * Intenta realizar una venta de 20 unidades del producto.
    *
    * @param producto producto sobre el que se intenta realizar
    *                 la venta.
    */
   public static void realizarVentaExcesiva(Producto producto) {
       producto.vender(CANTIDAD_VENTA_EXCESIVA);
   }
}

