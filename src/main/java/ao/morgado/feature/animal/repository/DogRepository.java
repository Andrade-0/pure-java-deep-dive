package ao.morgado.feature.animal.repository;

import ao.morgado.bootstrapper.db.Repository;
import ao.morgado.feature.animal.dto.DogDto;

import java.util.List;

public class DogRepository implements Repository<DogDto, String> {

    @Override
    public DogDto findById(String id) {
        return new DogDto(id, "Labrador");
    }

    @Override
    public List<DogDto> fetchAll() {
        return List.of(
                new DogDto("Sky", "Labrador"),
                new DogDto("ElephantBet", "American B")
        );
    }

    @Override
    public DogDto save(DogDto req) { return null; }

    @Override
    public void deleteById(String id) {}
}