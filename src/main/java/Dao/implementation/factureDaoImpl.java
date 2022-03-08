package Dao.implementation;

import Service.model.factureDao;
import Dao.model.Client;
import Dao.model.Facture;

import java.sql.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class factureDaoImpl implements factureDao {
    List<Facture> listeF = new ArrayList<>();
    static Connection con;

    private List<Facture> getResultSet(Statement stmt, ResultSet rs) throws SQLException {
        while(rs.next())
        {
            Facture f = new Facture(rs.getInt(0),rs.getDate(1),rs.getInt(2));
            listeF.add(f);
        }
        rs.close();
        stmt.close();
        con.close();
        return listeF;
    }

    @Override
    public List<Facture> listerFacture() throws SQLException {
        con = connectionClass.getConnection();
        Statement stmt=con.createStatement();
        ResultSet rs=stmt.executeQuery("select * from facture");
        return getResultSet(stmt, rs);
    }

    @Override
    public List<Facture> listerFactureClient(Client client) throws SQLException {
        con = connectionClass.getConnection();
        Statement stmt=con.createStatement();
        ResultSet rs=stmt.executeQuery("select * from facture where id_client="+client.getId_client());
        return getResultSet(stmt, rs);
    }


    @Override
    public void ajouterFactureClient(Client client, Facture facture) throws SQLException {
        con = connectionClass.getConnection();
        String Query="Insert into Facture(date_facture,id_client) values (?,?)";
        PreparedStatement prestmt = con.prepareStatement(Query);

        prestmt.setDate(1, Date.valueOf(LocalDate.now()));
        prestmt.setInt(2,client.getId_client());

        prestmt.executeUpdate();
        prestmt.close();
        con.close();
    }
}