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

import java.util.*;

public class Order {
    //Class Level Variables - Protect the data
    private int orderId;
    private Customer cust;
    private ArrayList<Menu> menuItem;
    private static ArrayList<Order> orderList = new ArrayList<>();

    //Constructor Method
    public Order(int _orderId) {
        this.orderId = _orderId;
    }

    public static void addOrders(Order order1, Customer customer, ArrayList<Menu> cMenu) {
    }

    //Setters and Getters
    public int getorderId() {
        return orderId;
    }

    public void setorderId(int _orderId) {
        this.orderId = _orderId;
    }

    public static void addOrders(Order order, Customer customer, ArrayList<Menu> mList, ArrayList<Order> oList){
        order.setorderId(order.getorderId());
        order.setCust(customer);
        order.setMenuItem(mList);
        order.setCust(customer);
        orderList.add(order);
        System.out.println("\nOrder added with order ID : " + order.getorderId());
        System.out.println("\nWith Menu : ");
        for(Menu menu : mList){
            System.out.println(menu.getmenuItem());
        }
        System.out.println("\nCustomer Name : " + order.getCust().getCustomerName()
                + ", Customer ID : " + order.getCust().getCustomerId());
    }

    public ArrayList<Menu> getMenuItem() {
        return menuItem;
    }

    public void setMenuItem(ArrayList<Menu> menuItem) {
        this.menuItem = menuItem;
    }

    public Customer getCust() {
        return cust;
    }

    public void setCust(Customer cust) {
        this.cust = cust;
    }
}
