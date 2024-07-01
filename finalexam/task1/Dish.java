package finalexam.task1;

import finalexam.task5.CommunicationManager;

public class Dish {
    private String name;
    private String cuisine;
    private int calories;
    private double price;
    private boolean vegetarian;

    public Dish(String name, String cuisine, int calories, double price, boolean vegetarian) {
        this.name = name;
        this.cuisine = cuisine;
        this.calories = calories;
        this.price = price;
        this.vegetarian = vegetarian;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCuisine() {
        return cuisine;
    }

    public void setCuisine(String cuisine) {
        this.cuisine = cuisine;
    }

    public int getCalories() {
        return calories;
    }

    public void setCalories(int calories) {
        this.calories = calories;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean isVegetarian() {
        return vegetarian;
    }

    public void setVegetarian(boolean vegetarian) {
        this.vegetarian = vegetarian;
    }

    @Override
    public String toString() {
        return "Dish [name=" + name + ", cuisine=" + cuisine + ", calories=" + calories + ", price=$" + price
                + ", vegetarian=" + vegetarian + "]";
    }

    public void printDetails() {
        System.out.println("Dish Details:");
        System.out.println("Name: " + name);
        System.out.println("Cuisine: " + cuisine);
        System.out.println("Calories: " + calories);
        System.out.println("Price: $" + price);
        System.out.println("Vegetarian: " + (vegetarian ? "Yes" : "No"));
    }
}

