import java.util.Scanner;

public class Obsoleto {
	
	public static String pedirFecha() {
		Scanner entrada = new Scanner(System.in);
		String fecha;
		System.out.println("Introduce una fecha formateada de esta manera ej: '8 de septiembre de 1636'");
		fecha = entrada.next();
		return fecha;
	}
	
	public static String[] dividirFecha(String fecha) {
		fecha = pedirFecha();
		String[] fechaDividida = (fecha.split(" "));
		return fechaDividida;
	}

	public static void main(String[] args) {
		String[] fechaDividida = dividirFecha(pedirFecha());
		String Fecha = new String(fechaDividida);

	}

}
