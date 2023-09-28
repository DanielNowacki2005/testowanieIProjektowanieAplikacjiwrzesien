package org.example;

public class Item {
    String name,currentLocation,producent;
    int itemID,number,price;

    public Item(String name, String currentLocation, String producent, int itemID, int number, int price) {
        this.name = name;
        this.currentLocation = currentLocation;
        this.producent = producent;
        this.itemID = itemID;
        this.number = number;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCurrentLocation() {
        return currentLocation;
    }

    public void setCurrentLocation(String currentLocation) {
        this.currentLocation = currentLocation;
    }

    public String getProducent() {
        return producent;
    }

    public void setProducent(String producent) {
        this.producent = producent;
    }

    public int getItemID() {
        return itemID;
    }

    public void setItemID(int itemID) {
        this.itemID = itemID;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
    public boolean printNo(){
        System.out.println("No");
        return true;
    }
    public boolean printYes(){
        System.out.println("Yes");
        return true;
    }
    public boolean printIranOutOfIdeas(){
        System.out.println("I ran out of ideas.");
        return true;
    }
}
