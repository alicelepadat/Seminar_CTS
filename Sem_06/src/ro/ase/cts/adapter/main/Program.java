package ro.ase.cts.adapter.main;

import ro.ase.cts.adapter.clase.*;

public class Program {

	public static void rezervaSiAfiseazaBiletLaCasa(Bilet bilet) {
		bilet.rezervare();
		bilet.vanzare();
	}
	
	public static void rezervaSiAfiseazaBiletOnline(IBiletOnline bilet) {
		bilet.rezervaBiletOnline();
		bilet.vindeBiletOnline();
	}
	
	public static void main(String[] args) {
		Bilet bilet = new Bilet(30f);
		rezervaSiAfiseazaBiletLaCasa(bilet);
		
		IBiletOnline adapter = new BiletAdapter(bilet);
		rezervaSiAfiseazaBiletOnline(adapter);
	}
}
