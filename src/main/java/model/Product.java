package model;

import ENUM.Category;

public class Product {

    private String name;
    private double unitaryValue;
    private int stock;
    private Category category;
    private String imgUrl;

    public Product() {

    }

    public Product(String name, double unitaryValue, int stock, Category category, String imgUrl) {
        this.name = name;
        this.unitaryValue = unitaryValue;
        this.category = category;
        this.stock = stock;
        this.imgUrl = imgUrl;
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

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }
}
