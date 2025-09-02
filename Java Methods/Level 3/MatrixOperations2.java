import java.util.*;

public class MatrixOperations2 {
    public static double[][] createRandomMatrix(int rows, int cols) {
        double[][] matrix = new double[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = (int)(Math.random() * 10); // random values 0–9
            }
        }
        return matrix;
    }
    public static double[][] transpose(double[][] matrix) {
        int rows = matrix.length, cols = matrix[0].length;
        double[][] result = new double[cols][rows];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[j][i] = matrix[i][j];
            }
        }
        return result;
    }
    public static double determinant2x2(double[][] m) {
        return m[0][0] * m[1][1] - m[0][1] * m[1][0];
    }
    public static double determinant3x3(double[][] m) {
        return m[0][0] * (m[1][1] * m[2][2] - m[1][2] * m[2][1])
                - m[0][1] * (m[1][0] * m[2][2] - m[1][2] * m[2][0])
                + m[0][2] * (m[1][0] * m[2][1] - m[1][1] * m[2][0]);
    }
    public static double[][] inverse2x2(double[][] m) {
        double det = determinant2x2(m);
        if (det == 0) return null;
        double[][] inv = new double[2][2];
        inv[0][0] = m[1][1] / det;
        inv[0][1] = -m[0][1] / det;
        inv[1][0] = -m[1][0] / det;
        inv[1][1] = m[0][0] / det;
        return inv;
    }
    public static double[][] inverse3x3(double[][] m) {
        double det = determinant3x3(m);
        if (det == 0) return null;
        double[][] inv = new double[3][3];
        inv[0][0] =  (m[1][1] * m[2][2] - m[1][2] * m[2][1]) / det;
        inv[0][1] = -(m[0][1] * m[2][2] - m[0][2] * m[2][1]) / det;
        inv[0][2] =  (m[0][1] * m[1][2] - m[0][2] * m[1][1]) / det;
        inv[1][0] = -(m[1][0] * m[2][2] - m[1][2] * m[2][0]) / det;
        inv[1][1] =  (m[0][0] * m[2][2] - m[0][2] * m[2][0]) / det;
        inv[1][2] = -(m[0][0] * m[1][2] - m[0][2] * m[1][0]) / det;
        inv[2][0] =  (m[1][0] * m[2][1] - m[1][1] * m[2][0]) / det;
        inv[2][1] = -(m[0][0] * m[2][1] - m[0][1] * m[2][0]) / det;
        inv[2][2] =  (m[0][0] * m[1][1] - m[0][1] * m[1][0]) / det;
        return inv;
    }
    public static void printMatrix(double[][] matrix) {
        for (double[] row : matrix) {
            for (double val : row) {
                System.out.printf("%8.3f", val);
            }
            System.out.println();
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double[][] matrix = createRandomMatrix(n, n);
        System.out.println("Matrix:");
        printMatrix(matrix);
        System.out.println("Transpose:");
        printMatrix(transpose(matrix));
        if (n == 2) {
            double det = determinant2x2(matrix);
            System.out.println("Determinant: " + det);
            double[][] inv = inverse2x2(matrix);
            if (inv != null) {
                System.out.println("Inverse:");
                printMatrix(inv);
            } else {
                System.out.println("Matrix is singular, no inverse");
            }
        } else if (n == 3) {
            double det = determinant3x3(matrix);
            System.out.println("Determinant: " + det);
            double[][] inv = inverse3x3(matrix);
            if (inv != null) {
                System.out.println("Inverse:");
                printMatrix(inv);
            } else {
                System.out.println("Matrix is singular, no inverse");
            }
        } else {
            System.out.println("Determinant and inverse only implemented for 2x2 and 3x3");
        }
    }
}
