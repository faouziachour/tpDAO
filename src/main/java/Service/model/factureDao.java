package Service.model;

import Dao.model.Client;
import Dao.model.Facture;

import java.sql.SQLException;
import java.util.List;

public interface factureDao {
    public List<Facture> listerFacture() throws SQLException;
    public List<Facture> listerFactureClient(Client client) throws SQLException;
    public void ajouterFactureClient(Client client,Facture facture) throws SQLException;
}
