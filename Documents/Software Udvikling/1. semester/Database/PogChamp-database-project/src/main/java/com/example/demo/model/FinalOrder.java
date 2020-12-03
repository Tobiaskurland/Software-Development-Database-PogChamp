package com.example.demo.model;

import javax.persistence.*;

@Entity
@Table(name = "final_order", schema = "PogChamp", catalog = "")
public class FinalOrder {

    private int ID;
    private String first_name;
    private String last_name;
    private String Phone;
    private String Title;
    private int Length;
    private String genre;
    private Integer age_limit;
    private String order_date;
    private int quantity;
    private String status;
    private String payment_method;

    public FinalOrder() {
    }

    public FinalOrder(int ID, String first_name, String last_name, String phone, String title, int length, String genre, int age_limit, String order_date, int quantity, String status, String payment_method) {
        this.ID = ID;
        this.first_name = first_name;
        this.last_name = last_name;
        Phone = phone;
        Title = title;
        Length = length;
        this.genre = genre;
        this.age_limit = age_limit;
        this.order_date = order_date;
        this.quantity = quantity;
        this.status = status;
        this.payment_method = payment_method;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY, generator = "native")
    @Column(name = "ID")
    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    @Basic
    @Column(name = "First_name")
    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    @Basic
    @Column(name = "Last_name")
    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    @Basic
    @Column(name = "Phone")
    public String getPhone() {
        return Phone;
    }

    public void setPhone(String phone) {
        Phone = phone;
    }

    @Basic
    @Column(name = "Title")
    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }

    @Basic
    @Column(name = "Length")
    public int getLength() {
        return Length;
    }

    public void setLength(int length) {
        Length = length;
    }

    @Basic
    @Column(name = "Genre_title")
    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    @Basic
    @Column(name = "Age_limit")
    public Integer getAge_limit() {
        return age_limit;
    }

    public void setAge_limit(Integer age_limit) {
        this.age_limit = age_limit;
    }

    @Basic
    @Column(name = "Order_date")
    public String getOrder_date() {
        return order_date;
    }

    public void setOrder_date(String order_date) {
        this.order_date = order_date;
    }

    @Basic
    @Column(name = "Quantity")
    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Basic
    @Column(name = "order_status")
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Basic
    @Column(name = "payment_method")
    public String getPayment_method() {
        return payment_method;
    }

    public void setPayment_method(String payment_method) {
        this.payment_method = payment_method;
    }
}
