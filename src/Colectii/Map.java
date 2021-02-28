package Colectii;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class Map {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        HashMap<String, String> map = new HashMap<String, String>();
//        map.put("Zara", "www.zara.ro");
//        map.put("Bershka", "www.bershka.ro");
//        map.put("Link-Academy", "www.link-academy.ro");
//        System.out.println(map);
//
//        for (HashMap.Entry<String, String> map2 : map.entrySet()) {
//            System.out.println(map2.getKey());
//            System.out.println(map2.getValue());
//        }
//        for (String s : map.keySet()) {
//            System.out.println(s);
//
//        }
//        for (String s : map.values()) {
//            System.out.println(s);
//        }
//
//    HashMap<Integer, Person> mapPerson = new HashMap<Integer, Person>();

    //Sa se descrie un HashMap pt tari si capitale-->String
    //Sa se printeze acesta
    //sa se citeasca de la tastatura o tara si daca exista in hashmap=>afisare capitala;

    HashMap<String, String> tariSiCpitale = new HashMap<String, String>();
    tariSiCpitale.put("Anglia", "Londra");
    tariSiCpitale.put("Rusia","Berlin");
    tariSiCpitale.put("China", "Beijing");
    tariSiCpitale.put("Romania", "Bucuresti");
    System.out.println(tariSiCpitale);
    for (java.util.Map.Entry<String, String> map:tariSiCpitale.entrySet()){
        System.out.println("Introduceti tara cautata:");
        String taraCautata = scanner.nextLine();
        if (tariSiCpitale.containsKey(taraCautata)){
            System.out.println("Am gasit tara cautata. Capitala tarii "+ taraCautata +" este " + tariSiCpitale.get(taraCautata));
        }else {
            System.out.println("Nu exista in lista tara cautata");
        }

    }

    }
}