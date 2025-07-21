import java.util.Scanner;

public class CastingPracticeHomework {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Kullanıcıdan tam sayı al
        System.out.println("Tam sayı giriniz: ");
        int intNumber = scanner.nextInt();

        //Kullanıcıdan ondalıklı sayı al
        System.out.println("Ondalıklı sayı giriniz:");
        double doubleNumber = scanner.nextDouble();

        //Dönüştürme
        double intToDouble = (double) intNumber;

        int doubleToInt = (int) doubleNumber;


        //Sonuçların yazdırılması
        System.out.println("Girdiğiniz tam sayı: " + intNumber);
        System.out.println("Girdiğiniz tam sayının ondalıklı hali: " + intToDouble);

        System.out.println("Girdiğiniz ondalıklı sayı: " + doubleNumber);
        System.out.println("Girdiğiniz ondalıklı sayının tam sayı hali: " + doubleToInt);

        scanner.close();

    }
}
