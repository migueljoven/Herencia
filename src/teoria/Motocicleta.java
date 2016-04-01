package teoria;

public class Motocicleta extends Vehiculo {
	private int cilindrada;

	/**
	 * @param numeroRuedas
	 * @param Propietario
	 * @param numeroPasajeros
	 * @param cilindrada
	 */
	public Motocicleta(String Propietario, int numeroPasajeros, int cilindrada) {
		super(2, Propietario, numeroPasajeros);
		this.cilindrada = cilindrada;
	}

	/**
	 * @return the cilindrada
	 */
	public int getCilindrada() {
		return cilindrada;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Motocicleta [cilindrada=" + cilindrada + ", Propietario=" + getPropietario()
				+ ", NumeroRuedas=" + getNumeroRuedas() + ", FechaCompra=" + getFechaCompra()
				+ ", NumeroPasajeros=" + getNumeroPasajeros() + "]";
	}
}
