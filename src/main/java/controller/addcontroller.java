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

@WebServlet(name = "addcontroller",urlPatterns = "/addcontroller")
public class addcontroller extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String pName = request.getParameter("pName");
        int price = Integer.parseInt(request.getParameter("price"));
        int quantity = Integer.parseInt(request.getParameter("quantity"));
        String color = request.getParameter("color");
        int categoryID = Integer.parseInt(request.getParameter("categoryID"));
        Connection connection=db.dbConnection.createConnection();
        homeDAO.addDAO(connection,pName,price,quantity,color,categoryID);


        List<Product> productList =new ArrayList<>();
        productList= homeDAO.displayDAO(connection);
        request.setAttribute("productList",productList);
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("/WEB-INF/view/home.jsp");
        requestDispatcher.forward(request, response);



    }
}
