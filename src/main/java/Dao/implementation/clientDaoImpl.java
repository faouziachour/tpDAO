package Dao.implementation;

import Service.model.clientDao;
import Dao.model.Client;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class clientDaoImpl implements clientDao {
    static Connection con;
    @Override
    public void modifierClient(Client client) throws SQLException {
        String Query="UPDATE Facture set nom=?,prenom=? where id_client=?";
        PreparedStatement prestmt = con.prepareStatement(Query);
        prestmt.setString(1,client.getNom());
        prestmt.setString(2,client.getPrenom());
        prestmt.setInt(3,client.getId_client());
        prestmt.executeUpdate();
        prestmt.close();
        con.close();
    }
}
