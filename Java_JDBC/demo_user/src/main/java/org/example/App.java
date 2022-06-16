package org.example;

import java.sql.*;
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
    }
}
