import java.util.Scanner;

public class ReverseTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Kullanıcıdan basamak sayısı al
        System.out.println("Üçgenimizin kaç tane basamağı olsun: ");
        int basamak = scanner.nextInt();

        //Satırları kontrol etmek için döngü
        for (int i = basamak; i >= 1; i--) {

            //Yıldızları yazdır
            for (int k = 0; k < 2 * i - 1; k++) {
                System.out.print("*");
            }

            //Her satırdan sonra alt satıra geçiş
            System.out.println();
        }
    }
}
