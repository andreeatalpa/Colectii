package ATMProject;

import java.util.HashMap;
import java.util.Scanner;

public class ATM {
    public static Scanner in = new Scanner(System.in);
    public static HashMap<String, String> clienti = new HashMap<String, String>();

    public static void adaugaClient(Client client) {
        clienti.put(client.getUsername(), client.getPassword());
    }


    public static boolean verificareClient(String username, String password) {
        if (clienti.containsKey(username) && !clienti.get(username).equals(password)) {
            System.out.println("Username-ul sau parola este incorecta");
            return false;
        } else if (!clienti.containsKey(username)) {
            System.out.println("Username-ul nu este corect sau nu exista");
            return false;
        } else return true;
    }

}