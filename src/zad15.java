import java.util.Scanner;

public class zad15 {
    public static void main(String[] args) {


        Scanner ulub = new Scanner(System.in);
        System.out.println("Wpisz swoje ulubione miasto:");
        String miasto = ulub.nextLine();

        char firstinitial = miasto.charAt(0);
        String male = miasto.toLowerCase();
        int dlugosc = miasto.length();

        System.out.println("Ulubione miasto: " + miasto);
        System.out.println("inicjał: " + firstinitial);
        System.out.println("Liczba liter: " + dlugosc);
        System.out.println(male);




}
}
