package Colectii;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<String> listaCumparaturi = new ArrayList<String>();
        listaCumparaturi.add("lapte");
        listaCumparaturi.add("mere");
        System.out.println(listaCumparaturi.size());
        System.out.println(listaCumparaturi);
        listaCumparaturi.add("apa");
        listaCumparaturi.add("banane");
        System.out.println(listaCumparaturi.size());
        System.out.println(listaCumparaturi.indexOf("apa"));
        listaCumparaturi.set(0, "suc");
        System.out.println(listaCumparaturi.get(0));

        for (int i =0; i<listaCumparaturi.size();i++){
            System.out.println(listaCumparaturi.get(i));
        }
        for (String s:listaCumparaturi){
            System.out.println(s);
        }
        List<Integer> listsNumereNorocoase = new ArrayList<Integer>();
        listsNumereNorocoase.add(3);
        listsNumereNorocoase.add(12);
        listsNumereNorocoase.add(72);

    }
}
