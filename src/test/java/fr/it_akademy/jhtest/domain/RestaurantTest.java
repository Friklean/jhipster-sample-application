package fr.it_akademy.jhtest.domain;

import static fr.it_akademy.jhtest.domain.CommandeTestSamples.*;
import static fr.it_akademy.jhtest.domain.RestaurantTestSamples.*;
import static org.assertj.core.api.Assertions.assertThat;

import fr.it_akademy.jhtest.web.rest.TestUtil;
import java.util.HashSet;
import java.util.Set;
import org.junit.jupiter.api.Test;

class RestaurantTest {

    @Test
    void equalsVerifier() throws Exception {
        TestUtil.equalsVerifier(Restaurant.class);
        Restaurant restaurant1 = getRestaurantSample1();
        Restaurant restaurant2 = new Restaurant();
        assertThat(restaurant1).isNotEqualTo(restaurant2);

        restaurant2.setId(restaurant1.getId());
        assertThat(restaurant1).isEqualTo(restaurant2);

        restaurant2 = getRestaurantSample2();
        assertThat(restaurant1).isNotEqualTo(restaurant2);
    }

    @Test
    void commandeTest() throws Exception {
        Restaurant restaurant = getRestaurantRandomSampleGenerator();
        Commande commandeBack = getCommandeRandomSampleGenerator();

        restaurant.addCommande(commandeBack);
        assertThat(restaurant.getCommandes()).containsOnly(commandeBack);
        assertThat(commandeBack.getRestaurants()).containsOnly(restaurant);

        restaurant.removeCommande(commandeBack);
        assertThat(restaurant.getCommandes()).doesNotContain(commandeBack);
        assertThat(commandeBack.getRestaurants()).doesNotContain(restaurant);

        restaurant.commandes(new HashSet<>(Set.of(commandeBack)));
        assertThat(restaurant.getCommandes()).containsOnly(commandeBack);
        assertThat(commandeBack.getRestaurants()).containsOnly(restaurant);

        restaurant.setCommandes(new HashSet<>());
        assertThat(restaurant.getCommandes()).doesNotContain(commandeBack);
        assertThat(commandeBack.getRestaurants()).doesNotContain(restaurant);
    }
}
