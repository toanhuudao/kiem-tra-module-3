package controller;


import bean.Product;
import dao.homeDAO;
import db.dbConnection;

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

@WebServlet(name = "homeforward", urlPatterns = "/homeforward")
public class homeforward extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


        Connection connection= dbConnection.createConnection();

        if (connection!=null){
            List<Product> productList =new ArrayList<>();
            productList= homeDAO.displayDAO(connection);
            request.setAttribute("productList",productList);
            RequestDispatcher requestDispatcher = request.getRequestDispatcher("/WEB-INF/view/home.jsp");
            requestDispatcher.forward(request, response);
        }


    }
}
