package DAO;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import model.Product;


public class ProductDAO {
    private void createProduct(Product product){
      try{
          DbConnection conn = new DbConnection();
          String sql = "INSERT INTO produto(nome,vlr_unitario, quantidade, img_url) VALUES (?,?,?,?)";
          PreparedStatement stmt = conn.statement(sql);
          stmt.setString(1, product.getName());
          stmt.setDouble(2, product.getUnitaryValue());
          stmt.setInt(3, product.getStock());
          stmt.setString(4, product.getImgUrl());
          stmt.executeUpdate();
      }
      catch(SQLException ex){
          throw new Error(ex);
      }
    }
}
