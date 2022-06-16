package org.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectDatabase {

    private String hostName = "localhost:8085";
    private String dbName = "users_test";
    private String username = "root";
    private String password = "123";

    private String url = "jdbc:mysql://"+hostName+"/"+dbName;

    //Tạo connection
    public Connection getConnect(){
        Connection conn = null;

        try {
            conn = DriverManager.getConnection(url, username, password);
            System.out.println("Kết nối thành công");
        } catch (SQLException e) {
//            throw new RuntimeException(e);
            e.printStackTrace();
            System.out.println("Kết không thành công");
        }
        return conn;
    }
}
