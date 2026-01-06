package com.ilyassdxebec.Simple_Order_System.entity;

import jakarta.persistence.*;

@Entity
public class OrderItem {
    @Id
    @GeneratedValue
    private Long OrderItemId;

    @ManyToOne
    @JoinColumn (name = "ProductId")
    private Product product;

    @ManyToOne
    @JoinColumn (name = "OrderId")
    private Order order;

    private int quantity;

    public Long getOrderItemId() {
        return OrderItemId;
    }

    public void setOrderItemId(Long orderItemId) {
        OrderItemId = orderItemId;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public OrderItem() {
    }

    public OrderItem(Product product, Order order, int quantity) {
        this.product = product;
        this.order = order;
        this.quantity = quantity;
    }
}
