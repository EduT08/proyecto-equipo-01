package refactorizado.ExtractConstant;
public class Producto {
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
   // CONSTRUCTOR VACÍO
   public Producto() {
       this.nombreProducto = "";
       this.precioProducto = PRECIO_INICIAL;
       this.cantidadStock = STOCK_INICIAL;
   }
   // CONSTRUCTOR
   public Producto(String nombre, double precio, int stock) {
       this.nombreProducto = nombre;
       if (precio >= PRECIO_INICIAL) {
           this.precioProducto = precio;
       } else {
           this.precioProducto = PRECIO_INICIAL;
       }
       this.cantidadStock = stock;
   }
   // MÉTODO PARA VENDER PRODUCTOS
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
   // MÉTODO PARA REPONER PRODUCTOS
   public void reponer(int cantidad) {
       if (cantidad <= CANTIDAD_MINIMA) {
           System.out.println(MENSAJE_CANTIDAD_POSITIVA);
       } else {
           cantidadStock += cantidad;
           System.out.println(MENSAJE_REPOSICION_CORRECTA);
       }
   }
   // MÉTODO PARA MOSTRAR INFORMACIÓN
   public void mostrarInformacion() {
       System.out.println("Nombre: " + nombreProducto);
       System.out.println("Precio: " + precioProducto + " €");
       System.out.println("Stock: " + cantidadStock);
   }
}

