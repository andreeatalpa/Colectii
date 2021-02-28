package MagazinOnline;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class SmartShop {
    public static Scanner in = new Scanner(System.in);
    public static HashMap<String, String> clienti = new HashMap<String, String>();

    public static void addClient(Client client){
        clienti.put(client.getUsername(), client.getPassword());
    }

    public static boolean verifyClient(Client client){
        if (clienti.containsKey(client) && !clienti.containsValue(client)){
            System.out.println("Password incorrect");
            return false;
        } else if(!clienti.containsKey(client)){
            System.out.println("User doesn't exist");
            return false;
        }return true;
    }

}
