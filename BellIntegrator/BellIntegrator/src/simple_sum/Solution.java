package simple_sum;

import java.util.Arrays;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = 1;
        // а если пусто?
        while (n < 3 | n % 2 == 0){
            n = Integer.parseInt(scanner.nextLine()) | n;
        }
//        n = 5;
        int[][] matrix = new int[n][n];
        int r;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                r = (int) (Math.random() * 9) + 1;
                matrix[i][j] = r;
                System.out.print(r + "  ");

            }
            System.out.println();
//            System.out.println(Arrays.toString(matrix[i]));
        }
        int minEl = Integer.MAX_VALUE;

        for (int i = 0; i < n; i++) {
            System.out.print(matrix[i][n - i - 1]);

            if(i != n / 2 & minEl > matrix[i][n - i - 1]){
                minEl = matrix[i][n - i - 1];
            }

        }
        System.out.println();
        System.out.println("minEl= " + minEl);
        System.out.println("middle= " + (n / 2) + " : " + matrix[n / 2][n / 2]);
//        int num = 5;
//        System.out.println("num " + num / 2 + 1);


        System.out.println(n);
        System.out.println(Arrays.deepToString(matrix));

    }
}
