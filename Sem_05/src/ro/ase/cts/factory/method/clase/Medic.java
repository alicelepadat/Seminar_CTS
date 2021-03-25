package ro.ase.cts.factory.method.clase;

public class Medic extends PersonalSpital {
	public Medic(String nume) {
		super(nume);
	}

	@Override
	public String toString() {
		return "Medic: " + super.getNume();
	}
	
}
