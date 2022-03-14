package com.example.phandinhnhat_lab5;

public class Food {
    private String id;
    private String Name;
    private double price;
    private int img;

    public Food(String id, String name, double price, int img) {
        this.id = id;
        Name = name;
        this.price = price;
        this.img = img;
    }

    public Food() {
    }

    @Override
    public String toString() {
        return "Food{" +
                "id='" + id + '\'' +
                ", Name='" + Name + '\'' +
                ", price=" + price +
                ", img=" + img +
                '}';
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        Name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setImg(int img) {
        this.img = img;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return Name;
    }

    public double getPrice() {
        return price;
    }

    public int getImg() {
        return img;
    }
}
