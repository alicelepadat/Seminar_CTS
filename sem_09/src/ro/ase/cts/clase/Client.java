package ro.ase.cts.clase;

public class Client implements IFlyweight{
	private String nume;
	private String nrTelefon;
	private String email;
	
	

	public Client(String nume, String nrTelefon, String email) {
		this.nume = nume;
		this.nrTelefon = nrTelefon;
		this.email = email;
	}

	@Override
	public String toString() {
		return "Client [nume=" + nume + ", nrTelefon=" + nrTelefon + ", email=" + email + "]";
	}


	@Override
	public void printeazaRezervare(Rezervare rezervare) {
		System.out.println(this.toString());
		System.out.println(rezervare.toString());
		System.out.println();
	}

}
