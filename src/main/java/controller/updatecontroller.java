package controller;

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

@WebServlet(name = "updatecontroller", urlPatterns = "/updatecontroller")
public class updatecontroller extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int pID = Integer.parseInt(request.getParameter("pID"));
        String pName = request.getParameter("pName");
        int price = Integer.parseInt(request.getParameter("price"));
        int quantity = Integer.parseInt(request.getParameter("quantity"));
        String color = request.getParameter("color");
        int categoryID = Integer.parseInt(request.getParameter("categoryID"));
        Connection connection= dbConnection.createConnection();
        homeDAO.updateDAO(connection,pID,pName,price,quantity,color,categoryID);
    }
}
