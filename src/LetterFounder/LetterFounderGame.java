package LetterFounder;

import java.util.ArrayList;
import java.util.Scanner;

public class LetterFounderGame {
    static void main() {
        ArrayList<String> harfListesi = new ArrayList<>();
        harfListesi.add("ğ");
        harfListesi.add("h");
        harfListesi.add("x");
        harfListesi.add("ş");

        Scanner input = new Scanner(System.in);
        System.out.println("Harf Giriniz: ");
        String girilenHarf = input.nextLine();

        if (harfListesi.contains(girilenHarf)) {
            int index = harfListesi.indexOf(girilenHarf);
            harfListesi.set(index, "Found");
            System.out.println("Harf bulundu, 'Found' ile değiştirildi.");
        } else {
            harfListesi.add(girilenHarf);
            System.out.println("Harf bulunamadı, listeye eklendi.");
        }
        }
    }
