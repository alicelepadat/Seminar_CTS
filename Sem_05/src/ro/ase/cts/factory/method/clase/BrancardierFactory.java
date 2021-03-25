package ro.ase.cts.factory.method.clase;

public class BrancardierFactory implements IPersonalSpitalFactory {
	@Override
	public PersonalSpital getPersonalSpital(String nume) {
		return new Brancardier(nume);
	}
}
