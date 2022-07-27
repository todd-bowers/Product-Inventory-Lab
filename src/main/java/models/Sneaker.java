package models;

public class Sneaker {
    private int id;
    private String brand;
    private String model;
    private String sport;
    private double size;
    private int qty;
    private float price;

    public Sneaker(){
    }

    public Sneaker(int id, String brand, String model, String sport, double size, int qty, float price) {
        this.id = id;
        this.brand = brand;
        this.model = model;
        this.sport = sport;
        this.size = size;
        this.qty = qty;
        this.price = price;
    }
    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
    public void setModel(String model) {
        this.model = model;
    }
    public String getModel() {
        return model;
    }

    public String getSport() {
        return sport;
    }

    public void setSport(String sport) {
        this.sport = sport;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
