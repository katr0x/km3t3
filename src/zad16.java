import java.util.Scanner;

public class zad16 {
    public static void main(String[] args) {

Scanner posilek = new Scanner(System.in);
        System.out.println("Podaj cene produktu:");
                Double cena = posilek.nextDouble();

                Double podatek = cena * 0.0675;
                Double podatekicena = podatek + cena;
                Double napiwek = podatekicena * 0.20;
                Double wszystko = cena + podatek + napiwek;

                System.out.println("Cena posiłku: " + cena + "\t Podatek: " + podatek + "\t Napiwek: " + napiwek + "\t Łączna kwota: " + wszystko);

                }}
