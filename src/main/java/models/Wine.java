package models;

public class Wine {
    private int id;
    private String name;
    private String type;
    private int year;
    private int qty;
    private float price;

    public Wine() {
    }
    public Wine(int id, String name, String type, int year, int qty, float price) {
        this.id = id;
        this.name = name;
        this.type = type;
        this.year = year;
        this.qty = qty;
        this.price = price;
    }
    public String toString() {
        String wineDetails = "Name: " + this.getName() + "\n" + "Type: " + this.getType() + "\n" + "Year: " + this.getYear() + "\n" +
                "Qty: " + this.getQty() + "\n" + "Price: " + this.getPrice();
        return wineDetails;
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
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
}
