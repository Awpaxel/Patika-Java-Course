package LoopsHomework;

import java.sql.SQLOutput;
import java.util.Scanner;

public class MinandMaxValueFinder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for (int i = 1; i <= n; i++) {
            System.out.print(i + ". Sayıyı giriniz: ");
            int sayi = scanner.nextInt();

            if (sayi > max) {
                max = sayi;

            }
            if (sayi < min ) {
                min = sayi;
            }
        }

        System.out.println("En Büyük Sayı: " + max);
        System.out.println("En Küçük Sayı: " + min);
    }
}
