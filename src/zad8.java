import java.util.Scanner;
public class zad8 {
    public static void main(String[] args) {
        Scanner nazwa = new Scanner(System.in);
        System.out.println("Podaj swoje imię i nazwisko: ");
        String name = nazwa.nextLine();

        Scanner wiek = new Scanner(System.in);
        System.out.println("Podaj swój wiek ");
        int lata = (int) wiek.nextDouble();
        wiek.nextLine();

        Scanner pieniadz = new Scanner(System.in);
        System.out.println("Ile chcesz zarabiać+");
        int wyplata = (int) pieniadz.nextDouble();
        pieniadz.nextLine();

        System.out.println("Nazywam się " + name + ", Mam: "+
                lata + " lat" +  ", : chce zarabiać : " + wyplata);










    }

}
