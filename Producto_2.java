
package refactorizado.ExtractMethod;
/**
* Clase que representa un producto de una tienda.
* Permite gestionar su nombre, precio y stock,
* además de realizar ventas y reposiciones.
*/
class Producto {
   // CONSTANTES
   private static final double PRECIO_INICIAL = 0;
   private static final int STOCK_INICIAL = 0;
   private static final int CANTIDAD_MINIMA = 0;
   private static final String MENSAJE_CANTIDAD_POSITIVA =
           "La cantidad debe ser positiva.";
   private static final String MENSAJE_STOCK_INSUFICIENTE =
           "No hay suficiente stock.";
   private static final String MENSAJE_VENTA_CORRECTA =
           "Venta realizada correctamente.";
   private static final String MENSAJE_REPOSICION_CORRECTA =
           "Stock repuesto correctamente.";
   // ATRIBUTOS
   private String nombreProducto;
   private double precioProducto;
   private int cantidadStock;
   /**
    * Constructor vacío de la clase Producto.
    * Inicializa los atributos con valores por defecto.
    */
   public Producto() {
       this.nombreProducto = "";
       this.precioProducto = PRECIO_INICIAL;
       this.cantidadStock = STOCK_INICIAL;
   }
   /**
    * Constructor que permite crear un producto con sus datos.
    *
    * @param nombre nombre del producto.
    * @param precio precio del producto. Si es negativo, se establece a 0.
    * @param stock cantidad inicial disponible.
    */
   public Producto(String nombre, double precio, int stock) {
       this.nombreProducto = nombre;
       if (precio >= PRECIO_INICIAL) {
           this.precioProducto = precio;
       } else {
           this.precioProducto = PRECIO_INICIAL;
       }
       this.cantidadStock = stock;
   }
   /**
    * Permite vender una cantidad determinada del producto.
    *
    * @param cantidad número de unidades que se desean vender.
    */
   public void vender(int cantidad) {
       if (cantidad <= CANTIDAD_MINIMA) {
           System.out.println(MENSAJE_CANTIDAD_POSITIVA);
       } else if (cantidad > cantidadStock) {
           System.out.println(MENSAJE_STOCK_INSUFICIENTE);
       } else {
           cantidadStock -= cantidad;
           System.out.println(MENSAJE_VENTA_CORRECTA);
       }
   }
   /**
    * Permite aumentar la cantidad de stock del producto.
    *
    * @param cantidad número de unidades que se desean reponer.
    */
   public void reponer(int cantidad) {
       if (cantidad <= CANTIDAD_MINIMA) {
           System.out.println(MENSAJE_CANTIDAD_POSITIVA);
       } else {
           cantidadStock += cantidad;
           System.out.println(MENSAJE_REPOSICION_CORRECTA);
       }
   }
   /**
    * Muestra por pantalla la información del producto:
    * nombre, precio y stock disponible.
    */
   public void mostrarInformacion() {
       System.out.println("Nombre: " + nombreProducto);
       System.out.println("Precio: " + precioProducto + " €");
       System.out.println("Stock: " + cantidadStock);
   }
}

