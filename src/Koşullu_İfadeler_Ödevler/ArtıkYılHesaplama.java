package Koşullu_İfadeler_Ödevler;

import java.util.Scanner;

public class ArtıkYılHesaplama {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Kullanıcıdan veri al
        System.out.println("Yıl Giriniz : ");
        int yıl = scanner.nextInt();

        if (yıl <=0) {
            System.out.println("Geçersiz yıl girdiniz!");
            return;

        }

        boolean Artıkmı;

                //Artık yıl hesabı (if-else)
        if (yıl % 4 == 0) {
            if (yıl % 100 != 0 || yıl % 400 == 0) {
                Artıkmı = true;
            } else {
                Artıkmı = false;
            }
        } else {
            Artıkmı = false;
        }

        //Switch-case ile bilgi verme
        switch (Artıkmı ? 1 : 0 ) {
            case 1:
                System.out.println(yıl + " bir artık yıldır");
                break;
            case 0:
                System.out.println(yıl + " bir artık yıl değildir");
                break;
            default:
                System.out.println("Bilinmeyen Durum");
        }


    }
}
