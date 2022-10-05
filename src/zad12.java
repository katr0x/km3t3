import java.util.Scanner;

public class zad12 {
    public static void main(String[] args) {
        int Porcja = 4;
        int kalorie = 300;

        Scanner ciasteczka = new Scanner(System.in);
        System.out.println("Ilość ciasteczek");
        Double kcal = ciasteczka.nextDouble();

        Double kalorycznosc = 300 / 4 * kcal;

        System.out.println(kcal + "\s ciasteczek ma \s" + kalorycznosc + "kcal");



}}
