package data;

import java.util.ArrayList;
import java.util.List;

public class Zoo {
	private Zookeeper zookeeper;
	private List<Animal> animals;

	public Zoo() {
		super();
		this.zookeeper = new Zookeeper("anonim");
		this.animals = new ArrayList<>();
	}

	public Zoo(Zookeeper zookeeper, List<Animal> animals) {
		super();
		this.zookeeper = zookeeper;
		this.animals = animals;
	}

	public Zookeeper getZookeeper() {
		return zookeeper;
	}

	public void setZookeeper(Zookeeper zookeeper) {
		this.zookeeper = zookeeper;
	}

	public List<Animal> getAnimals() {
		return animals;
	}

	public void setAnimals(List<Animal> animals) {
		this.animals = animals;
	}

	public void addAnimal(Animal toAdd) {
		this.animals.add(toAdd);
	}

	public void feedAllAnimals() {
		for(Animal a : animals) {
			this.zookeeper.feed(a);
		}
	}
}