public class L4_HW {
    public static void main(String[] args) {
        for (int i = 0; i < 16; i++) {
            if (i == 0) System.out.println("Задача №1. Вывести числа от 0 до 15");
            System.out.print(i + "; ");
        }

        System.out.println("\n\nЗадача №2.\nВывести все положительные степени числа 5 " +
                "которые меньше 10000, вывести результат возведения в степень\n\n*** Вариат 1 ***");
        int x = 1;
        for (int i = 5; i < 10000; i = 5 * i) {
//            System.out.println(x + " => " + i);
            if (x % 2 == 0) System.out.println(">>> 5 в степени "+ x + " = " + i);
            x = x + 1;
        }

        System.out.println("\n*** Вариат 2 ***");
        int x1 = 1;
        for (int i = 1; i < 6; i++) {
            x1 = 5 * x1;
//            System.out.println(x1);
            if (i % 2 == 0 && x1 < 10000) System.out.println("> 5 в степени "+ i + " = " + x1);
        }

        System.out.println("\n\nЗадача №3.\nВывести все числа кратные 4 между числами 40 и 60 " +
                "включительно\n\n*** Вариат 1 ***   while + if");
        int num = 40;
        while (num <= 60) {
            if ((num % 4 == 0)) System.out.print(num + ", ");
            num = num + 1;
        }

        System.out.println("\n\n*** Вариат 2 ***  while с шагом 4");
        int num1 = 40;
        while (num1 <= 60) {
            System.out.print(num1 + ", ");
            num1 = num1 + 4;
        }

        System.out.println("\n\n*** Вариат 3 ***  for с шагом 4");
        for (int i = 40; i < 61 ; i = i + 4) {
            System.out.print(i + ", ");
        }
    }
}
