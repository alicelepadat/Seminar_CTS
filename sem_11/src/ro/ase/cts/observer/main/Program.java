package ro.ase.cts.observer.main;

import ro.ase.cts.observer.clase.Client;
import ro.ase.cts.observer.clase.Manager;

public class Program {

	public static void main(String[] args) {
		Manager manager = new Manager();
		Client client1=new Client("Radu");
		Client client2 = new Client("Mihai");
		Client client3 = new Client("Robert");
		
		manager.adaugaObservator(client1);
		manager.adaugaObservator(client2);
		manager.adaugaObservator(client3);
		
		manager.anuntaMeci("fotbal");
		
		manager.stergeObservator(client3);
		manager.anuntaMeci("volei");
	}

}
