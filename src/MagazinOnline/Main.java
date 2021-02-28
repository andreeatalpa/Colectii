package MagazinOnline;

import java.util.*;


public class Main {
    public static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {

        ArrayList<Products> productList = new ArrayList<Products>();
        productList.add(new Products("Telefon", 10, 1999.99));
        productList.add(new Products("Laptop", 5, 2333.89));
        productList.add(new Products("Aspirator", 7, 679.39));
        productList.add(new Products("Frigider", 12, 1311.98));

        System.out.println("Sort by product name");
        Collections.sort(productList);




        for (Products i: productList){
            System.out.println("Product name: " + i.getProductName());
            System.out.println("Product price: " + i.getProductPrice());
            System.out.println("Products in stock: " + i.getStocProdus());
            System.out.println();
        }



        Client client = new Client("Bianca", "bianca92", "2021");
        Client client1 = new Client("Ioan", "ioan20", "2020");
        SmartShop.addClient(client);
        SmartShop.addClient(client1);
        System.out.println(SmartShop.clienti);






    }
}
