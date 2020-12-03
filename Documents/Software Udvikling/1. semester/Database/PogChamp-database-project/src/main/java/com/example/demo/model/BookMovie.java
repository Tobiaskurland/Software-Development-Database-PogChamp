package com.example.demo.model;

import javax.persistence.*;

@Table(name = "customer", schema = "PogChamp")
@SecondaryTable(name = "orders", schema = "PogChamp")
@SecondaryTable(name = "order_items", schema = "PogChamp")
public class BookMovie {

    private String first_name;
    private String last_name;
    private int phone;
    private String email;
    private String adress;
    private String city;
    private String comment;
    private int order_status;
    private int movie;
    private String payment_date;
    private int quantity;
    private int payment_method;

    public BookMovie() {
    }

    public BookMovie(String first_name, String last_name, int phone, String email, String adress, String city, String comment, int order_status, int movie, String payment_date, int quantity, int payment_method) {
        this.first_name = first_name;
        this.last_name = last_name;
        this.phone = phone;
        this.email = email;
        this.adress = adress;
        this.city = city;
        this.comment = comment;
        this.order_status = order_status;
        this.movie = movie;
        this.payment_date = payment_date;
        this.quantity = quantity;
        this.payment_method = payment_method;
    }

    @Basic
    @Column(table = "customer", name = "First_name")
    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    @Basic
    @Column(table = "customer", name = "Last_name")
    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    @Basic
    @Column(table = "customer", name = "Phone")
    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    @Basic
    @Column(table = "customer", name = "Email")
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Basic
    @Column(table = "customer", name = "Adress")
    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    @Basic
    @Column(table = "customer", name = "City")
    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Basic
    @Column(table = "orders", name = "Comment")
    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    @Basic
    @Column(table = "orders", name = "Order_statusID")
    public int getOrder_status() {
        return order_status;
    }

    public void setOrder_status(int order_status) {
        this.order_status = order_status;
    }

    @Basic
    @Column(table = "orders", name = "MovieID")
    public int getMovie() {
        return movie;
    }

    public void setMovie(int movie) {
        this.movie = movie;
    }

    @Basic
    @Column(table = "orders", name = "payment_date")
    public String getPayment_date() {
        return payment_date;
    }

    public void setPayment_date(String payment_date) {
        this.payment_date = payment_date;
    }

    @Basic
    @Column(table = "order_items", name = "Quantity")
    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Basic
    @Column(table = "order_items", name = "Payment_methodID")
    public int getPayment_method() {
        return payment_method;
    }

    public void setPayment_method(int payment_method) {
        this.payment_method = payment_method;
    }
}
