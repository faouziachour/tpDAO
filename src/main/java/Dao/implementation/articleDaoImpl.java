package Dao.implementation;

import Service.model.articleDao;
import Dao.model.Article;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class articleDaoImpl implements articleDao {
    List<Article> listeA = new ArrayList<>();
    static Connection con;
    @Override
    public List<Article> listerArticle() throws SQLException {
        Statement stmt=con.createStatement();
        ResultSet rs=stmt.executeQuery("select * from article");

        while(rs.next())
        {
            Article a = new Article(rs.getInt(0),rs.getString(1),rs.getInt(2));
            listeA.add(a);
        }
        rs.close();
        stmt.close();
        con.close();
        return listeA;
    }
}
