import java.util.Scanner;

public class zad10 {
    public static void main(String[] args) {

        Scanner produkt = new Scanner(System.in);
        System.out.println("Podaj cene produktu:");
        Double cena = produkt.nextDouble();

        double stan = cena * 0.04;
        double lokal = cena * 0.02;
        double wszystko = lokal + stan + cena;

        System.out.println("Cena produktu:  " + cena + "\n Podatek stanowy:  " +  stan + "\n Podatek lokalny:  " + lokal + "Całkowita cena:  " + wszystko);


}}
