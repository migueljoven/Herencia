package teoria;

import java.time.LocalDate;
public class Vehiculo {
	private int numeroRuedas;
	private String Propietario;
	private LocalDate fechaCompra;
	private int numeroPasajeros;
	/**
	 * @param numeroRuedas
	 * @param fechaCompra
	 * @param Propietario
	 * @param numeroPasajeros
	 */
	public Vehiculo(int numeroRuedas, String Propietario, int numeroPasajeros) {	
		this.numeroRuedas = numeroRuedas;
		this.Propietario = Propietario;
		this.numeroPasajeros = numeroPasajeros;
		this.fechaCompra = LocalDate.now();
	}
	/**
	 * @return the propietario
	 */
	public String getPropietario() {
		return Propietario;
	}
	/**
	 * @param propietario the propietario to set
	 */
	public void setPropietario(String propietario) {
		Propietario = propietario;
	}
	/**
	 * @return the numeroRuedas
	 */
	public int getNumeroRuedas() {
		return numeroRuedas;
	}
	/**
	 * @return the fechaCompra
	 */
	public LocalDate getFechaCompra() {
		return fechaCompra;
	}
	/**
	 * @return the numeroPasajeros
	 */
	public int getNumeroPasajeros() {
		return numeroPasajeros;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Vehiculo [numeroRuedas=" + numeroRuedas + ", Propietario=" + Propietario + ", fechaCompra="
				+ fechaCompra + ", numeroPasajeros=" + numeroPasajeros + "]";
	}
	
	
}


