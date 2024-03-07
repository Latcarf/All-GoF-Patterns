package Patterns.CreationalPatterns.FactoryMethod.species;

import Patterns.CreationalPatterns.FactoryMethod.species.Animal;

public class LandCreatures extends Animal {
    @Override
    public String getSpecies() {
        return "Land creatures";
    }
}
