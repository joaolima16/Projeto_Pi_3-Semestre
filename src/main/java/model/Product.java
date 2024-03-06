package model;

import ENUM.Category;

public class Product {

    private String name;
    private double unitaryValue;
    private Category category;

    public Product() {

    }

    public Product(String name, double unitaryValue, Category category) {
        this.name = name;
        this.unitaryValue = unitaryValue;
        this.category = category;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getUnitaryValue() {
        return unitaryValue;
    }

    public void setUnitaryValue(double unitaryValue) {
        this.unitaryValue = unitaryValue;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

}
