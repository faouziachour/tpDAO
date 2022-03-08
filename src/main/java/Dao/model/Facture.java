package Dao.model;

import java.util.Date;

public class Facture {

    private Integer numFacture;
    private Date dateFacture;
    private int idClient;

    public Facture(Integer numFacture, Date dateFacture, int idClient) {
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
