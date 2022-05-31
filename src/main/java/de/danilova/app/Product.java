package de.danilova.app;

public class Product {

    private  int id;
    private String title;
    private float cost;

    public Product(int id, String title, float cost) {
        this.id = id;
        this.title = title;
        this.cost = cost;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public float getCost() {
        return cost;
    }

    @Override
    public String toString() {
        return   new StringBuilder().append(id).append(" ").append(title).append(" ").append(cost).toString();

    }
}
