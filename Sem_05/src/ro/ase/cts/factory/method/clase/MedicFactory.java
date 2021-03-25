package ro.ase.cts.factory.method.clase;

public class MedicFactory implements IPersonalSpitalFactory{
	@Override
	public PersonalSpital getPersonalSpital(String nume) {
		return new Medic(nume);
	}
}
