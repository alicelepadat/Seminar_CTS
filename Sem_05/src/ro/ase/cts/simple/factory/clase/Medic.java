package ro.ase.cts.simple.factory.clase;

public class Medic extends PersonalSpital {
	public Medic(String nume) {
		super(nume);
	}

	@Override
	public String toString() {
		return "Medic: " + super.getNume();
	}
	
}
