package Patterns.CreationalPatterns.FactoryMethod;

import Patterns.CreationalPatterns.FactoryMethod.species.Animal;
import Patterns.CreationalPatterns.FactoryMethod.species.LandCreatures;
import Patterns.CreationalPatterns.FactoryMethod.species.SeaCreatures;
import Patterns.CreationalPatterns.FactoryMethod.species.Species;

public class AnimalFactory {
    public Animal createAnimal(Enum species) {
        if (species.equals(Species.LAND)) {
            return new LandCreatures();
        } else if (species.equals(Species.SEA)) {
            return new SeaCreatures();
        } else {
            return null;
        }
    }
}
