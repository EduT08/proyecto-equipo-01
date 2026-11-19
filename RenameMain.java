
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
