package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DbConnection {

    public Connection connection() throws ClassNotFoundException {
        Connection conn;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1/pi_teste", "root", "");
            System.out.println("conectado");
            return conn;
        } catch (SQLException ex) {
            throw new Error(ex);
        }
    }

    public PreparedStatement statement(String sql) {
        Connection conn;
        try {
            conn = connection();
            PreparedStatement stmt = conn.prepareStatement(sql);
            return stmt;
        } catch (SQLException | ClassNotFoundException ex) {
            throw new Error(ex);
        }

    }

}
