package com.onlineRetailOrderManagement.gla;
public class Order {
    int orderId;
    String orderDate;
    Order(int orderId, String orderDate) {
        this.orderId = orderId;
        this.orderDate = orderDate;
    }
    String getOrderStatus() {
        return "Order placed on " + orderDate;
    }
}

// Subclass 1
class ShippedOrder extends Order {
    String trackingNumber;

    ShippedOrder(int orderId, String orderDate, String trackingNumber) {
        super(orderId, orderDate); // Call Order constructor
        this.trackingNumber = trackingNumber;
    }

    @Override
    String getOrderStatus() {
        return "Order " + orderId + " shipped with tracking number: " + trackingNumber;
    }
}

// Subclass 2 (extends ShippedOrder)
class DeliveredOrder extends ShippedOrder {
    String deliveryDate;

    DeliveredOrder(int orderId, String orderDate, String trackingNumber, String deliveryDate) {
        super(orderId, orderDate, trackingNumber); // Call ShippedOrder constructor
        this.deliveryDate = deliveryDate;
    }

    @Override
    String getOrderStatus() {
        return "Order " + orderId + " delivered on " + deliveryDate;
    }
}