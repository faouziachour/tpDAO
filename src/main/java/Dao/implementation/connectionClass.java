package Dao.implementation;

import java.sql.*;

public class connectionClass {

        private static Connection con = null;

        static
        {
            String url = "jdbc:mysql:// localhost:3306/tpdao";
            String user = "root";
            String pass = "root";
            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
                con = DriverManager.getConnection(url, user, pass);
            }
            catch (ClassNotFoundException | SQLException e) {
                e.printStackTrace();
            }
        }
        public static Connection getConnection()
        {
            return con;
        }
    }


