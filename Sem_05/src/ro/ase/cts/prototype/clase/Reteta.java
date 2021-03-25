package ro.ase.cts.prototype.clase;

public class Reteta implements IPrototype {
	private String denumireSolutie;
	private int cantitateSolutie;
	
	
	public Reteta(String denumireSolutie, int cantitateSolutie) {
		// TODO validari
		this.denumireSolutie = denumireSolutie;
		this.cantitateSolutie = cantitateSolutie;
	}

	private Reteta() {
		//nu mai face validari
	}
	
	@Override
	public String toString() {
		return "Reteta [denumireSolutie=" + denumireSolutie + ", cantitate=" + cantitateSolutie + "]";
	}

	@Override
	public IPrototype copy() {
		Reteta copie = new Reteta();
		copie.cantitateSolutie = this.cantitateSolutie;
		copie.denumireSolutie = this.denumireSolutie;
		return copie;
	}
	
}
