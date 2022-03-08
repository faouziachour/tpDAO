package Service.model;

import Dao.model.Article;

import java.sql.SQLException;
import java.util.List;

public interface articleDao {
    public List<Article> listerArticle() throws SQLException;
}
