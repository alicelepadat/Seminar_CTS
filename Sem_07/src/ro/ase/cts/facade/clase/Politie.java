package ro.ase.cts.facade.clase;

class Politie {
	
	public static boolean esteUrmarit(Persoana persoana) {
		return Integer.parseInt(persoana.getCnp().charAt(10)+ "") % 2 == 0;
	}
}
