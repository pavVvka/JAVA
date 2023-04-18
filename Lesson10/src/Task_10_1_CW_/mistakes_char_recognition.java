package Task_10_1_CW_;
// https://www.codewars.com/kata/577bd026df78c19bca0002c0/train/java
import java.util.Arrays;

public class mistakes_char_recognition {
    public static void main(String[] args) {
        System.out.println("rslt: " + correct("sadasd 2wqdd  ew5df 501"));
    }
    public static String correct(String string) {
        return string.replace("5","S").replace("0", "O").replace("1","I");

/*
        char[] s = string.toCharArray();
        System.out.println("s : " + Arrays.toString(s));
        String snew = "";
        for (int i = 0; i < s.length; i++) {
            if(s[i] == '5'){
                s[i] = 'S';
            }
            if (s[i] == '0') {
                s[i] = 'O';
                }
            if(s[i] == '1'){
                s[i] = 'I';
                }
            snew += s[i];
        }
        return snew;
*/
    }

}
