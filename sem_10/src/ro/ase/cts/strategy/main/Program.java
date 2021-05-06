package ro.ase.cts.strategy.main;

import ro.ase.cts.strategy.clase.*;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Client client = new Client("Alice");
		
		client.plateste(30);
		client.setTipPlata(new PlataCard());
		client.plateste(25);
	}

}
