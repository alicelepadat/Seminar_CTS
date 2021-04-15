package ro.ase.cts.decorator.main;

import ro.ase.cts.decorator.clase.*;

public class Program {

	public static void main(String[] args) {
		NotaDePlata notaInitiala = new NotaDePlata(50);
		notaInitiala.printeazaNota();
		
		DecoratorAbstract decoratorLMA = new DecoratorLaMultiAni(notaInitiala);
		decoratorLMA.printeazaFelicitare();
		System.out.println();
		decoratorLMA.printeazaNota();
		
		DecoratorAbstract decoratorPaste = new DecoratorUrarePaste(notaInitiala);
		System.out.println();
		decoratorPaste.printeazaNota();
		
		NotaDePlata nota2 = new NotaDePlata(230);
		DecoratorAbstract decoratorLMA2 = new DecoratorLaMultiAni(nota2);
		DecoratorAbstract decoratorPaste2 = new DecoratorUrarePaste(decoratorLMA2);
		System.out.println();
		decoratorPaste2.printeazaNota();
	}
}
