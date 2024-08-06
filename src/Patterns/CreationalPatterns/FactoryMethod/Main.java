package Patterns.CreationalPatterns.FactoryMethod;

import Patterns.CreationalPatterns.FactoryMethod.species.Animal;
import Patterns.CreationalPatterns.FactoryMethod.species.Species;

/**
 * Factory method - solves the problem of creating objects of different types with one method,
 * the return type depends on the logic described in the method.
 **/

public class Main {
    public static void main(String[] args) {

        Animal seaAnimal = new AnimalFactory().createAnimal(Species.SEA);
        System.out.println(seaAnimal.getSpecies());
    }
}
