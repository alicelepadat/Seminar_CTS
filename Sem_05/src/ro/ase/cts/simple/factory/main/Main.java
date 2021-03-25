package ro.ase.cts.simple.factory.main;

import ro.ase.cts.simple.factory.clase.FactoryPersonal;
import ro.ase.cts.simple.factory.clase.PersonalSpital;
import ro.ase.cts.simple.factory.clase.TipPersonal;

public class Main {

	public static void main(String[] args) {
		FactoryPersonal factoryPersonal = new FactoryPersonal();
		
		PersonalSpital asistent = factoryPersonal.createPersonal(TipPersonal.Asistent, "Marius");
		PersonalSpital medic = factoryPersonal.createPersonal(TipPersonal.Medic, "Alina");
		
		System.out.println(asistent);
		System.out.println(medic);
	}

}
