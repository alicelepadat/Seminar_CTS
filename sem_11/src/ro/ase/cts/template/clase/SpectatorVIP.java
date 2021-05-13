package ro.ase.cts.template.clase;

public class SpectatorVIP extends SpectatorAbstract{
	private String nume;

	public SpectatorVIP(String nume) {
		super();
		this.nume = nume;
	}

	@Override
	public void asezareLaCoada() {
		System.out.println("Spectatorul VIP "+this.nume+" s-a asezat la coada VIP.");
	}

	@Override
	public void prezentareBilet() {
		System.out.println("Spectatorul VIP "+this.nume+" prezinta biletul VIP.");
	}

	@Override
	public void realizareControlCorporal() {
		System.out.println("Spectatorul VIP "+this.nume+" a trecut de controlul corporal la sectiunea VIP.");
	}

	@Override
	public void ocupaLocul() {
		System.out.println("Spectatorul VIP "+this.nume+" a ocupat locul in sectiunea VIP.");
	}
}
