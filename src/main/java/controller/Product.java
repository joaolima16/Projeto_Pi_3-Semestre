package controller;

import DAO.DbConnection;
import DAO.ProductDAO;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
/**
 *
 * @author João Vitor
 */
@WebServlet(name = "Product", urlPatterns = {"/Product"})
public class Product extends HttpServlet {

    public ProductDAO productDao = new ProductDAO();
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet Product</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet Product at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }


    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
            String action = request.getServletPath();
            if(action.equals("/Product")){
          
            }
    }


    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
            processRequest(request, response);
            String teste = request.getParameter("nome");
            response.getWriter().write("teste");
    }
    protected void listenProducts(HttpServletRequest request, HttpServletResponse response)  throws ServletException, IOException {
        List<model.Product> lsProducts = productDao.listenProducts();
        
    }
    
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
