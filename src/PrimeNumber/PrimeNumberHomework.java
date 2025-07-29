package PrimeNumber;

import java.util.Scanner;

public class PrimeNumberHomework {
    public static boolean isPrime(int n, int divide) {
        if (n <= 1) return false;                   // 0 ve 1 asal değildir
        if (divide == 1) return true;              // Hiçbir böleni kalmadıysa asal
        if (n % divide == 0) return false;        // bölen bulundu, asal değil
        return isPrime(n, divide - 1);     // bir sonraki böleni dene
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Sayı giriniz: ");
        int n = scanner.nextInt();


        if (isPrime(n, n - 1)) {
            System.out.println(n + " sayısı Asaldır");
        } else {
            System.out.println(n + " sayısı Asal değildir");
        }
    }
}
