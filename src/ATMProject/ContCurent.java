package ATMProject;

public class ContCurent  extends  Cont {
    private final double rataEur = 4.9;

    public ContCurent(String iban, String valuta) {
        super.setIban(iban);
        super.setAmount(0);
        super.setValuta(valuta);
    }

    public void retragereBani(double suma, String valuta) {
        if (super.getValuta().toLowerCase().equals(valuta.toLowerCase())) {
            super.scadeSuma(suma);
        } else if (valuta.toUpperCase().equals("EUR")) {
            super.scadeSuma(suma * rataEur);
        }

    }

    public void depunereBani(double suma, String valuta) {
        if (super.getValuta().toLowerCase().equals(valuta.toLowerCase())) {
            super.adaugaSuma(suma);
        } else if (valuta.toUpperCase().equals("EUR")) {
            super.adaugaSuma(suma * rataEur);
        }
    }
}
