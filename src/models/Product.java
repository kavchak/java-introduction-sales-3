package models;


import base.Fiscal;
import base.Income;

public class Product implements Income, Fiscal {

    private String name;
    private int quantity;
    private double price;

    private static final double TAX_RATE = 0.05;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public double calculateIncome() {
        return quantity * price;
    }

    @Override
    public double calculateTax() {
        return calculateIncome() * TAX_RATE;
    }

    @Override
    public double calculateNetIncome() {
        return calculateIncome() - calculateTax();
    }
}
