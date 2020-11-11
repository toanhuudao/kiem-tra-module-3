package controller;

import bean.Product;
import dao.homeDAO;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "searchcontroller",urlPatterns = "/searchcontroller")
public class searchcontroller extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String search = request.getParameter("search");

        Connection connection=db.dbConnection.createConnection();
        List<Product> productList =new ArrayList<>();
        productList= homeDAO.displayDAO(connection);
        List<Product> searchList =new ArrayList<>();
        for (Product product: productList
             ) {
            if (product.getpName().contains(search)){
                searchList.add(product);
            }
        }

        request.setAttribute("searchList",searchList);
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("/WEB-INF/view/search.jsp");
        requestDispatcher.forward(request, response);


    }
}
