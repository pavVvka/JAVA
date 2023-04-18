package Task_10_1_CW_;
// https://www.codewars.com/kata/5a00e05cc374cb34d100000d/train/java
import java.util.Arrays;

public class Reversed_sequence {
    public static void main(String[] args) {
        int n = 5;
        System.out.println(Arrays.toString(reverse(n)));

    }
    public static int[] reverse(int n){
        //your code
        int[] rev = new int[n];
        for (int i = 0; i < n; i++) {
            rev[i] = n - i;
            System.out.println("i = " + i);
        }
        return rev;
    }

}
