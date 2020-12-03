package com.example.demo.model;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "orders", schema = "PogChamp", catalog = "")
public class Order {
    private int id;
    private String orderDate;
    private String comment;
    private int orderStatusId;
    private int customerId;
    private int movieId;
    private String paymentDate;

    public Order() {
    }

    public Order(int id, String orderDate, String comment, int orderStatusId, int customerId, int movieId, String paymentDate) {
        this.id = id;
        this.orderDate = orderDate;
        this.comment = comment;
        this.orderStatusId = orderStatusId;
        this.customerId = customerId;
        this.movieId = movieId;
        this.paymentDate = paymentDate;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY, generator = "native")
    @Column(name = "ID")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "Order_date")
    public String getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(String orderDate) {
        this.orderDate = orderDate;
    }

    @Basic
    @Column(name = "Comment")
    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    @Basic
    @Column(name = "Order_statusID")
    public int getOrderStatusId() {
        return orderStatusId;
    }

    public void setOrderStatusId(int orderStatusId) {
        this.orderStatusId = orderStatusId;
    }

    @Basic
    @Column(name = "CustomerID")
    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    @Basic
    @Column(name = "MovieID")
    public int getMovieId() {
        return movieId;
    }

    public void setMovieId(int movieId) {
        this.movieId = movieId;
    }

    @Basic
    @Column(name = "payment_date")
    public String getPaymentDate() {
        return paymentDate;
    }

    public void setPaymentDate(String paymentDate) {
        this.paymentDate = paymentDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Order that = (Order) o;
        return id == that.id &&
                orderStatusId == that.orderStatusId &&
                customerId == that.customerId &&
                movieId == that.movieId &&
                Objects.equals(orderDate, that.orderDate) &&
                Objects.equals(comment, that.comment) &&
                Objects.equals(paymentDate, that.paymentDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, orderDate, comment, orderStatusId, customerId, movieId, paymentDate);
    }
}
