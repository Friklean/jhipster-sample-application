package fr.it_akademy.jhtest.service.mapper;

import fr.it_akademy.jhtest.domain.Restaurant;
import fr.it_akademy.jhtest.service.dto.RestaurantDTO;
import org.mapstruct.*;

/**
 * Mapper for the entity {@link Restaurant} and its DTO {@link RestaurantDTO}.
 */
@Mapper(componentModel = "spring")
public interface RestaurantMapper extends EntityMapper<RestaurantDTO, Restaurant> {}
