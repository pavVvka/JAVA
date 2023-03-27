public class L6_square_matrix_diag {
    public static void main(String[] args) {
        // квадратная матрица по НЕчётной переменной >=3.
        // найти мин элемент побочной диагонали без элемента на пересечении диагоналей
        int n = 5;
        int [][] mx = new int[n][n];
        int count = Integer.MAX_VALUE;

        for (int i = 0; i < n ; i++) {
            for (int j = 0; j < n ; j++) {
                mx [i][j] = (int)(Math.random() * (n + 1));
            }
            if (i != n - 1 - i & mx[i][n - 1 - i] < count) {
                count = mx[i][n - 1 - i];
            }
        }

        System.out.println("Распечатаем матрицу mx:" + mx);
        for (int i = 0; i < mx.length; i++) {
            for (int j = 0; j < mx[i].length; j++) {
                System.out.print(mx[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("MIN = " + count);


    }

}
