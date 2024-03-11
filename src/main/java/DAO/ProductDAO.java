package DAO;

import ENUM.Category;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.Product;

public class ProductDAO {

    DbConnection conn = new DbConnection();

    private void createProduct(Product product) {
        try {

            String sql = "INSERT INTO produto(nome,vlr_unitario, quantidade, img_url) VALUES (?,?,?,?)";
            PreparedStatement stmt = conn.statement(sql);
            stmt.setString(1, product.getName());
            stmt.setDouble(2, product.getUnitaryValue());
            stmt.setInt(3, product.getStock());
            stmt.setString(4, product.getImgUrl());
            stmt.executeUpdate();
        } catch (SQLException ex) {
            throw new Error(ex);
        }
    }

    public List<Product> listenProducts() {
        ResultSet rs;
        List<Product> lsProducts = new ArrayList<>();
        try {
            String sql = "SELECT * FROM produto";
            PreparedStatement stmt = conn.statement(sql);
            rs = stmt.executeQuery();
            while (rs.next()) {
                String name_product = rs.getString(2);
                double value = rs.getDouble(3);
                String category = rs.getString(5);
                int stock = rs.getInt(4);
                String img_ur = rs.getString(6);
                lsProducts.add(new Product(name_product, value, stock, Category.valueOf(category), img_ur));

            }
            return lsProducts;
        } catch (SQLException ex) {
            throw new Error(ex);
        }
    }
}
