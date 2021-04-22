package ro.ase.cts.main;

import ro.ase.cts.clase.*;

public class Program {

	public static void main(String[] args) {
		Rezervare rezervare1 = new Rezervare(10, 4, 13);
		Rezervare rezervare2 = new Rezervare(11, 2, 10);
		Rezervare rezervare3 = new Rezervare(12, 5, 12);
		Rezervare rezervare4 = new Rezervare(13, 2, 20);
		
		FlyweightFactory flyweightFactory = new FlyweightFactory();
		
		flyweightFactory.getFlyweight("0722").printeazaRezervare(rezervare1);
		flyweightFactory.getFlyweight("0722").printeazaRezervare(rezervare2);
		flyweightFactory.getFlyweight("0733").printeazaRezervare(rezervare3);
		flyweightFactory.getFlyweight("0733").printeazaRezervare(rezervare4);
	}
}
