package ro.ase.cts.builder.main;

import ro.ase.cts.builder.clase.*;

public class Program {

	public static void main(String[] args) {
		
		Rezervare rezervare1 = new RezervareBuilder().setCodRezervare(100).setAreBautura(true).build();
		Rezervare rezervare2 = new RezervareBuilder().setCodRezervare(110).setAreMancare(true).setAreScaunErgonomic(true).build();
		
		Rezervare rezervare3 = new Rezervare(120, true, true, true, false, "");
		
		Rezervare rezervare4 = new RezervareBuilder(130).setAreBautura(true).setAreMuzicaAmbientala(true).setGenMuzica("pop").build();
		
				
		System.out.println(rezervare1);
		System.out.println(rezervare2);
		System.out.println(rezervare3);
		System.out.println(rezervare4);
		
		RezervareBuilderV2 rbv2 = new RezervareBuilderV2().setAreMancare(true).setAreBautura(true).setAreScaunErgonomic(true);
		Rezervare rezervare5 = rbv2.setCodRezervare(140).build();
		Rezervare rezervare6 = rbv2.setCodRezervare(150).build();
		
		System.out.println(rezervare5);
		System.out.println(rezervare6);
	}

}
