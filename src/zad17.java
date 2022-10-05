import java.util.Scanner;

public class zad17 {
    public static void main(String[] args) {

        Double iloscakcji = 600.0;
        Double cena = 21.77;
        Double zaplacone = 600 * 21.77;
        Double prowizja = zaplacone * 0.02;
        Double koszty = prowizja + zaplacone;

        System.out.println("Cena kupionych akcji = " + zaplacone);
        System.out.println("Cena prowizji =" + prowizja);
        System.out.println("Cena za wszystko = " + koszty);


    }}
