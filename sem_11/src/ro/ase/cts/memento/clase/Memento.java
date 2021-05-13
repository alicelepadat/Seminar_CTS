package ro.ase.cts.memento.clase;

public class Memento {
	private int nrSpectatori;
	private String echipaGazda;
	private String echipaOaspeti;
	
	
	public Memento(int nrSpectatori, String echipaGazda, String echipaOasp) {
		super();
		this.nrSpectatori = nrSpectatori;
		this.echipaGazda = echipaGazda;
		this.echipaOaspeti = echipaOasp;
	}


	public int getNrSpectatori() {
		return nrSpectatori;
	}


	public String getEchipaGazda() {
		return echipaGazda;
	}


	public String getEchipaOaspeti() {
		return echipaOaspeti;
	}
	
	
}
