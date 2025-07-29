package MultiplicationTable;

import java.util.Scanner;

public class MultiplicationTableHomework {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("1 ile 10 arasında bir rakam giriniz:");
        int n = scanner.nextInt();

        if (n < 1 || n > 10) {
            System.out.println("Hatalı giriş lütfen tekrar deneyiniz");
            return;
        }
        System.out.println("\n" + n + " x " + n + " çarpım tablosu:");
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.printf("%4d", i * j); // hizalama için %4d
            }
            System.out.println();
        }
    }
}
