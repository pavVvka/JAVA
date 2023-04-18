package Task_10_1_CW_;

import java.util.Arrays;

// https://www.codewars.com/kata/57e76bc428d6fbc2d500036d/train/java
// Write a function to split a string and convert it into an array of words.
public class string_to_array {
    public static void main(String[] args) {
        String txt = "we call him now";
        System.out.println(Arrays.toString(stringToArray(txt)));
        System.out.println(txt.length());

    }
    public static String[] stringToArray(String s) {
        //your code;
//        String[] words = s.split(" ");
//        return words;
        System.out.println(s.split(" ")[1]);
        return s.split(" ");
    }

}