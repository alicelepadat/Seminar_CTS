package ro.ase.cts.memento.clase;

import java.util.ArrayList;
import java.util.List;

public class ManagerMemento {
	private List<Memento> listaMemento;

	public ManagerMemento() {
		super();
		this.listaMemento = new ArrayList<Memento>();
	}
	
	public void adaugaMEmento(Memento memento) {
		listaMemento.add(memento);
	}
	
	public Memento cereMemento(int index) {
		if(index<listaMemento.size() && index>=0) {
			return listaMemento.get(index);
		}
		return null;
	}
	
	public Memento getLastMemento() {
		return listaMemento.get(listaMemento.size()-1);
	}
}
