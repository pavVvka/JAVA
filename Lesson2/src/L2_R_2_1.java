public class L2_R_2_1 {
    public static void main(String[] args) {

        System.out.println((char) 0); //
        System.out.println('0' + 1);

        // приведение типов
        // double a = 1.0 * 128;
        char a = '0';
        System.out.println((int) a);  // числовое значение символа char
        System.out.println(a);
        a = '0' + 1;
        System.out.println(a);

        // if else

        a = 2;
        int b = 8;
        if (a > b) {
            System.out.println("'a' больше 'b'");
            System.out.println("остаток от деления = " + a % b);
        } else if (a % b == 2) {
            System.out.println("a % b = " + a % b);
        } else
            {
                System.out.println("'a' меньше 'b'");
            }
        }
    }

