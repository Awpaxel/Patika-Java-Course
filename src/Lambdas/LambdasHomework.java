package Lambdas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LambdasHomework {
    static void main() {
        List<Integer> numbers = new ArrayList<>(Arrays.asList(1,2,3,4,5));

        //Lambda ile elemanların 2'ye çarpımı
        numbers.replaceAll(n -> n*2);

        //Lambda ile method referansı
        numbers.forEach(System.out::println);
    }
}
