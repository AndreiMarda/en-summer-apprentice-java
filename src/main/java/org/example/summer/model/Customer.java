package org.example.summer.model;

import jakarta.persistence.*;

import java.io.Serializable;

@Entity
@Table(name = "customer")
public class Customer implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column (name = "customer_id")
    private int customerId;
    @Column (name = "customer_name")
    private String customerName;
    @Column (name = "email")
    private String email;

    public Customer(){ }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customer_id) {
        this.customerId = customer_id;
    }

    public String getName() {
        return customerName;
    }

    public void setName(String customer_name) {
        this.customerName = customer_name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}