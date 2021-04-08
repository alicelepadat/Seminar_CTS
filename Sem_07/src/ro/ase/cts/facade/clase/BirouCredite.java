package ro.ase.cts.facade.clase;

class BirouCredite {
	
	public static boolean areCredite(Persoana persoana) {
		return Integer.parseInt(persoana.getCnp().charAt(11)+ "") % 2 == 0;
	}
}
