package Service.implementation;

import Dao.implementation.articleDaoImpl;
import Dao.model.Article;
import Service.articleService;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class articleServiceImpl {

    public void afficherList(articleService article) throws SQLException {
        List<Article> lstArt = new ArrayList<>();
        articleDaoImpl adi= new articleDaoImpl();
        lstArt = adi.listerArticle();
        for(Article art:lstArt)
        {
            System.out.println(
                    art.getNom() + "" + art.getPrix()
            );
        }
    }


}
