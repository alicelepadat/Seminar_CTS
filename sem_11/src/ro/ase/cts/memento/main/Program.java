package ro.ase.cts.memento.main;

import ro.ase.cts.memento.clase.ManagerMemento;
import ro.ase.cts.memento.clase.Meci;

public class Program {

	public static void main(String[] args) {
		Meci meci = new Meci("Dinamo", "FCSB", 200, 180, 10, 7);
		ManagerMemento manager = new ManagerMemento();
		manager.adaugaMEmento(meci.creazaMemento());
		
		meci.setNrSpectatori(180);
		manager.adaugaMEmento(meci.creazaMemento());
		
		System.out.println(meci);
		meci.seteazaMemento(manager.cereMemento(0));
		System.out.println(meci);
		meci.seteazaMemento(manager.getLastMemento());
		System.out.println(meci);
	}

}
