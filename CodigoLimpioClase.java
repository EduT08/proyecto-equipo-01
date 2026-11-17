package rename;

public class CodigoLimpioClase {
	  
	   // AATRIBUTOS
	   private String name;
	   private double price;
	   private int cantidadStock;
	  
	   //CONSTRUCTOR VACIO
	   public CodigoLimpioClase() {
	   	this.name = "";
	   	this.price = 0;
	   	this.cantidadStock = 0;
	   }
	   // CONSTRUCTOR
	   public CodigoLimpioClase(String nombre, double precio, int stock) {
	       this.name = nombre;
	       if (precio >= 0) {
	           this.price = precio;
	       } else {
	           this.price = 0;
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
	       System.out.println("Nombre: " + name);
	       System.out.println("Precio: " + price + " €");
	       System.out.println("Stock: " + cantidadStock);
	   }
	}
