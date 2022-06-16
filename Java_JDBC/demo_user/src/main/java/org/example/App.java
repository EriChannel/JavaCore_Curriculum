package org.example;

import org.mindrot.jbcrypt.BCrypt;

import java.sql.*;
import java.time.LocalDate;
import java.util.ArrayList;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

        UserService service = new UserService();

        ArrayList<User> list = service.getAllUser();
        service.show(list);

        User u = service.getUserById("ahdur");
        System.out.println(u);
        Date date = Date.valueOf(LocalDate.now());

        String password = "12345678";
        String hash = BCrypt.hashpw(password, BCrypt.gensalt(12));
        User newUser = new User(Util.randomId(5), "quang",
                "quang@gmail.com", hash ,date);

        service.addNewUser(newUser);

//        service.updatePassword(u, "987654321");
//
//
//
//        User userLogin = null;
//        while (userLogin == null){
//            userLogin = service.checkLogin("", "");
//
//            if(userLogin != null){
//                System.out.println("Đăng nhập thành công, xin chào " + userLogin.getUserName());
//            }else{
//                System.out.println("Đăng nhập thất bại");
//            }
//        }
    }
}
