package ro.ase.cts.factory.method.clase;

public class AsistentFactory implements IPersonalSpitalFactory {

	@Override
	public PersonalSpital getPersonalSpital(String nume) {
		return new Asistent(nume);
	}

}
