package ao.morgado.feature.animal.dto;

import ao.morgado.feature.animal.datasource.AnimalInterface;

public record DogDto(
        String name,
        String breed
    ) implements AnimalInterface {}