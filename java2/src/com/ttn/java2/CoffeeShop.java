package com.ttn.java2;

import java.util.Queue;

public class CoffeeShop {
}

class Customer {
    private String name;
    private int orderId;
    private double cashPaid;
    private String orderPlaced;
}

class Cashier {

    private Queue<Integer> orderQueue;
    private double paymentReceived;
    private String takesOrder;
    private int orderId;

    void insertInOrderQueue(int orderId) {
        orderQueue.add(orderId);
    }
}

class Barista extends Cashier {
    Queue<Integer> completeOrder;
    int currentOrder = completeOrder.peek();

    void sendNotification(int currentOrder) {

    }}
