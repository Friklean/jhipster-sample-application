import { ICommande } from 'app/shared/model/commande.model';

export interface IRestaurant {
  id?: number;
  preparationCommande?: string | null;
  heureDePreparation?: string | null;
  commandes?: ICommande[] | null;
}

export const defaultValue: Readonly<IRestaurant> = {};
