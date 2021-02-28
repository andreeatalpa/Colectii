package Colectii;

import java.util.ArrayList;
import java.util.List;

public class Exercitiu {
    public static void main(String[] args) {

        //lista de animale
        //1. afisati lista
        //2. afisati elementul de pe pozitia 2
        //3. inlocuiti primul animal cu altul si sa printam lista
        //4. verificati dc lista contine elementul caine
        //5. sa se afiseze indexul elementului pisica
        //6. stergeti toata lista

        List<String> animale = new ArrayList<String>();
        animale.add("caine");
        animale.add("pisica");
        animale.add("leu");
        animale.add("girafa");
        animale.add("rinocer");
        for (String a:animale){
            System.out.println(a);
        }
        System.out.println(animale.get(2));
        animale.set(0, "hiena");
        for (String a:animale){
            System.out.println(a);
        }
        animale.contains("caine");
        animale.indexOf("pisica");
        animale.clear();


        List<Integer> numere = new ArrayList<Integer>();
        int min = Integer.MAX_VALUE;
        numere.add(68);
        numere.add(62);
        numere.add(23);
        numere.add(128);
        numere.add(72);
        numere.add(79);
        for (Integer n:numere){
            if (n<min){
                min =n;
            }

        }
        System.out.println(min);



    }
}
