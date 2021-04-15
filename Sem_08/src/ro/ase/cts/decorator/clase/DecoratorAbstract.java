package ro.ase.cts.decorator.clase;

public abstract class DecoratorAbstract implements INotaDePlata {
	private INotaDePlata notaDecorata;

	public DecoratorAbstract(INotaDePlata notaDecorata) {
		super();
		this.notaDecorata = notaDecorata;
	}

	@Override
	public void printeazaNota() {
		notaDecorata.printeazaNota();
	}
	
	public abstract void printeazaFelicitare();
}
