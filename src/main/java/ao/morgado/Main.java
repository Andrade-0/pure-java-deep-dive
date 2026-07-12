package ao.morgado;

import ao.morgado.feature.animal.repository.DogRepository;
import ao.morgado.feature.animal.util.AnimalShelter;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World, I´m doing a review of Java fundamentals!");

        // Practice: Generics & Wildcard

        DogRepository dogRepo = new DogRepository();
        AnimalShelter.countAnimals(dogRepo);
    }
}