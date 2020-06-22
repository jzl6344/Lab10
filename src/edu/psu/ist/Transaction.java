/*
Project: Lab 8 Pizza Shop Ordering Syetem
Purpose Details: A text based pizza shop order handling system: show a menu, handle an order with menu items, and accept the transaction payment
Course: IST 242
Author: Joe Oakes
Date Developed: 5/12/2020
Last Date Changed:
Revision: 1
*/
package edu.psu.ist;

import java.util.ArrayList;


enum PaymentType {cash, credit}

public class Transaction {

    private int transactionId;
    private Order order;
    private PaymentType pType;

    //Constructor Method
    public Transaction(int _transactionId, Order _order, PaymentType _pType) {
        this.transactionId = _transactionId;
        this.order = _order;
        this.pType = _pType;
    }

    //Setters and Getters
    public int getTransactionId() {
        return transactionId;
    }


    public void setTransactionId(int _transactionId) {
        this.transactionId = _transactionId;
    }

    public Order getOrder() {
        return order;
    }


    public void setOrder(Order _order) {
        this.order = _order;
    }

    public PaymentType getPaymentType() {
        return pType;
    }


    public void setPaymentType(PaymentType _pType) {
        this.pType = _pType;
    }

    public static void listTransactions(ArrayList<Transaction> tList) {
        for (Transaction trans : tList) {
            System.out.println("Transaction ID: " + trans.getTransactionId());
            System.out.println("Order:" + trans.getOrder().getorderId());
            System.out.println("Payment Type: " + trans.getPaymentType());
        }
    }
}
