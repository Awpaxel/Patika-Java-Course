package NumberRoundingOptional;

import java.util.Scanner;

public class NumberRounding {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Kullanıcıdan ondalıklı sayı al
        System.out.println("Ondalıklı sayı giriniz: ");

        double doubleNumber = scanner.nextDouble();

        //Yuvarlama metodları

        System.out.println("Rakamınızın yukarıya doğru yuvarlanmış hali: " + Math.ceil(doubleNumber));
        System.out.println("Rakamınızın aşağıya doğru yuvarlanmış hali: " + Math.floor(doubleNumber));
        System.out.println("Rakamınızın en yakın tam sayısı: " + Math.round(doubleNumber));






    }
}
