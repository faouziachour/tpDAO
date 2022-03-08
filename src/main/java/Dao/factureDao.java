package Dao;

import Dao.model.Article;
import Dao.model.Client;
import Dao.model.Facture;

import java.util.List;

public interface factureDao {
    public List<Facture> listerFacture();
    public void ajouterFactureClient(Client client, Facture facture);
    public List<Facture> listerFactureClient(Client client);
}
