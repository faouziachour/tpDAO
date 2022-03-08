package Service.implementation;

import Dao.implementation.articleDaoImpl;
import Dao.implementation.factureDaoImpl;
import Dao.model.Article;
import Dao.model.Facture;
import Service.factureService;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class factureServiceImpl {

    public void listerFacture() throws SQLException {
        List<Facture> lstFacture = new ArrayList<>();
        factureDaoImpl fsi= new factureDaoImpl();
        lstFacture = fsi.listerFacture();
        for(Facture facture:lstFacture)
        {
            System.out.println(
                    facture.getNumFacture() + "" + facture.getDateFacture()
            );
        }
    }
}
