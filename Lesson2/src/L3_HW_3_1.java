public class L3_HW_3_1 {
    public static void main(String[] args) {
        System.out.println("1. присвоить произвольные значения переменным и вывести строки ");
        int a = 3; int b = 7;
        if (a == b) {
            System.out.println("a == b");
        }  else if (a < b) {
            System.out.println("a < b");
           }  else System.out.println("a > b");

        System.out.println("2. вывести строки ");
        if ((a + b) % 2 == 0){
            System.out.println("maybe a and b are even");
        } else System.out.println("some variable is odd");

        System.out.println("3. вывести строки ");
        int my_number = 41;
        if (my_number > 10){
            System.out.println("> " + my_number + " больше 10");
        }
        if (my_number < 100) {
            System.out.println("> " + my_number + " меньше 100");
        }
        if ((double) my_number / 2 > 20) {
            System.out.println("> " + (double) my_number / 2 + " результат деления на 2 больше 20");
        }
        if (5 <= my_number && my_number <= 40) {
            System.out.println("> " + "значение переменной между 5 и 40 включительно");
        } else System.out.println("> " + "значение переменной меньше 5 или больше 40");
    }
}
