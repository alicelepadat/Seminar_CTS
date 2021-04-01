package ro.ase.cts.builder.clase;

public class RezervareBuilder implements IBuilder {
	
	private Rezervare rezervare;
	
	public RezervareBuilder() {
		super();
		this.rezervare = new Rezervare(0, false, false, false, false, "");
	}
	
	public RezervareBuilder(int codRezervare) {
		super();
		this.rezervare = new Rezervare(codRezervare, false, false, false, false, "");
	}

	@Override
	public Rezervare build() {
		return rezervare;
	}
	
	public RezervareBuilder setCodRezervare(int codRezervare) {
		rezervare.setCodRezervare(codRezervare);
		return this;
	}
	
	public RezervareBuilder setAreMancare(boolean areMancare) {
		rezervare.setAreMancare(areMancare);;
		return this;
	}
	
	public RezervareBuilder setAreScaunErgonomic(boolean areScaunErgonomic) {
		rezervare.setAreScaunErgonimc(areScaunErgonomic);
		return this;
	}
	
	public RezervareBuilder setAreBautura(boolean areBautura) {
		rezervare.setAreBautura(areBautura);
		return this;
	}
	
	public RezervareBuilder setAreMuzicaAmbientala(boolean areMuzicaAmbientala) {
		rezervare.setAreMuzicaAmbientala(areMuzicaAmbientala);
		return this;
	}

	public RezervareBuilder setGenMuzica(String genMuzica) {
		rezervare.setGenMuzica(genMuzica);
		return this;
	}
}
