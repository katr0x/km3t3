import java.util.Scanner;

public class zad13 {
    public static void main(String[] args) {


    Scanner test1 = new Scanner(System.in);
        System.out.println("Wynik z pierwszego testu w %: ");
    Double wynik1 = test1.nextDouble();

        Scanner test2 = new Scanner(System.in);
        System.out.println("Wynik z drugiego testu w %: ");
        Double wynik2 = test2.nextDouble();

        Scanner test3 = new Scanner(System.in);
        System.out.println("Wynik z trzeciego testu w %: ");
        Double wynik3 = test3.nextDouble();

        Double  srednia = (wynik1 + wynik2 + wynik3)/3;

        System.out.println("\tWynik z pierwszego sprawdzianu to: " + wynik1);
        System.out.println("\t Wynik z drugiego sprawdzianu to: " + wynik2);
        System.out.println("\t Wynik z trzeciego sprawdzianu to: " + wynik3);
        System.out.println("\t Twoja średnia to  " + srednia);

}}
