package Dao.model;

public class Client {
    private Integer idClient;
    private String nom;
    private String prenom;

    public Client(int id_client, String nom, String prenom) {
        this.idClient = id_client;
        this.nom = nom;
        this.prenom = prenom;
    }

    public int getId_client() {
        return idClient;
    }

    public void setId_client(int id_client) {
        this.idClient = id_client;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }
}
