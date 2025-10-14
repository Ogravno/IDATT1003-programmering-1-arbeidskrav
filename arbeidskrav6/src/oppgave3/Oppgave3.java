package oppgave3;

import java.util.Arrays;

public class Oppgave3 {
    public static void main(String[] args) {
        int[][] matrix1 = {{5, 0, -2}, {3, 1, 4}};
        Matrix myMatrix = new Matrix(matrix1);

        int[][] matrix2 = {{2,1}, {1, 0}, {2, 4}};

        Matrix newMatrix = myMatrix.multiply(matrix2);
        System.out.println(Arrays.deepToString(newMatrix.getMatrix()));

        int[][] matrix3 = {{4, -3, -8}, {10, 9, -2}};

        Matrix brandNewMatrix = myMatrix.add(matrix3);
        System.out.println(Arrays.deepToString(brandNewMatrix.getMatrix()));

        Matrix superBrandNewMatrix = myMatrix.transpose();
        System.out.println(Arrays.deepToString(superBrandNewMatrix.getMatrix()));
    }
}
