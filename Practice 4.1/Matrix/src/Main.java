import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner integ = new Scanner(System.in);
        Scanner str = new Scanner(System.in);
        System.out.print("Введите кол-во строк: ");
        int n = integ.nextInt();
        System.out.print("Введите кол-во столбцов: ");
        int m = integ.nextInt();
        float [][] matrix = new float[n][m];
        int element;
        for (int i = 0; i < n; i++){
            for (int j = 0; j < m; j++){
                System.out.print("Введите ["+ i+"]["+j+"] элемент: ");
                matrix[i][j] = integ.nextFloat();
            }
        }
        Matrix newmatr = new Matrix(matrix, n, m);
        newmatr.plus(matrix, n, m);
        System.out.println(newmatr);
        newmatr.multiplication(2);
        System.out.println(newmatr);
    }
}