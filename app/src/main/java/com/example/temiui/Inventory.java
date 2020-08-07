package com.example.temiui;

public class Inventory {
    public String name;
    public String shape;
    public String color;
    public String size;
    public String weight;
    public String generalizedName;
    public String brand;

    public Inventory(String name, String shape, String color, String size, String weight,
                     String generalizedName, String brand){
        this.name = name;
        this.shape = shape;
        this.color = color;
        this.size = size;
        this.weight = weight;
        this.generalizedName = generalizedName;
        this.brand = brand;
    }

    public Inventory(){

    }

    public String getBrand() {
        return brand;
    }

    public String getColor() {
        return color;
    }

    public String getGeneralizedName() {
        return generalizedName;
    }

    public String getName() {
        return name;
    }

    public String getShape() {
        return shape;
    }

    public String getSize() {
        return size;
    }

    public String getWeight() {
        return weight;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setGeneralizedName(String generalizedName) {
        this.generalizedName = generalizedName;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setShape(String shape) {
        this.shape = shape;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

}
