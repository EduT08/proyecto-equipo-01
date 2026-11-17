package extract_method;

/**
 * Clase que representa un producto de una tienda.
 * Permite gestionar su nombre, precio y stock,
 * además de realizar ventas y reposiciones.
 */
public class Producto_2 {

   // ATRIBUTOS
   private String nombre;
   private double precio;
   private int stock;

   /**
    * Constructor vacío de la clase Producto.
    * Inicializa los atributos con valores por defecto.
    */
   public Producto_2() {
       this.nombre = "";
       this.precio = 0;
       this.stock = 0;
   }

   /**
    * Constructor que permite crear un producto con sus datos.
    *
    * @param nombre nombre del producto.
    * @param precio precio del producto. Si es negativo, se establece a 0.
    * @param stock cantidad inicial disponible.
    */
   public Producto_2(String nombre, double precio, int stock) {
       this.nombre = nombre;

       if (precio >= 0) {
           this.precio = precio;
       } else {
           this.precio = 0;
       }

       this.stock = stock;
   }

   /**
    * Permite vender una cantidad determinada del producto.
    *
    * @param cantidad número de unidades que se desean vender.
    */
   public void vender(int cantidad) {
       if (cantidad <= 0) {
           System.out.println("La cantidad debe ser positiva.");
       } else if (cantidad > stock) {
           System.out.println("No hay suficiente stock.");
       } else {
           stock -= cantidad;
           System.out.println("Venta realizada correctamente.");
       }
   }

   /**
    * Permite aumentar la cantidad de stock del producto.
    *
    * @param cantidad número de unidades que se desean reponer.
    */
   public void reponer(int cantidad) {
       if (cantidad <= 0) {
           System.out.println("La cantidad debe ser positiva.");
       } else {
           stock += cantidad;
           System.out.println("Stock repuesto correctamente.");
       }
   }

   /**
    * Muestra por pantalla la información del producto:
    * nombre, precio y stock disponible.
    */
   public void mostrarInformacion() {
       System.out.println("Nombre: " + nombre);
       System.out.println("Precio: " + precio + " €");
       System.out.println("Stock: " + stock);
   }
}
