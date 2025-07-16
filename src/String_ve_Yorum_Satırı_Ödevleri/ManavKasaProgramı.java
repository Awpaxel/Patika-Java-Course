package String_ve_Yorum_Satırı_Ödevleri;

import java.util.Scanner;

public class ManavKasaProgramı {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ürün fiyatları
        double fiyatArmut = 2.14;
        double fiyatElma = 3.67;
        double fiyatDomates = 1.11;
        double fiyatMuz = 0.95;
        double fiyatPatlican = 5.00;

        // Kullanıcıdan her ürün için kilo bilgisi al
        System.out.print("Armut Kaç Kilo? : ");
        double kgArmut = scanner.nextDouble();

        System.out.print("Elma Kaç Kilo? : ");
        double kgElma = scanner.nextDouble();

        System.out.print("Domates Kaç Kilo? : ");
        double kgDomates = scanner.nextDouble();

        System.out.print("Muz Kaç Kilo? : ");
        double kgMuz = scanner.nextDouble();

        System.out.print("Patlıcan Kaç Kilo? : ");
        double kgPatlican = scanner.nextDouble();

        // Toplam tutarı hesapla
        double toplamTutar = (fiyatArmut * kgArmut) +
                (fiyatElma * kgElma) +
                (fiyatDomates * kgDomates) +
                (fiyatMuz * kgMuz) +
                (fiyatPatlican * kgPatlican);

        // Sonucu yazdır
        System.out.printf("Toplam Tutar : %.2f TL%n", toplamTutar);
    }
}
