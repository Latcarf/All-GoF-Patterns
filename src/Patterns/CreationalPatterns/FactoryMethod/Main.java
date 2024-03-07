package Patterns.CreationalPatterns.FactoryMethod;

import Patterns.CreationalPatterns.FactoryMethod.species.Animal;
import Patterns.CreationalPatterns.FactoryMethod.species.Species;

/**
 * Factory method - решает проблему создания объектов разного типа одним методом,
 * возвращаемый тип завист от логики описанной в методе.
 **/

public class Main {
    public static void main(String[] args) {

        Animal seaAnimal = new AnimalFactory().createAnimal(Species.SEA);
        System.out.println(seaAnimal.getSpecies());
    }
}
