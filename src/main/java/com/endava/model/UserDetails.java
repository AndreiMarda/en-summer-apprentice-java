package com.endava.model;

import jakarta.persistence.*;

import java.io.Serializable;

@Entity
@Table(name = "user_details")
public class UserDetails implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column (name = "user_id")
    private int user_id;
    @Column (name = "name")
    private String name;
    @Column (name = "email")
    private String email;

    public UserDetails(int userID, String name, String email) {
        this.user_id = userID;
        this.name = name;
        this.email = email;
    }

    public UserDetails(){ }

    public int getUserID() {
        return user_id;
    }

    public void setUserID(int userID) {
        this.user_id = userID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}