package com.springboot.workers.jdbcexample.util;



import java.beans.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;



public class DatabaseConnection {
static Connection connection = null;
public static Connection getConnection() throws SQLException, ClassNotFoundException {
try {
Class.forName("com.mysql.jdbc.Driver");
connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/my_org","root","root");
return connection;
}catch (SQLException e) {
e.printStackTrace();
}finally {
connection.close();
}
return null;

}
}