package ro.ase.cts.composite.clase;

public class Filiala implements ISediu {
	private String nume;
	
	

	public Filiala(String nume) {
		super();
		this.nume = nume;
	}

	@Override
	public void afiseazaDescriere() {
		System.out.println("Filiala "+ nume);
		
	}

	@Override
	public void adaugaNod(ISediu sediu) throws Exception {
		throw new Exception("Nu este implementata");
		
	}

	@Override
	public void stergeNod(ISediu sediu) throws Exception {
		throw new Exception("Nu este implementata");
		
	}

	@Override
	public ISediu getNod(int poz) throws Exception {
		throw new Exception("Nu este implementata");
	}

}
