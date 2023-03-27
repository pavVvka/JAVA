public class L2_HW_2_1 {
    public static void main(String[] args) {
        int a = 3;
        int b = 8;
        String sum = "Сумма:";
        String multiplication = "Умножение:";
        String subtraction = "Вычитание:";
        String division = "Деление дробное:";
        String divisionInt = "Деление целочисленное:";
        String divRemainder = "Остаток от деления:";
        String fraction = "Дробная часть:";

        double i = b;

        System.out.println(sum + (a + b));
        System.out.println(multiplication + a * b);
        System.out.println(subtraction + (a - b));
        System.out.println(divisionInt + (a / b));
        System.out.println("V1. " + division + (a / i));
        System.out.println("V2. " + division + (a * 1.0 / b));
        System.out.println("V3. " + division + (double)a / b); // плохо - означает мы плохо спроектировали



// Остаток от деления

        System.out.println("a mod b = " + a % b);
        System.out.println("a is odd = " + a % 2);
        System.out.println("b is odd = " + b % 2);

        // System.out.println((a / i) - (a / b));
        System.out.println(a - (a / b) * b); // только для a>=b

        //  char
        char ch1 = 33;
        char ch2 = 'a';
        String smile = "Hello \uD83D\uDE0A";

        System.out.println(smile + ch1 + ch2);

    }

    public static boolean isEven(int number) {
        return number % 2 == 0;
    }
}
