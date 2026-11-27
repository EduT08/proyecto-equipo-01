
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
