package controllers;

import models.Product;
import views.SalesView;
import utils.Rounder;

public class ProductController {

    Product model;
    SalesView view;

    public ProductController(Product model, SalesView view) {
        this.model = model;
        this.view = view;
    }

    public void runApp() {

        view.getInputs();

        String productName = model.getName();

        double income = model.calculateIncome();
        double tax = model.calculateTax();
        double netIncome = model.calculateNetIncome();

        double incomeRound = Rounder.round(income);
        double taxRound = Rounder.round(tax);
        double netIncomeRound = Rounder.round(netIncome);

        String output = "Product name: " + productName + "\n" +
                "Total income (UAH): " + incomeRound + "\n" +
                "Tax amount (UAH): " + taxRound + "\n" +
                "Net income (UAH): " + netIncomeRound;

        view.getOutput(output);
    }
}
