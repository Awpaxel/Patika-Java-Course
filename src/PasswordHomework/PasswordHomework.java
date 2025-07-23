package PasswordHomework;

import java.util.Scanner;

public class PasswordHomework {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Lütfen şifrenizi giriniz: ");
        String sifre = scanner.nextLine();

        if (sifreGecerliMi(sifre)) {
            System.out.println("Geçerli Şifre");
        } else {
            System.out.println("Geçersiz Şifre");
        }
    }

    public static boolean sifreGecerliMi(String sifre) {
        // 1- En az 8 karakter kontrolü
        if (sifre.length() < 8) {
            return false;
        }

        // 2- Boşluk karakteri içermemeli
        if (sifre.contains(" ")) {
            return false;
        }

        // 3- İlk harf büyük olmalı
        if (sifre.isEmpty() || !Character.isUpperCase(sifre.charAt(0))) {
            return false;
        }

        // 4- Son karakter '?' olmalı
        if (sifre.charAt(sifre.length() - 1) != '?') {
            return false;
        }

        // Tüm kontroller başarılı ise
        return true;
    }
}
