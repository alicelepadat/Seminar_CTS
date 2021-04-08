package ro.ase.cts.facade.clase;

import java.time.LocalDate;

public class Persoana {
	private String nume;
	private String cnp;
	
	public Persoana(String nume, String cnp) {
		super();
		this.nume = nume;
		this.cnp = cnp;
	}

	public String getNume() {
		return nume;
	}

	public String getCnp() {
		return cnp;
	}
	
	public int getVarsta() {
		int an = 0;
		if(cnp.charAt(0)=='1'|| cnp.charAt(0)=='2') {
			an=(1900 + Integer.parseInt("" + cnp.charAt(1) + cnp.charAt(2)));
		}
		if(cnp.charAt(0)=='3'|| cnp.charAt(0)=='4') {
			an=(1800 + Integer.parseInt("" + cnp.charAt(1) + cnp.charAt(2)));
		}
		if(cnp.charAt(0)=='5'|| cnp.charAt(0)=='6') {
			an=(2000 + Integer.parseInt("" + cnp.charAt(1) + cnp.charAt(2)));
		}
		return LocalDate.now().getYear() - an;
	}
}
