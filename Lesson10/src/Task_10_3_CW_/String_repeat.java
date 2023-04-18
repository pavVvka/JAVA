package Task_10_3_CW_;
// https://www.codewars.com/kata/57a0e5c372292dd76d000d7e/train/java
public class String_repeat {
    public static void main(String[] args) {
        String s = "|asdasa|";
        int n = 3;
        System.out.println(repeatStr(n, s));

    }
    public static String repeatStr(final int repeat, final String string) {
        String result = "";
        for (int i = 0; i < repeat; i++) {
            result += string;
        }
        return result;
    }
}
