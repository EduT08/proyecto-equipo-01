# proyecto-equipo-01: [Producto]
El proyecto consiste en el cálculo y muestra de información de stock de productos de una tienda de informática, conteniendo como atributos el nombre del producto, su precio y stock de la unidad y como métodos vender, reponer o mostrar información. Como condiciones, no se podrá vender más unidades de las disponibles, no se repondrá stock en negativo y su precio no puede ser negativo.

## Integrantes del equipo
* **Eduardo** - Líder de Git
* **Candela** - Refactorización Java
* **Lucía** - Desarrollo Web
* **Erika** - Pruebas y Documentación
## Mejoras realizadas en el código (Antes y Después)
**Antes**
* Código Original
     -Class:
        package original;
public class Producto {
  
   // ATRIBUTOS
   private String nombre;
   private double precio;
   private int stock;
  
   //CONSTRUCTOR VACÍO
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
  
  
,   //SETTER Y GETTER
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
	public String mostrarInformación() {
		return "\nNombre=" + nombre + " \nPrecio=" + precio + "\nStock=" + stock + "";
	}
}

    -Main:
            package original;
public class Mainproducto {
   public static void main(String[] args) {
   	
   	//CREAMOS OBJETO
       Producto p1 = new Producto("Portátil", 750, 10);
      
       // MOSTRAR INFORMACIÓN INICIAL
       System.out.println("INFORMACIÓN INICIAL");
       System.out.println(p1.mostrarInformación());
       // VENDER PRODUCTOS
       System.out.println("\n--- VENDER ---");
       p1.vender(3);
       // MOSTRAR INFORMACIÓN DESPUÉS DE VENDER
       System.out.println(p1.mostrarInformación());
       // REPONER PRODUCTOS
       System.out.println("\n--- REPONER ---");
       p1.reponer(5);
       // MOSTRAR INFORMACIÓN FINAL
       System.out.println(p1.mostrarInformación());
       // PROBAR UNA VENTA CON MÁS STOCK DEL DISPONIBLE
       System.out.println("\n--- PROBAMOS UNA VENTA CON MÁS STOCK DEL DISPONIBLE ---");
       p1.vender(20);
       System.out.println("INFORMACIÓN FINAL");
       System.out.println(p1.mostrarInformación());
   }
}

**Después**
* Método 1 de refactorización de código Java (cambiar nombres):
    -Class:
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

    -Main:
        package refactorizado.rename;
public class ProductoMain {
   public static void main(String[] args) {
       // CREAMOS OBJETO
       Producto producto1 = new Producto("Portátil", 750, 10);
       // MOSTRAR INFORMACIÓN INICIAL
       System.out.println("INFORMACIÓN INICIAL");
       System.out.println(producto1.obtenerInformacion());
       // VENDER PRODUCTOS
       System.out.println("\n--- VENDER ---");
       producto1.realizarVenta(3);
       // MOSTRAR INFORMACIÓN DESPUÉS DE VENDER
       System.out.println(producto1.obtenerInformacion());
       // REPONER PRODUCTOS
       System.out.println("\n--- REPONER ---");
       producto1.reponerStock(5);
       // MOSTRAR INFORMACIÓN FINAL
       System.out.println(producto1.obtenerInformacion());
       // PROBAR UNA VENTA CON MÁS STOCK DEL DISPONIBLE
       System.out.println("\n--- PROBAMOS UNA VENTA CON MÁS STOCK DEL DISPONIBLE ---");
       producto1.realizarVenta(20);
       System.out.println("\nINFORMACIÓN FINAL");
       System.out.println(producto1.obtenerInformacion());
   }
}





* Método 2 de refactorización de código Java (crear constantes):
    -Class:
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

    -Main:
package refactorizado.ExtractConstant;
public class Mainproducto {
   // CONSTANTES
   private static final String NOMBRE_PRODUCTO = "Portátil";
   private static final double PRECIO_PRODUCTO = 750;
   private static final int STOCK_PRODUCTO = 10;
   private static final int CANTIDAD_VENDER = 3;
   private static final int CANTIDAD_REPONER = 5;
   private static final int VENTA_EXCESIVA = 20;
   public static void main(String[] args) {
       // CREAMOS OBJETO
       Producto p1 = new Producto(
               NOMBRE_PRODUCTO,
               PRECIO_PRODUCTO,
               STOCK_PRODUCTO
       );
       // MOSTRAR INFORMACIÓN INICIAL
       System.out.println("INFORMACIÓN INICIAL");
       System.out.println(p1.mostrarInformación());
       // VENDER PRODUCTOS
       System.out.println("\n--- VENDER ---");
       p1.vender(CANTIDAD_VENDER);
       // MOSTRAR INFORMACIÓN DESPUÉS DE VENDER
       System.out.println(p1.mostrarInformación());
       // REPONER PRODUCTOS
       System.out.println("\n--- REPONER ---");
       p1.reponer(CANTIDAD_REPONER);
       // MOSTRAR INFORMACIÓN FINAL
       System.out.println(p1.mostrarInformación());
       // PROBAR UNA VENTA CON MÁS STOCK DEL DISPONIBLE
       System.out.println("\n--- PROBAMOS UNA VENTA CON MÁS STOCK DEL DISPONIBLE ---");
       p1.vender(VENTA_EXCESIVA);
       System.out.println("INFORMACIÓN FINAL");
       System.out.println(p1.mostrarInformación());
   }
}

