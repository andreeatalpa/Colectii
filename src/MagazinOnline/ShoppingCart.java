package MagazinOnline;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;
import java.util.function.ToDoubleFunction;

public class ShoppingCart {
    public static Scanner in = new Scanner(System.in);
    private static ArrayList<Products> productList;

    public static void setProductList(ArrayList<Products> productList) {
        ShoppingCart.productList = productList;
    }

    public ArrayList<Products> getProductList() {
        return productList;
    }

    public void addProduct(Products products) {
        if (getProductList().contains(products)) {
            getProductList().add(products);
        } else {
            System.out.println("The product isn't in the Smart Shop");
        }
    }

    public void removeProduct(Products products) {
        if (getProductList().contains(products)) {
            getProductList().remove(products);
        } else {
            System.out.println("The product isn't in the Smart Shop");
        }
    }
}

