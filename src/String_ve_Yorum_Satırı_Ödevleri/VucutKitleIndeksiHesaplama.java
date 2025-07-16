package String_ve_Yorum_Satırı_Ödevleri;

import java.util.Scanner;

public class VucutKitleIndeksiHesaplama {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Kullanıcıdan boy ve kilo bilgilerini al
        System.out.print("Lütfen boyunuzu (metre cinsinde) giriniz: ");
        double boy = scanner.nextDouble();

        System.out.print("Lütfen kilonuzu giriniz: ");
        double kilo = scanner.nextDouble();

        // Vücut Kitle İndeksi hesaplama
        double vki = kilo / (boy * boy);

        // Sonucu ekrana yazdır
        System.out.println("Vücut Kitle İndeksiniz : " + vki);
    }
}
