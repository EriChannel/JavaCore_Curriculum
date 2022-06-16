package org.example;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.sql.Date;
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class User {
    private String id;
    private String userName;
    private String email;
    private String password;
    private Date createAt;

    @Override
    public String toString() {
        return id + " - " + userName + " - " + email
                       + " - " + password + " - " + createAt;
    }
}
