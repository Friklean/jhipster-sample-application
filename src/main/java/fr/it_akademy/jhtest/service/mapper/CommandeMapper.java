package fr.it_akademy.jhtest.service.mapper;

import fr.it_akademy.jhtest.domain.Client;
import fr.it_akademy.jhtest.domain.Commande;
import fr.it_akademy.jhtest.domain.Restaurant;
import fr.it_akademy.jhtest.service.dto.ClientDTO;
import fr.it_akademy.jhtest.service.dto.CommandeDTO;
import fr.it_akademy.jhtest.service.dto.RestaurantDTO;
import java.util.Set;
import java.util.stream.Collectors;
import org.mapstruct.*;

/**
 * Mapper for the entity {@link Commande} and its DTO {@link CommandeDTO}.
 */
@Mapper(componentModel = "spring")
public interface CommandeMapper extends EntityMapper<CommandeDTO, Commande> {
    @Mapping(target = "restaurants", source = "restaurants", qualifiedByName = "restaurantIdSet")
    @Mapping(target = "client", source = "client", qualifiedByName = "clientId")
    CommandeDTO toDto(Commande s);

    @Mapping(target = "removeRestaurant", ignore = true)
    Commande toEntity(CommandeDTO commandeDTO);

    @Named("restaurantId")
    @BeanMapping(ignoreByDefault = true)
    @Mapping(target = "id", source = "id")
    RestaurantDTO toDtoRestaurantId(Restaurant restaurant);

    @Named("restaurantIdSet")
    default Set<RestaurantDTO> toDtoRestaurantIdSet(Set<Restaurant> restaurant) {
        return restaurant.stream().map(this::toDtoRestaurantId).collect(Collectors.toSet());
    }

    @Named("clientId")
    @BeanMapping(ignoreByDefault = true)
    @Mapping(target = "id", source = "id")
    ClientDTO toDtoClientId(Client client);
}
