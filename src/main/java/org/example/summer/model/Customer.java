package org.example.summer.model;

import jakarta.persistence.*;

import java.io.Serializable;

@Entity
@Table(name = "customer")
public class Customer implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column (name = "customer_id")
    private int customer_id;
    @Column (name = "customer_name")
    private String customer_name;
    @Column (name = "email")
    private String email;

    public Customer(int customer_id, String customer_name, String email) {
        this.customer_id = customer_id;
        this.customer_name = customer_name;
        this.email = email;
    }

    public Customer(){ }

    public int getCustomer_id() {
        return customer_id;
    }

    public void setCustomer_id(int customer_id) {
        this.customer_id = customer_id;
    }

    public String getName() {
        return customer_name;
    }

    public void setName(String customer_name) {
        this.customer_name = customer_name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}