package LetterFrequency;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class LetterFrequencyHomework {
    static void main() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Kelimeyi giriniz: ");
        String kelime = scanner.nextLine().toLowerCase(); //Küçük harflere çevirme yöntemi

        System.out.println("Girilen kelime (küçük harf): " + kelime);

        kelime = kelime.replaceAll("[^a-z]", "");

        System.out.println("Sadece harfler: " + kelime);

        Map<Character, Integer> frekans = new HashMap<>();

        for (char harf : kelime.toCharArray()) {
            frekans.put(harf, frekans.getOrDefault(harf,0) + 1);
        }
        for (Map.Entry<Character, Integer> entry : frekans.entrySet()) {
            System.out.println(entry.getKey() + " = " + entry.getValue());
        }
    }
}
