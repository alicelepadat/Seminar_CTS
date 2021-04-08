package ro.ase.cts.facade.main;

import ro.ase.cts.facade.clase.Persoana;
import ro.ase.cts.facade.clase.VerificatorPersoane;

public class Program {

	public static void main(String[] args) {
		
		Persoana persoana = new Persoana("Alice Lepadat", "2990613156754");
		
		if(VerificatorPersoane.esteEligibil(persoana)) {
			System.out.println("Persoana este eligibila");
		}
		else {
			System.out.println("Persoana nu este eligibila");
		}
	}

}
