
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

