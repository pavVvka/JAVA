public class L6_HW_6_1 {
    public static void main(String[] args) {
        // 1
        System.out.println("1) вывести сумму элементов {9, 2, 6, 4, 5, 12, 7, 8, 6}");
        int [] arrow = {9, 2, 6, 4, 5, 12, 7, 8, 6};
        int summ = 0;
        for(int i = 0; i < arrow.length; i++){
            summ += arrow[i];
        }
        System.out.println(summ);

        // 2
        System.out.println("\n2) вывести max {9, 2, 6, 4, 5, 12, 7, 8, 6}");
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < arrow.length; i++){
            if (max < arrow[i]){ max = arrow[i]; }
            if (arrow[i] < min){ min = arrow[i]; }}
        System.out.println("Max = " + max);

        // 3
        System.out.println("\n3) вывести min {9, 2, 6, 4, 5, 12, 7, 8, 6}");
        System.out.println("Min = " + min);

        // 4
        System.out.println("\n4) вывести avr {1, 2, 3, 4, 5, 6, 7, 8, 9}");
        int [] arrow1 = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        double sum_arrow1 = 0;
        for (int i = 0; i < arrow1.length; i++) {
            sum_arrow1 += arrow1[i];
        }
        System.out.println("Avr = " + sum_arrow1 / arrow1.length);

        // 5
        System.out.println("\n5) сумму элементов {{1, 2, 3, 4, 5}, {6, 7, 8, 9}, {-1, -2, -3, -4}, {-5, -6}}");
        summ = 0;
        max = Integer.MIN_VALUE;
        int counter = 0;
        int [][] arrow2 = {{1, 2, 3, 4, 5}, {6, 7, 8, 9}, {-1, -2, -3, -4}, {-5, -6}};
        for (int i = 0; i < arrow2.length; i++){
            counter += arrow2[i].length;
            for (int j = 0; j < arrow2[i].length; j++){
                summ += arrow2[i][j];
                if (arrow2[i][j] > max){
                    max = arrow2[i][j];
                }
            }
        }
        System.out.println("сумма элементов двумерного массива = " + summ);
        // 6
        System.out.println("\n6) Max {{1, 2, 3, 4, 5}, {6, 7, 8, 9}, {-1, -2, -3, -4}, {-5, -6}}");
        System.out.println("Max элемент массива = " + max);

        // 7
        System.out.println("\n7) Количество элементов  {{1, 2, 3, 4, 5}, {6, 7, 8, 9}, {-1, -2, -3, -4}, {-5, -6}}");
        System.out.println("Количество элементов массива = " + counter);

    }
}
