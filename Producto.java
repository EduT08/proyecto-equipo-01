package proyecto_git;

public class Producto {
  
   // AATRIBUTOS
   private String nombre;
   private double precio;
   private int stock;
  
   //CONSTRUCTOR VACIO
   public Producto() {
   	this.nombre = "";
   	this.precio = 0;
   	this.stock = 0;
   }
   // CONSTRUCTOR
   public Producto(String nombre, double precio, int stock) {
       this.nombre = nombre;
       if (precio >= 0) {
           this.precio = precio;
       } else {
           this.precio = 0;
       }
       this.stock = stock;
   }
   // MÉTODO PARA VENDER PRODUCTOS
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
   // MÉTODO PARA REPONER PRODUCTOS
   public void reponer(int cantidad) {
       if (cantidad <= 0) {
           System.out.println("La cantidad debe ser positiva.");
       } else {
           stock += cantidad;
           System.out.println("Stock repuesto correctamente.");
       }
   }
   // MÉTODO PARA MOSTRAR INF.
   public void mostrarInformacion() {
       System.out.println("Nombre: " + nombre);
       System.out.println("Precio: " + precio + " €");
       System.out.println("Stock: " + stock);
   }
}
