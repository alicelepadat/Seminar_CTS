package ro.ase.cts.strategy.clase;

public class PlataCard implements IPlata{

	@Override
	public void plateste(float suma) {
		System.out.println("A fost realizata plata cu cardul in valoare de " + suma + " lei.");
	}

}
