package ro.ase.cts.factory.method.clase;

public class InfirmierFactory implements IPersonalSpitalFactory {

	@Override
	public PersonalSpital getPersonalSpital(String nume) {
		return new Infirmier(nume);
	}

}
