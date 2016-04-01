package teoria;

public class Coche extends Vehiculo {
	private boolean diesel;
	private boolean descapotable;
	/**
	 * @param Propietario
	 * @param numeroPasajeros
	 * @param diesel
	 * @param descapotable
	 */
	public Coche(String Propietario, int numeroPasajeros, boolean diesel, boolean descapotable) {
		super(4, Propietario, numeroPasajeros);
		this.diesel = diesel;
		this.descapotable = descapotable;
	}
	/**
	 * @return the diesel
	 */
	public boolean isDiesel() {
		return diesel;
	}
	/**
	 * @return the descapotable
	 */
	public boolean isDescapotable() {
		return descapotable;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Coche [diesel=" + diesel + ", descapotable=" + descapotable + "]";
	}

	

		
}
