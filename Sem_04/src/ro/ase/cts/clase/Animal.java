package ro.ase.cts.clase;

public class Animal {
	private String denumire;
	private int varsta;
	private float greutate;
	
	private static Animal instanta = null;

	private Animal() {
		this.denumire="animal";
		this.varsta=1;
		this.greutate=1f;
	}

	private Animal(String denumire, int varsta, float greutate) {
		super();
		this.denumire = denumire;
		this.varsta = varsta;
		this.greutate = greutate;
	}
	
	public static synchronized Animal getInstance(String nume, int varsta, float greutate) {
		if(instanta == null) {
			instanta = new Animal(nume, varsta, greutate);
		}
		
		return instanta;
	}

	public void setDenumire(String denumire) {
		this.denumire = denumire;
	}

	public void setVarsta(int varsta) {
		this.varsta = varsta;
	}

	public void setGreutate(float greutate) {
		this.greutate = greutate;
	}


	@Override
	public String toString() {
		return "Animal [denumire=" + denumire + ", varsta=" + varsta + ", greutate=" + greutate + "]";
	}
}
