package Exceptii;

public class Masina {
    private static int nrUsi;
    private static String model;
    private static double motor;
    private String anFabricatie;


    public static int getNrUsi() {
        return nrUsi;
    }

    public static String getModel() {
        return model;
    }

    public static double getMotor() {
        return motor;
    }

    public static void setNrUsi(int nrUsi) {
        Masina.nrUsi = nrUsi;
    }

    public static void setModel(String model) {
        Masina.model = model;
    }

    public static void setMotor(double motor) {
        Masina.motor = motor;
    }

    public void setAnFabricatie(String anFabricatie) {
        this.anFabricatie = anFabricatie;
    }

    public String getAnFabricatie() {
        return anFabricatie;

    }
}