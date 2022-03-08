package Service;


import Dao.model.Facture;

import java.util.Date;
import java.util.List;

public class factureService {

    private Integer numFacture;
    private Date dateFacture;
    private int idClient;

    public factureService(Integer numFacture, Date dateFacture, int idClient) {
        this.numFacture = numFacture;
        this.dateFacture = dateFacture;
        this.idClient = idClient;
    }

    public Integer getNumFacture() {
        return numFacture;
    }

    public void setNumFacture(Integer numFacture) {
        this.numFacture = numFacture;
    }

    public Date getDateFacture() {
        return dateFacture;
    }

    public void setDateFacture(Date dateFacture) {
        this.dateFacture = dateFacture;
    }

    public int getIdClient() {
        return idClient;
    }

    public void setIdClient(int idClient) {
        this.idClient = idClient;
    }
}
