package Enums;

import java.util.Scanner;

public class MainEnumsHomework {
    static void main() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Gün giriniz (Örnek: MONDAY): ");
        String dayInput = scanner.nextLine().toUpperCase(); //Büyük harfe çevireceğiz

        try {
            //Enum'dan gün alınacak
            EnumsHomework day = EnumsHomework.valueOf(dayInput);

            //Alınan günün çalışma saati yazıdırlacak
            System.out.println(day + " günü çalışma saatleri: " + day.getWorkHour());

        }catch (IllegalArgumentException e) {
            System.out.println("Geçersiz gün girdiniz!");
        }
    }
}
