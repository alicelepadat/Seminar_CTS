package ro.ase.cts.prototype.main;

import ro.ase.cts.prototype.clase.Reteta;

public class Main {

	public static void main(String[] args) {
		Reteta reteta = new Reteta("Acid hialuronic", 40);
		Reteta copie = (Reteta)reteta.copy();
		
		System.out.println(reteta);
		System.out.println(copie);
	}
}
