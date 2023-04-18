package simple_sum;

import java.util.Scanner;

public class input {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = 1;
        // а если пусто?
//        while (n < 3 | n % 2 == 0){
//            n = Integer.parseInt(scanner.nextLine());
        while (n < 3 | n % 2 == 0){
            try {
                    n = Integer.parseInt(scanner.nextLine());
                } catch (NumberFormatException e) {
                System.out.println("Введите целое нечётное число > 2");
            }

        System.out.println("N = " + n);
      }

    }
}

