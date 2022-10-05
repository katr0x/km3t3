import java.util.Scanner;

public class zad11 {
    public static void main(String[] args) {


        Scanner paliwo = new Scanner(System.in);
        System.out.println("Wykorzystane litry paliwa: ");
        Double litry = paliwo.nextDouble();

        Scanner trasa = new Scanner(System.in);
        System.out.println("Długość trasy w kilometrach");
        Double odleglosc = trasa.nextDouble();

        Double spalizna = litry / odleglosc;

        System.out.println("Twoje auto spala  " + spalizna + "\s litrów na kilometr");




    }}