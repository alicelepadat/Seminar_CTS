package ro.ase.cts.decorator.clase;

public class DecoratorLaMultiAni extends DecoratorAbstract {

	public DecoratorLaMultiAni(INotaDePlata notaDecorata) {
		super(notaDecorata);
	}

	@Override
	public void printeazaFelicitare() {
		System.out.println("FELICITARE: La multi ani!");
	}

	@Override
	public void printeazaNota() {
		super.printeazaNota();
		System.out.println("La multi ani!");
	}
	
}
