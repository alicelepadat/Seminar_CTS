package ro.ase.cts.decorator.clase;

public class NotaDePlata implements INotaDePlata{

	private int sumaDePlata;
	
	
	
	public NotaDePlata(int sumaDePlata) {
		super();
		this.sumaDePlata = sumaDePlata;
	}



	@Override
	public void printeazaNota() {
		System.out.println(String.format("S-a printat nota de plata in valoare de %d.", this.sumaDePlata));
	}

}
