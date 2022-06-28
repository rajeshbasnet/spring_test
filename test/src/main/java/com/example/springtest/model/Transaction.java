package com.example.springtest.model;

import javax.persistence.*;

@Entity
@Table(name = "transactions")
public class Transaction {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    public Transaction() {}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
