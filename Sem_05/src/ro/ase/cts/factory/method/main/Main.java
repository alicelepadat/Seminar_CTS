package ro.ase.cts.factory.method.main;

import ro.ase.cts.factory.method.clase.*;

public class Main {

	//clientul
	public static void afisarePersonalSpital(IPersonalSpitalFactory factory, String nume) {
		PersonalSpital personalSpital = factory.getPersonalSpital(nume);
		
		System.out.println(personalSpital);
	}
	
	public static void main(String[] args) {
		afisarePersonalSpital(new AsistentFactory(), "Mihai");
		afisarePersonalSpital(new MedicFactory(), "Monica");
		afisarePersonalSpital(new InfirmierFactory(), "Maria");
	}
}
