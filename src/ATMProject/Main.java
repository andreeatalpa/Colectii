package ATMProject;

import java.util.Scanner;

public class Main {
    public static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        Client client1 = new Client("Ilie", "Mircea", "182453617234", "m82", "2020");
        ContCurent cont1 = new ContCurent("123445", "RON");
        client1.adaugaCont(cont1);
        Scanner in = new Scanner(System.in);

        ATM.adaugaClient(client1);

        while (true) {
            System.out.println("Introduceti username-ul si parola: ");
            String username = in.nextLine();
            String password = in.nextLine();
            ATM.verificareClient(username, password);
            if (ATM.verificareClient(username, password)) {
                System.out.println("Bine ai venit la ATM");
            while (true){
                System.out.println("Alege o optiune");
                System.out.println("1.Retragere \n" +
                        "2.Depunere \n" +
                        "3.Afisare sold");
                int optiune = in.nextInt();
                switch (optiune) {
                    case 1:
                        System.out.println("Introdu suma si valuta pentru retragere");
                        double sumaRetragere = in.nextDouble();
                        String valutaRetragere = in.next();
                        if (cont1.getAmount()<sumaRetragere){
                            System.out.println("Fonduri insuficiente");
                        }else
                        {client1.getContList().get(0).retragereBani(sumaRetragere, valutaRetragere);}
                        break;
                    case 2:
                        System.out.println("Introdu suma si valuta pentru depunere");
                        double sumaDepunere = in.nextDouble();
                        String valutaDepunere = in.next();
                        client1.getContList().get(0).depunereBani(sumaDepunere, valutaDepunere);
                        break;
                    case 3:
                        System.out.println("Soldul dvs este: " );
                        System.out.println(client1.getContList().get(0).getAmount() + " "+client1.getContList().get(0).getValuta() );
                        break;
                    default:
                        System.out.println("Optiune invalida");
                }
            }

            } else {
                System.out.println("Reincearca");

            }
        }
    }
//    private static void retragere(){
//        System.out.println("Introdu suma si valuta pentru retragere");
//        double sumaRetragere = in.nextDouble();
//        String valutaRetragere = in.nextLine();
//        client1.getContList().get(0).retragereBani(sumaRetragere,valutaRetragere);
//
//    }
}
//  TEMA MODIFICARE CONT CURENT --> CONT CU LISTA DE TIPURI DE CONT