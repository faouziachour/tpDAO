package Service;

import Dao.model.Article;

import java.util.List;

public class articleService {
    private Integer idArticle;
    private String nom;
    private double prix;

    public articleService(int id_article, String nom, double prix) {
        this.idArticle = id_article;
        this.nom = nom;
        this.prix = prix;
    }

    public int getId_article() {
        return idArticle;
    }

    public void setId_article(int id_article) {
        this.idArticle = id_article;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public double getPrix() {
        return prix;
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }
}
