package teoria;

public class TestVehiculos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Coche coche1 = new Coche("joaquin", 5, true, true);
		Coche coche2 = new Coche("luisa", 7, true, false);
		Motocicleta moto1 = new Motocicleta("pepa", 2, 250);
		System.out.println(coche1);
		System.out.println(coche2);
		System.out.println(moto1);
		System.out.println("Propietario del coche: "+coche1.getPropietario());
		System.out.println("Fecha de compra del coche: "+coche1.getFechaCompra());
		System.out.println("Numero de pasjero de moto1: "+moto1.getNumeroPasajeros());

		
	}

}
