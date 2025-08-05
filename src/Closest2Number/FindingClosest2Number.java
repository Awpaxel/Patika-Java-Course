package Closest2Number;

import java.util.ArrayList;
import java.util.Collections;

public class FindingClosest2Number {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(12);
        list.add(20);
        list.add(28);
        list.add(30);
        list.add(15);
        list.add(1);
        list.add(16);
        list.add(40);
        list.add(3);

        Collections.sort(list);
        System.out.println(list); //Sıralı listeyi görmek için

        int minFark = Integer.MAX_VALUE; // Başlangıç için en büyük değer
        int ilkSayı= 0,ikinciSayi = 0;

        for (int i = 0; i < list.size() - 1; i++) {
            int fark = list.get(i + 1) - list.get(i);

            if (fark < minFark) {
                minFark = fark;
                ilkSayı = list.get(i);
                ikinciSayi = list.get(i + 1);
            }
        }
        System.out.println("En yakın sayılar: " + ilkSayı + " ve " + ikinciSayi);
        System.out.println("Aralarındaki Fark: " + minFark);

    }
}
