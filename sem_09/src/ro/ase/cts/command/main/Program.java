package ro.ase.cts.command.main;

import ro.ase.cts.command.clase.*;

public class Program {

	public static void main(String[] args) {
		Masa masa = new Masa(1);
		
		Comanda comandaRezervare1 = new ComandaRezervare(masa);
		Comanda comandaRezervare2 = new ComandaRezervare(masa);
		Comanda comandaOcupare = new ComandaOcupare(new Masa(2));
		
		Operator operator = new Operator();
		operator.invoca(comandaRezervare1);
		operator.executaComanda();
		
		operator.invoca(comandaRezervare2);
		operator.invoca(comandaOcupare);
		
		operator.executaComanda();
		operator.executaComanda();
	}

}
