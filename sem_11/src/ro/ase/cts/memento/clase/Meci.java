package ro.ase.cts.memento.clase;

public class Meci {
	private String echipaGazde;
	private String echipaOaspeti;
	private int nrBileteVandute;
	private int nrSpectatori;
	private int nrJandarmi;
	private int nrStewarzi;
	public Meci(String echipaGazde, String echipaOaspeti, int nrBileteVandute, int nrSpectatori, int nrJandarmi,
			int nrStewarzi) {
		super();
		this.echipaGazde = echipaGazde;
		this.echipaOaspeti = echipaOaspeti;
		this.nrBileteVandute = nrBileteVandute;
		this.nrSpectatori = nrSpectatori;
		this.nrJandarmi = nrJandarmi;
		this.nrStewarzi = nrStewarzi;
	}
	public void setEchipaGazde(String echipaGazde) {
		this.echipaGazde = echipaGazde;
	}
	public void setEchipaOaspeti(String echipaOaspeti) {
		this.echipaOaspeti = echipaOaspeti;
	}
	public void setNrBileteVandute(int nrBileteVandute) {
		this.nrBileteVandute = nrBileteVandute;
	}
	public void setNrSpectatori(int nrSpectatori) {
		this.nrSpectatori = nrSpectatori;
	}
	public void setNrJandarmi(int nrJandarmi) {
		this.nrJandarmi = nrJandarmi;
	}
	public void setNrStewarzi(int nrStewarzi) {
		this.nrStewarzi = nrStewarzi;
	}
	@Override
	public String toString() {
		return "Meci [echipaGazde=" + echipaGazde + ", echipaOaspeti=" + echipaOaspeti + ", nrBileteVandute="
				+ nrBileteVandute + ", nrSpectatori=" + nrSpectatori + ", nrJandarmi=" + nrJandarmi + ", nrStewarzi="
				+ nrStewarzi + "]";
	}
	
	public Memento creazaMemento() {
		return new Memento(this.nrSpectatori, this.echipaGazde, this.echipaOaspeti);
	}
	
	public void seteazaMemento(Memento memento) {
		this.nrSpectatori = memento.getNrSpectatori();
		this.echipaGazde = memento.getEchipaGazda();
		this.echipaOaspeti = memento.getEchipaOaspeti();
	}
}
