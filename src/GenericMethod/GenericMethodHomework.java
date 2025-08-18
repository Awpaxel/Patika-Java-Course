package GenericMethod;

public class GenericMethodHomework {
    public static <T> void printArray(T[] array) {
        for (T element : array) {
            System.out.print(element +" ");
        }
        System.out.println(); //Satır sonu için
    }

    static void main() {
        Integer[] intArray = {1,2,3,4,5};
        String[] strArray = {"Java" ,"Generics", "Homework"};

        printArray(intArray);
        printArray(strArray);
    }
}
