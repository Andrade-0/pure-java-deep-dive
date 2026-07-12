package ao.morgado.feature.animal.dto;

import ao.morgado.feature.animal.datasource.AnimalInterface;

public record CatDto(
        String name,
        boolean isIndoor
    ) implements AnimalInterface {}