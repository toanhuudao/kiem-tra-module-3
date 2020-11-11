package dao;

import bean.Product;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class homeDAO {
    public static List<Product> displayDAO(Connection connection) {
        List<Product> productList = new ArrayList<>();
        String sql = "select pID,pName,price,quantity,color,cName from product join category c on c.CategoryID = product.CategoryID;";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                int pID = resultSet.getInt("pID");
                String pName = resultSet.getString("pName");
                double price = resultSet.getInt("price");
                int quantity = resultSet.getInt("quantity");
                String color = resultSet.getString("color");
                String category = resultSet.getString("cName");
                Product product = new Product(pID, pName, price, quantity, color, category);
                productList.add(product);


            }

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

        return productList;
    }


    public static void updateDAO(Connection connection, int pID, String pName, int price, int quantity, String color, int categoryID) {
        String sql = "update product set pName=?,price=?,quantity=?,color=?,CategoryID=?where pID=?;";

        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, pName);
            preparedStatement.setInt(2, price);
            preparedStatement.setInt(3, quantity);
            preparedStatement.setString(4,color);
            preparedStatement.setInt(5,categoryID);
            preparedStatement.setInt(6,pID);

             preparedStatement.executeUpdate();

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

    }


    public static void deleteDAO(Connection connection,int pID){


        try {
            String sql="delete from product where pID=?;";
            PreparedStatement preparedStatement=connection.prepareStatement(sql);
            preparedStatement.setInt(1,pID);
            preparedStatement.executeUpdate();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }


    }


    public static void addDAO(Connection connection,String pName,int price,int quantity,String color,int categoryID){
        String sql="insert into product(pName, price, quantity, color, CategoryID) VALUES (?,?,?,?,?);";
        try {
            PreparedStatement preparedStatement=connection.prepareStatement(sql);
            preparedStatement.setString(1,pName);
            preparedStatement.setInt(2,price);
            preparedStatement.setInt(3,quantity);
            preparedStatement.setString(4,color);
            preparedStatement.setInt(5,categoryID);

            preparedStatement.executeUpdate();

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

    }
}
