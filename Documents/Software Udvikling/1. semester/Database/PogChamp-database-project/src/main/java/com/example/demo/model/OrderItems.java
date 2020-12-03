package com.example.demo.model;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "order_items", schema = "PogChamp", catalog = "")
public class OrderItems {
    private int id;
    private int quantity;
    private int paymentMethodId;
    private int orderId;

    public OrderItems() {
    }

    public OrderItems(int id, int quantity, int paymentMethodId, int orderId) {
        this.id = id;
        this.quantity = quantity;
        this.paymentMethodId = paymentMethodId;
        this.orderId = orderId;
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
    @Column(name = "Quantity")
    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Basic
    @Column(name = "Payment_methodID")
    public int getPaymentMethodId() {
        return paymentMethodId;
    }

    public void setPaymentMethodId(int paymentMethodId) {
        this.paymentMethodId = paymentMethodId;
    }

    @Basic
    @Column(name = "OrderID")
    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        OrderItems that = (OrderItems) o;
        return id == that.id &&
                quantity == that.quantity &&
                paymentMethodId == that.paymentMethodId &&
                orderId == that.orderId;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, quantity, paymentMethodId, orderId);
    }
}
