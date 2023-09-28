package org.example;

import javax.imageio.plugins.tiff.GeoTIFFTagSet;

public class Customer {
    private String name,secondName,adress,phoneNumber,accountName;
    float wallet;
    int userId;
    boolean isActive;
    public Customer(String name, String secondName, String adress, String phoneNumber, String accountName, float wallet, int userId ,boolean isActive) {
        this.name = name;
        this.secondName = secondName;
        this.adress = adress;
        this.phoneNumber = phoneNumber;
        this.accountName = accountName;
        this.wallet = wallet;
        this.userId = userId;
        this.isActive = isActive;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public float getWallet() {
        return wallet;
    }

    public void setWallet(float wallet) {
        this.wallet = wallet;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }
    public Orders createOrder(int userId, int itemId, int orderId, int number, float price, float time){
        Orders orderName = new Orders(userId,itemId,orderId,number, price,time);
        return orderName;
    }
    public void addMoney5(){
        setWallet(getWallet()+5);
    }

    public void consumeMoney5(){
        setWallet(getWallet()-5);
    }
    public void activate(){
        isActive = true;
    }
}
