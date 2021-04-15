package ro.ase.cts.decorator.clase;

public class DecoratorUrarePaste extends DecoratorAbstract {

	public DecoratorUrarePaste(INotaDePlata notaDecorata) {
		super(notaDecorata);
	}

	@Override
	public void printeazaFelicitare() {
		System.out.println("FELICITARE: Paste fericit!");
	}

	@Override
	public void printeazaNota() {
		super.printeazaNota();
		System.out.println("Paste Fericit!");
	}

	
}
