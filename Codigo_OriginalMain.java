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
