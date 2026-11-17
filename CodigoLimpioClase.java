package refactorizado.rename;
public class Producto {
   // AATRIBUTOS
  private String nombreProducto;
  private double precioProducto;
  private int cantidadStock;
   //CONSTRUCTOR VACIO
  public Producto() {
  	this.nombreProducto = "";
  	this.precioProducto = 0;
  	this.cantidadStock = 0;
  }
  // CONSTRUCTOR
  public Producto(String nombre, double precio, int stock) {
      this.nombreProducto = nombre;
      if (precio >= 0) {
          this.precioProducto = precio;
      } else {
          this.precioProducto = 0;
      }
      this.cantidadStock = stock;
  }
  // MÉTODO PARA VENDER PRODUCTOS
  public void vender(int cantidad) {
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
  public void reponer(int cantidad) {
      if (cantidad <= 0) {
          System.out.println("La cantidad debe ser positiva.");
      } else {
      	cantidadStock += cantidad;
          System.out.println("Stock repuesto correctamente.");
      }
  }
  // MÉTODO PARA MOSTRAR INF.
  public void mostrarInformacion() {
      System.out.println("Nombre: " + nombreProducto);
      System.out.println("Precio: " + precioProducto + " €");
      System.out.println("Stock: " + cantidadStock);
  }
}
