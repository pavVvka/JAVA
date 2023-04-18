import java.util.Arrays;

public class StringTest {
    public static void main(String[] args) {
        String str = "abc";
        char[] data = {'a', 'b', 'c'};
        String str1 = new String(data);

        System.out.println("str " + str);
        System.out.println("str1 " + str1);
        System.out.println("data " + Arrays.toString(data));

        // объявление одномерного массива строк
        String[] array = new String[5];

// заполнение начальными значениями
        array[0] = "abcd";
        array[1] = "Hello";
        array[2] = ""; // пустая строка
        array[3] = "bestprog";
        array[4] = ";:\\+="; // комбинация "\\" заменяется на "\"

// использование в выражениях
        String[] arrayS = new String[5];
        array[4] = array[1] + " " + array[3]; // arrayS[4] = "Hello bestprog"
        array[4] += ".net"; // arrayS[4] = "Hello bestprog.net"
        System.out.println(Arrays.toString(array));

    }
}
