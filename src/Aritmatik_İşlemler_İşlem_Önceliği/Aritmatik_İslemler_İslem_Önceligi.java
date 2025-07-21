import java.util.Scanner;

public class Aritmatik_İşlemler_İşlem_Önceliği {
}
public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    //Kullanıcıdan 3 tane sayı al
    System.out.println("a sayısını giriniz");
    int a = scanner.nextInt();

    System.out.println("b saysını giriniz");
    int b = scanner.nextInt();

    System.out.println("c sayısını giriniz");
    int c = scanner.nextInt();

    //işlem a + b * c - b
    int sonuc = a + b * c - b;

    //Sonuç yazılır
    System.out.println("İşlem Sonucu: " + sonuc);
}






