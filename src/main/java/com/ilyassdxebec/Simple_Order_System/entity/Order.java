package com.ilyassdxebec.Simple_Order_System.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.util.Date;
@Entity
@Table (name = "orders")
public class Order {
    @Id
    @GeneratedValue
  private Long OrderId;
  private Date CreationDate;

    public Order() {
    }

    public Order(Date creationDate) {
        CreationDate = creationDate;
    }

    public Long getOrderId() {
        return OrderId;
    }

    public void setOrderId(Long orderId) {
        OrderId = orderId;
    }

    public Date getCreationDate() {
        return CreationDate;
    }

    public void setCreationDate(Date creationDate) {
        CreationDate = creationDate;
    }
}
