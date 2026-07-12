package ao.morgado.feature.animal.util;

import ao.morgado.bootstrapper.db.Repository;
import ao.morgado.feature.animal.datasource.AnimalInterface;

public class AnimalShelter {

    public static int countAnimals(Repository<? extends AnimalInterface, ?> repo) {
        System.out.println("AnimalShelter.countAnimals: " + repo.fetchAll().size());
        return repo.fetchAll().size();
    }
}