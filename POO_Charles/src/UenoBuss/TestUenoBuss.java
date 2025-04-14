package UenoBuss;

public class TestUenoBuss {
	public static void main(String[] args) {
		
   //tipo nombre = new Constructor
		Usuario pasajero = new Usuario ();
		pasajero.setNombre("Leonor");
		pasajero.setCedula(5456879);
		pasajero.settelefono("0981456891");
	System.out.println("Pasajero : " + pasajero.getNombre());
	
	//crear tarjeta 
	Tarjeta tarjeta999 = new Tarjeta("999", pasajero);
	//cargar saldo 
	Transaccion t1 = new Transaccion ("recarga",10000, "26/03/2025",tarjeta999);
    
	if(t1.procesar()) {
		System.out.println("Transaccion aceptada");
	}else {
		System.out.println("ERROR,No se pudo procesar");
	}
    System.out.println("Tu Saldo actual es: " + tarjeta999.getSaldo());
    
    System.out.println("--------------------------------------------------");
    //SEGUNDA TRANSACCION
    Transaccion t2 = new Transaccion("viaje",850000, "26/03/2025",tarjeta999);
    if(t2.procesar()) {
		System.out.println("Transaccion aceptada");
	}else {
		System.out.println("ERROR,No se pudo procesar");
	}
    System.out.println("Tu Saldo actual es: " + tarjeta999.getSaldo());
	}
}
