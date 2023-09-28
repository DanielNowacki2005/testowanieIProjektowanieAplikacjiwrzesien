package org.example;

public class Orders {
    int userId,itemId,orderId,number;
    float price,time;

    public Orders(int userId, int itemId, int orderId, int number, float price, float time) {
        this.userId = userId;
        this.itemId = itemId;
        this.orderId = orderId;
        this.number = number;
        this.price = price;
        this.time = time;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getItemId() {
        return itemId;
    }

    public void setItemId(int itemId) {
        this.itemId = itemId;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public float getTime() {
        return time;
    }

    public void setTime(float time) {
        this.time = time;
    }
    public boolean printIluminati(){
        System.out.println(" ^");
        System.out.println("/ |");
        System.out.println("___");
        return true;
    }
    public boolean printSquare(){
        System.out.println(" -----");
        System.out.println("|     |");
        System.out.println("|     |");
        System.out.println(" -----");
        return true;
    }
    public boolean addTime1(){
        setTime(getTime()+1);
        return  true;
    }
}
