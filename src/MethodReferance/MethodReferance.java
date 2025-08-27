package MethodReferance;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MethodReferance {
    static void main() {
        List<String> names = new ArrayList<>(Arrays.asList("Ahmet", "Ayşe", "Mehmet", "Zeynep"));

        //Method Referansı ile
        names.forEach(System.out::println);
    }
}
