package ro.ase.cts.program;

import ro.ase.cts.clase.Animal;
import ro.ase.cts.clase.Presedinte;
import ro.ase.cts.clase.PresedinteLazy;

public class Main {

	public static void main(String[] args) {
        Presedinte presedinte1=Presedinte.getInstance();
        Presedinte presedinte2=Presedinte.getInstance();

        System.out.println(presedinte1.toString());
        System.out.println(presedinte2.toString());
        
        PresedinteLazy pLazy1=PresedinteLazy.getInstance("presedinte lazy", 37, 2);
        PresedinteLazy pLazy2=PresedinteLazy.getInstance("presedinte lazy2", 40, 3);
        
        System.out.println(pLazy1.toString());
        System.out.println(pLazy2.toString());
        
        // TODO: clasa - substantiv - contine LA - minim 3 atribute(tipuri dif) - lazy singleton thread safe
        Animal animal = Animal.getInstance("pisica", 5, 3.2f);
        Animal animal1 = Animal.getInstance("pisica persana", 3, 4f);
        
        System.out.println(animal.toString());
        System.out.println(animal1.toString());
        
        animal1.setGreutate(4.1f);
        System.out.println(animal1.toString());
    }

}
