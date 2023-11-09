package fr.it_akademy.jhtest.service.mapper;

import org.junit.jupiter.api.BeforeEach;

class CommandeMapperTest {

    private CommandeMapper commandeMapper;

    @BeforeEach
    public void setUp() {
        commandeMapper = new CommandeMapperImpl();
    }
}
