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

public class Menu {

    //Class Level Variables - Protect the data
    private int menuId;
    private String menuItem;

    //Constructor Method
    public Menu(int _menuId, String _menuItem){
        this.menuId = _menuId;
        this.menuItem = _menuItem;
    }

    //Setters and Getters
    public int getmenuId() { return menuId; }
    public void setmenuId(int _menuId) {this.menuId = _menuId;}

    public String getmenuItem() { return menuItem; }
    public void setmenuItem(String _menuItem) {this.menuItem = _menuItem;}

    public static void listMenu(ArrayList<Menu> mList){
        for (Menu menu: mList){
            System.out.println(menu.getmenuId() + "\t" + menu.getmenuItem());
        }
    }
}
