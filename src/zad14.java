import java.util.Scanner;

public class zad14 {
    public static void main(String[] args) {
    Scanner plytka = new Scanner(System.in);
        System.out.println("Cena plytek: ");
    Double cena = plytka.nextDouble();

    Double zysk = cena * 0.4;
        System.out.println("Cały zysk z sprzedanych płytek: " + zysk    );


}
}
