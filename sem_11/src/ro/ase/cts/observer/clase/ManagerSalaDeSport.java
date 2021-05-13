package ro.ase.cts.observer.clase;

import java.util.ArrayList;
import java.util.List;

public class ManagerSalaDeSport {
	private List<IObserver> listaObservatori;

	public ManagerSalaDeSport() {
		super();
		this.listaObservatori = new ArrayList<IObserver>();
		
	}

	public void adaugaObservator(IObserver observer) {
		listaObservatori.add(observer);
	}
	
	public void stergeObservator(IObserver observer) {
		listaObservatori.remove(observer);
	}
	
	public void notificaObservatori(String mesaj) {
		for(IObserver observer : listaObservatori) {
			observer.primesteMesaj(mesaj);
		}
	}
}
