package org.example;

import java.sql.*;
import java.util.ArrayList;

public class UserService {
    ConnectDatabase connectDatabase;
    public UserService() {
        connectDatabase = new ConnectDatabase();
    }

    public ArrayList<User> getAllUser(){
        ArrayList<User> list = new ArrayList<>();
        Connection conn = connectDatabase.getConnect();

        String query = "SELECT * FROM `users`";
        try {
            //Tạo đối tượng statement (Tạo câu truy vấn)
            Statement stm = conn.createStatement();

            //Thực thi câu truy vấn và trả về kết quả
            ResultSet rs = stm.executeQuery(query);

            //Duyệt kết quả
            while (rs.next()){
                String id = rs.getString("id");
                String username = rs.getString("user_name");
                String email = rs.getString("email");
                String password = rs.getString("password");
                Date createAt = rs.getDate("create_at");

//                System.out.println(id + " - " + username + " - " + email
//                        + " - " + password + " - " + createAt) ;
                list.add(new User(id, username, email, password, createAt));

            }

            //Đóng kết nối
            conn.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return list;
    }

    public void show(ArrayList<User> list){
        list.forEach(System.out::println);
    }

    public User getUserById(String fId){
        User fUser = null;

        Connection conn = connectDatabase.getConnect();
        String query = "SELECT * FROM `users` WHERE id = ?";

        try {
            PreparedStatement pstm = conn.prepareStatement(query);

            //Gán các giá trị vào tham số
            pstm.setString(1, fId);

            //Thực thi câu truy vấn và trả về kết quả
            ResultSet rs = pstm.executeQuery();

            //Duyệt kết quả
            while (rs.next()){
                String id = rs.getString("id");
                String username = rs.getString("user_name");
                String email = rs.getString("email");
                String password = rs.getString("password");
                Date createAt = rs.getDate("create_at");

                fUser = new User(id, username, email, password, createAt);
            }
            conn.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        return fUser;
    }
}
