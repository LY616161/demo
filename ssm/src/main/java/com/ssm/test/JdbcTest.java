package com.ssm.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcTest {
    public static void main(String args[]){
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        Connection connection = null;
        String url = "jdbc:mysql://localhost:3306/ssm";
        String username = "root";
        String password = "123456";
        try {
            connection = DriverManager.getConnection(url,username,password);
            String sql = "INSERT INTO movie(movie_id,movie_name,director_id)"
                    +"VALUES (8,'M6',1)";
            Statement statement = connection.createStatement();
            int row = statement.executeUpdate(sql);
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            if(connection!=null){
                try {
                    connection.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
