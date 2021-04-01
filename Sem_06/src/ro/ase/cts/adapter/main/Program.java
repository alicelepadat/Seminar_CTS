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
		//daca primim in cerinta clasa abstracta -> adapter de obiecte
		//daca primim interfata -> adapter de clasa
		Bilet bilet = new Bilet(30f);
		rezervaSiAfiseazaBiletLaCasa(bilet);
		
		IBiletOnline biletOnline = new BiletAdapter(bilet);
		rezervaSiAfiseazaBiletOnline(biletOnline);
		
		IBiletOnline biletOnlineClasa = new BiletAdapterClase(50);
		rezervaSiAfiseazaBiletOnline(biletOnlineClasa);
	}
}
