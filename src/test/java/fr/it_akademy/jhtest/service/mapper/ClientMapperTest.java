package fr.it_akademy.jhtest.service.mapper;

import org.junit.jupiter.api.BeforeEach;

class ClientMapperTest {

    private ClientMapper clientMapper;

    @BeforeEach
    public void setUp() {
        clientMapper = new ClientMapperImpl();
    }
}