* Método 3 de refactorización de código Java (dividir métodos):
    -Class
        package refactorizado.ExtractMethod;
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
           mostrarMensaje(MENSAJE_CANTIDAD);
       } else if (cantidad > stock) {
           mostrarMensaje(MENSAJE_STOCK);
       } else {
           descontarStock(cantidad);
           mostrarMensaje(MENSAJE_VENTA);
       }
   }
   // MÉTODO EXTRAÍDO PARA DESCONTAR EL STOCK
   private void descontarStock(int cantidad) {
       stock -= cantidad;
   }
   // MÉTODO PARA REPONER PRODUCTOS
   public void reponer(int cantidad) {
       if (cantidad <= 0) {
           mostrarMensaje(MENSAJE_CANTIDAD);
       } else {
           aumentarStock(cantidad);
           mostrarMensaje(MENSAJE_REPOSICION);
       }
   }
   // MÉTODO EXTRAÍDO PARA AUMENTAR EL STOCK
   private void aumentarStock(int cantidad) {
       stock += cantidad;
   }
   // MÉTODO EXTRAÍDO PARA MOSTRAR MENSAJES
   private void mostrarMensaje(String mensaje) {
       System.out.println(mensaje);
   }
   // MÉTODO PARA MOSTRAR INFORMACIÓN
   public String mostrarInformación() {
       return obtenerInformacionProducto();
   }
   // MÉTODO EXTRAÍDO PARA OBTENER LA INFORMACIÓN
   private String obtenerInformacionProducto() {
       return "\nNombre=" + nombre
               + "\nPrecio=" + precio
               + "\nStock=" + stock;
   }
}

    -Main
package refactorizado.ExtractMethod;
public class Mainproducto {
   // CONSTANTES
   private static final String NOMBRE_PRODUCTO = "Portátil";
   private static final double PRECIO_PRODUCTO = 750;
   private static final int STOCK_PRODUCTO = 10;
   private static final int CANTIDAD_VENDER = 3;
   private static final int CANTIDAD_REPONER = 5;
   private static final int VENTA_EXCESIVA = 20;
   public static void main(String[] args) {
       Producto p1 = crearProducto();
       mostrarInformacionInicial(p1);
       realizarVenta(p1);
       realizarReposicion(p1);
       probarVentaExcesiva(p1);
   }
   // MÉTODO EXTRAÍDO PARA CREAR EL PRODUCTO
   public static Producto crearProducto() {
       return new Producto(NOMBRE_PRODUCTO, PRECIO_PRODUCTO, STOCK_PRODUCTO);
   }
   // MÉTODO EXTRAÍDO PARA MOSTRAR INFORMACIÓN INICIAL
   public static void mostrarInformacionInicial(Producto p1) {
       System.out.println("INFORMACIÓN INICIAL");
       System.out.println(p1.mostrarInformación());
   }
   // MÉTODO EXTRAÍDO PARA REALIZAR UNA VENTA
   public static void realizarVenta(Producto p1) {
       System.out.println("\n--- VENDER ---");
       p1.vender(CANTIDAD_VENDER);
       System.out.println(p1.mostrarInformación());
   }
   // MÉTODO EXTRAÍDO PARA REALIZAR UNA REPOSICIÓN
   public static void realizarReposicion(Producto p1) {
       System.out.println("\n--- REPONER ---");
       p1.reponer(CANTIDAD_REPONER);
       System.out.println(p1.mostrarInformación());
   }
   // MÉTODO EXTRAÍDO PARA PROBAR UNA VENTA EXCESIVA
   public static void probarVentaExcesiva(Producto p1) {
       System.out.println("\n--- PROBAMOS UNA VENTA CON MÁS STOCK DEL DISPONIBLE ---");
       p1.vender(VENTA_EXCESIVA);
       System.out.println("INFORMACIÓN FINAL");
       System.out.println(p1.mostrarInformación());
   }
}

* Rename: hemos cambiado los nombres de algunas variables y métodos para que sean más claros y fáciles de entender.

* Extract Constant: hemos creado constantes para guardar valores y mensajes que se utilizan varias veces en el programa.

* Extract Method: hemos dividido partes del código en métodos más pequeños para que esté mejor organizado y sea más fácil de mantener.
## Evidencia del trabajo en equipo (Git Log)
![EvidenciaGitOneLine](/home/erika/Documentos/IAC/1ºDAW/ENT/T04/img/gitlogOneline.png)
