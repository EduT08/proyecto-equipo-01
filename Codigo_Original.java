package proyecto_git;

public class Codigo_Original {
	 public static void main(String[] args) {

	        Producto p1 = new Producto("Portátil", 750, 10);

	        p1.mostrarInformacion();
	        p1.vender(3);
	        p1.reponer(5);
	        p1.mostrarInformacion();
	        p1.vender(20); // No hay suficiente stock
	    }
}
