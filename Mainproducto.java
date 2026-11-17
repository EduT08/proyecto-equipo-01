package extract_constant;

public class Mainproducto {

    // CONSTANTES
    private static final String NOMBRE_PRODUCTO = "Portátil";
    private static final double PRECIO_PRODUCTO = 750;
    private static final int STOCK_PRODUCTO = 10;

    private static final int CANTIDAD_VENTA = 3;
    private static final int CANTIDAD_REPOSICION = 5;
    private static final int CANTIDAD_VENTA_EXCESIVA = 20;

    public static void main(String[] args) {
        Producto p1 = new Producto(
            NOMBRE_PRODUCTO,
            PRECIO_PRODUCTO,
            STOCK_PRODUCTO
        );

        p1.mostrarInformacion();
        p1.vender(CANTIDAD_VENTA);
        p1.reponer(CANTIDAD_REPOSICION);
        p1.mostrarInformacion();
        p1.vender(CANTIDAD_VENTA_EXCESIVA);
    }
}
