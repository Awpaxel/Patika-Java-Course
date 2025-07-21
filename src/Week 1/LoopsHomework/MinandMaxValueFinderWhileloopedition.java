import java.util.Scanner;

public class MinandMaxValueFinderWhileloopedition {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Kaç tane sayı gireceksiniz");
        int n = scanner.nextInt();

        int i = 1;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        while (i <= n) {
            System.out.print(i + ". Sayıyı giriniz: ");
            int sayi =scanner.nextInt();

            if (sayi > max) max = sayi;
            if (sayi < min) min = sayi;

            i++;
        }
        System.out.println("En büyük sayı: " + max);
        System.out.println("En küçük sayı: " + min);
    }
}
