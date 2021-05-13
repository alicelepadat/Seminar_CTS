package ro.ase.cts.template.clase;

public abstract class SpectatorAbstract {
	public abstract void asezareLaCoada();
	public abstract void prezentareBilet();
	public abstract void realizareControlCorporal();
	public abstract void ocupaLocul();
	
	public final void intrareStation() {
		asezareLaCoada();
		prezentareBilet();
		realizareControlCorporal();
		ocupaLocul();
	}
}
