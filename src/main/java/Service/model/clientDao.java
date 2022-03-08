package Service.model;

import Dao.model.Client;

import java.sql.SQLException;

public interface clientDao {
    public void modifierClient(Client client) throws SQLException;
}
