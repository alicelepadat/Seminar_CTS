package ro.ase.cts.simple.factory.clase;

public class FactoryPersonal {
	public PersonalSpital createPersonal(TipPersonal tipPersonal, String nume) {
		switch(tipPersonal) {
		case Brancardier:
			return new Brancardier(nume);
		case Asistent:
			return new Asistent(nume);
		case Medic:
			return new Medic(nume);
		default:
			throw new IllegalArgumentException();
		}
	}
}
