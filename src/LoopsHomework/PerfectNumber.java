package LoopsHomework;

import java.util.Scanner;

public class PerfectNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bir sayı giriniz; ");
        int sayi = scanner.nextInt();

        int toplam = 0;
        int i = 1;

        while (i < sayi) {
            if (sayi % i == 0) {
                toplam += i;
            }
            i++;
        }

        if (toplam == sayi && sayi !=0) {
            System.out.println(sayi + " Mükemmel sayıdır.");
        } else {
            System.out.println(sayi + " Mükemmel sayı değildir.");
        }

    }
}
