package ro.ase.cts.facade.clase;

public class VerificatorPersoane {
	public static boolean esteEligibil(Persoana persoana) {
		if(!(persoana.getVarsta() >= 18)) {
			return false;
		}
		
		if(Politie.esteUrmarit(persoana)) {
			return false;
		}
		
		if(BirouCredite.areCredite(persoana)) {
			return false;
		}
		
		return true;
	}
}
