package MagazinOnline;

import Colectii.Person;

import java.util.Comparator;

public class Products implements Comparable<Products> {
    private String productName;
    private int productStock;
    private double productPrice;

    public Products(String denumireProdus, int stocProdus, double pretProdus) {
        this.productName = denumireProdus;
        this.productStock = stocProdus;
        this.productPrice = pretProdus;
    }
    public String toStroing(){
        return productName+  " "+ productStock+ " " + productPrice;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getStocProdus() {
        return productStock;
    }

    public void setStocProdus(int stocProdus) {
        this.productStock = stocProdus;
    }

    public double getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(double productPrice) {
        this.productPrice = productPrice;
    }

    @Override
    public int compareTo(Products p) {
        return getProductName().compareTo(p.getProductName());
    }
}
