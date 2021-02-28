package Exceptii;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
//                List<String> listaTari = new ArrayList<String>();
//        listaTari.add("Romania");
//        listaTari.add("Italia");
//        listaTari.add("Germania");
//        listaTari.add("Franta");
//        //citeste de la tastatura cel putin 3 caractere si cauta mai departe stringul in lista de tari
//        //afiseaza toate tarile ce contin acele caractere
//        Scanner in = new Scanner(System.in);
//        String cautare = in.nextLine();
//        try {
//            Operatiuni.searchWord(listaTari, cautare);
//        } catch (CuvantCautarePreaScurtException e){
//            System.out.println(e.getMessage());
//        }


//EXERCITIU CLASA
        //definiti o clasa care sa implementeze operatii cu nr nat pozitive
        //operatiile vor avea exceptii
        //1.pt adunare se vor primi doi parametrii
        //daca unul din cei doi parametrii este negativ, se va intoarce o exceptie
        //2.pentru scadere, primul parametru va fi pozitiv, al doilea negativ iar rezultatul
        //trebuie sa fie intotdeauna mai mare ca 0, altfel se va arunca o exceptie
        try {
            OperatiiMath.adunare(2, -2);
        } catch (ArithmeticException e){
            System.out.println(e.getMessage());
        }
        try {
            OperatiiMath.scadere(7,1);
        } catch (ArithmeticException e){
            System.out.println(e.getMessage());
        }


    }
}
