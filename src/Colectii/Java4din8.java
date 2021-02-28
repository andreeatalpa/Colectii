package Colectii;

import java.util.*;

public class Java4din8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        ArrayList<String> listString = new ArrayList<String>();
//        listString.add("test");
//        listString.add("test2");
//
//        for (int i = 0; i < listString.size(); i++) {
//            System.out.println(listString.get(i));
//        }
//        Iterator<String> iterator = listString.iterator();
//        while (iterator.hasNext()) {
//            String str = iterator.next();
//            System.out.println(iterator.next());
//        }
//        List<Person> listaPersoane = new ArrayList<Person>();
//        Person person1 = new Person();
//        person1.name = "Andreea";
//        person1.age = 23;
//        Person person2 = new Person();
//        person2.name = "Camelia";
//        listaPersoane.add(person1);
//        listaPersoane.add(person2);
//        System.out.println(listaPersoane);
//        for (Person p : listaPersoane) {
//            System.out.println(p);

        //creati 5 obiecte de tip Student
        //adaugati in lista
        //afisati cu o iteratie
//        StudentJ4din8 s1 = new StudentJ4din8();
//        StudentJ4din8 s2 = new StudentJ4din8();
//        StudentJ4din8 s3 = new StudentJ4din8();
//        StudentJ4din8 s4 = new StudentJ4din8();
//        StudentJ4din8 s5 = new StudentJ4din8();
//        s1.nume = "Toma";
//        s1.prenume = "Andrei";
//        s2.nume = "Popescu";
//        s2.prenume = "Mircea";
//        s3.nume = "Ignat";
//        s3.prenume = "Alin";
//        s4.nume = "Trifan";
//        s4.prenume = "Elisabeta";
//        s5.nume = "Ilie";
//        s5.prenume = "Bogdan";
//
//        ArrayList<StudentJ4din8> studenti = new ArrayList<StudentJ4din8>();
//        studenti.add(s1);
//        studenti.add(s2);
//        studenti.add(s3);
//        studenti.add(s4);
//        studenti.add(s5);
//        System.out.println(studenti);
//        Iterator<StudentJ4din8> stud = studenti.iterator();
//        System.out.println();
//        while (stud.hasNext()) {
//            System.out.println(stud.next().prenume);
//            List<Integer> listaNumere = new ArrayList<Integer>();
//            listaNumere.add(2);
//            listaNumere.add(32);
//            listaNumere.add(74);
//            listaNumere.add(11);
//            listaNumere.add(28);
//            System.out.println(listaNumere);
//
//            Collections.sort(listaNumere);
//            System.out.println(listaNumere);
//            Collections.sort(listaNumere, Collections.reverseOrder());
//            System.out.println(listaNumere);
//            Collections.sort(listaNumere);
//
//            Collections.sort(listaPersoane, Person.compareByName);
//            System.out.println(listaPersoane);
//            person1.age = 20;
//            person2.age =10;
//            Collections.sort(listaPersoane, Person.compareByAge);
//            System.out.println(listaPersoane);
//
//
//        }
//        HashSet<String> hashSet = new HashSet<String>();
//        hashSet.add("Andreea");
//        hashSet.add("Adelina");
//        System.out.println(hashSet);
//        hashSet.add("Matei");
//        System.out.println(hashSet);
//        hashSet.add("Viorel");
//        hashSet.add("Diana");
//        System.out.println(hashSet);
//        HashSet<Integer> setNrIntr = new HashSet<Integer>();
//        setNrIntr.add(2);
//        setNrIntr.add(4);
//        setNrIntr.add(44);
//        setNrIntr.add(41);
//        System.out.println(setNrIntr);
//        HashSet<Person> setPersoane = new HashSet<Person>();
//        Person p1 = new Person();
//        Person p2 = new Person();
//        p1.age = 10;;
//        p2.age = 21;
//        p2.name ="Ioana";
//        p1.name = "Andrei";
//        setPersoane.add(p1);
//        setPersoane.add(p2);
//        System.out.println(setPersoane);


        //Sa se creeze un hashSet cu nume de orase
        //Sa se printeze mesajul "am gasit orasul" +numeOras daca elementul se afla in lista';
        //daca nu se afla in lista, sa se afiseze un mesaj corespunzator
        //sa se afiseze hashSetul
        //sa se stearga toate elementele

        HashSet<String> numeOrase = new HashSet<String>();
        numeOrase.add("Barcelona");
        numeOrase.add("Timisoara");
        numeOrase.add("Beijing");
        numeOrase.add("Londra");
        Iterator<String> iterator = numeOrase.iterator();

//        for (String i: numeOrase){
//            if (iterator.hasNext()) {
//                System.out.println("Am gasit orasul " + iterator.next());
//            } else {
//                System.out.println("Nu exista niciun oras de vizitat");
//            }
//
//        }
        for (int i = 0; i < numeOrase.size(); i++) {
            System.out.println("Introduceti orasul cautat");
            String orasCautat = scanner.nextLine();
            if (numeOrase.contains(orasCautat)) {
                System.out.println("Am gasit orasul " + orasCautat);
            } else {
                System.out.println("Nu exista acest oras");
            }

        }
    }
}