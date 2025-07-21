package ArraysHomework;

public class MatrixTranspose {
    public static void main(String[] args) {
        // Örnek matris (2x3)
        int[][] matrix = {
                {2, 3, 4},
                {5, 6, 4}
        };

        // Orijinal matrisin boyutları
        int rows = matrix.length;
        int cols = matrix[0].length;

        // Transpoz matrisin oluşturulması (3x2)
        int[][] transpose = new int[cols][rows];

        // Transpoz işlemi: Satır <-> Sütun değişimi
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                transpose[j][i] = matrix[i][j];
            }
        }

        // Orijinal matrisi yazdır
        System.out.println("Matris : ");
        printMatrix(matrix);

        // Transpoz matrisi yazdır
        System.out.println("Transpoze : ");
        printMatrix(transpose);
    }

    // Matris yazdırma fonksiyonu
    public static void printMatrix(int[][] mat) {
        for (int[] row : mat) {
            for (int val : row) {
                System.out.print(val + "    ");
            }
            System.out.println();
        }
    }
}
