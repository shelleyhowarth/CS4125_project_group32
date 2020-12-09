package com.example.cs4125_project;

public class Shoe implements Product {
    public String name;
    public double price;
    public String size;
    public int quantity;
    public String brand;
    public String colour;
    public String style;
    public String imageURL;

    Shoe(String name, double price, String size, int quantity, String brand, String colour, String style, String imageURL){
        this.name = name;
        this.price = price;
        this.size = size;
        this.quantity = quantity;
        this.brand = brand;
        this.colour = colour;
        this.style = style;
        this.imageURL = imageURL;
    }

    Shoe(){

    }

    public String getName(){
        return name;
    }

    public double getPrice(){
        return price;
    }

    public String getSize(){
        return size;
    }

    public int getQuantity(){
        return quantity;
    }

    public String getBrand(){
        return brand;
    }

    public String getColour(){
        return colour;
    }

    public String getStyle(){
        return style;
    }

    public String getImageURL(){
        return imageURL;
    }

}