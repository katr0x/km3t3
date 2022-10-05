import java.util.Scanner;
public class zad9 {
    public static void main(String[] args) {

        Scanner imie = new Scanner(System.in);
        System.out.println("Podaj swoje imię:");
        String firstname = imie.nextLine();

        Scanner drugieimie = new Scanner(System.in);
        System.out.println("Podaj swoje drugie imię:");
        String middlename = drugieimie.nextLine();

        Scanner nazwisko = new Scanner(System.in);
        System.out.println("Podaj swoje nazwisko:");
        String lastname = nazwisko.nextLine();

        char firstinitial = firstname.charAt(0);
        char middleInitial = middlename.charAt(0);
        char lastInitial = lastname.charAt(0);


        System.out.println("Twoje pełne imie to: \s" + firstname + "\s" + middlename + "\s" + lastname + "\s a twoje inicjały to \s" + firstinitial  +  middleInitial + lastInitial);
    }}