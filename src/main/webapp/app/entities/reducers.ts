import client from 'app/entities/client/client.reducer';
import commande from 'app/entities/commande/commande.reducer';
import restaurant from 'app/entities/restaurant/restaurant.reducer';
/* jhipster-needle-add-reducer-import - JHipster will add reducer here */

const entitiesReducers = {
  client,
  commande,
  restaurant,
  /* jhipster-needle-add-reducer-combine - JHipster will add reducer here */
};

export default entitiesReducers;
