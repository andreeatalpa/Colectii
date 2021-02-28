package Exceptii;

public class OperatiiMath {

    public static void adunare(int x, int y) throws ArithmeticException {
        if (x < 0 || y < 0) {
            throw new ArithmeticException("Exista un numar negativ");
        }
        System.out.println(x + y);

    }

    public static void scadere(int x, int y) throws ArithmeticException {
        if (x - y <0  || y>0) {
            throw new ArithmeticException("Rezultatul este negativ");
        }
        System.out.println(x - y);

    }
}

