package fr.it_akademy.jhtest.service.mapper;

import org.junit.jupiter.api.BeforeEach;

class RestaurantMapperTest {

    private RestaurantMapper restaurantMapper;

    @BeforeEach
    public void setUp() {
        restaurantMapper = new RestaurantMapperImpl();
    }
}
