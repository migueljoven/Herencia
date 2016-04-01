package teoria;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.List;

public class Auxiliar {
	private static File archivo = new File("Archivos/datos");
	public static void guardarDatos(List<Motocicleta> lista) {
		try (PrintWriter out = new PrintWriter(archivo);) {
			out.printf("%s,%s,%s,%s,%s%n","Nº RUEDAS","FECHA COMPRA","PROPIETARIO","Nº PASAJEROS","CILINDRADA");
			out.flush();
			for (Motocicleta motocicleta : lista) {
				out.printf("%d,%s,%s,%d,%d%n",motocicleta.getNumeroRuedas(),
						motocicleta.getFechaCompra(),motocicleta.getPropietario(),
						motocicleta.getNumeroPasajeros(),motocicleta.getCilindrada());
				out.flush();
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			//
			System.out.println("Error en la carga del fichero");
		}
	}
}
