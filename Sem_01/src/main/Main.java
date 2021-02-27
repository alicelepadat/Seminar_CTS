package main;
import data.Animal;
import data.Giraffe;
import data.Zebra;
import data.Zoo;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Zoo zoo = new Zoo();
		Animal z1 = new Zebra("Maria");
		Animal z2 = new Zebra("Ioana");
		Animal g1 = new Giraffe("Maricia");
		Animal g2 = new Giraffe("Maricia", 400);
		
		zoo.addAnimal(z1);
		zoo.addAnimal(z2);
		zoo.addAnimal(g1);
		zoo.addAnimal(g2);
		
		zoo.feedAllAnimals();
		zoo.animalWalk();
	}

}
